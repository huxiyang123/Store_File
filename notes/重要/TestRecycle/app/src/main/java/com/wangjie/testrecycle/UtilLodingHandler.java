package com.wangjie.testrecycle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UtilLodingHandler {
	// 创建 一个可重复使用的线程池，如果没有可以重复的线程，该线程池会创建一个新的线程让其使用
	private static ExecutorService executors = Executors.newCachedThreadPool();

	public interface OngetJsonListener {
		public void getJson (byte[]  data);
	}

	public interface OnBitmapLitener {
		public void getImg(Bitmap bitmap, String imgUrl);
	}

	public static void 	getJsonData(final String path, final Handler handler, final OngetJsonListener listener) {
		executors.execute(new Runnable() {

			@Override
			public void run() {
				InputStream is = null;
				ByteArrayOutputStream os = null;
				try {
					URL url = new URL(path);
					Log.d("wj", "===path" + path);
					HttpURLConnection con = (HttpURLConnection) url
							.openConnection();
					con.connect();
					Log.d("wj", "===connect");

					if (con.getResponseCode() == 200) {
						is = con.getInputStream();
						os = new ByteArrayOutputStream();
						int len = 0;
						byte a[] = new byte[1024];
						while ((len = is.read(a)) != -1) {
							os.write(a, 0, len);
						}
						os.flush();
						final byte[] info = os.toByteArray();

						if (info != null) {
							handler.post(new Runnable() {

								public void run() {
									listener.getJson(info);
								}
							});
						}
					}
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (os != null) {
						try {
							os.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if (is != null) {
						try {
							is.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
	}

	public static void BitmapLoding(final String path, final Handler handler,
			final ImageView iv) {
		executors.execute(new Runnable() {

			public void run() {
				InputStream is = null;
				try {
					URL url = new URL(path);
					HttpURLConnection con = (HttpURLConnection) url
							.openConnection();
					con.connect();
					if (con.getResponseCode() == 200) {
						is = con.getInputStream();
						final Bitmap bitmap = BitmapFactory.decodeStream(is);
						handler.post(new Runnable() {

							@Override
							public void run() {
								// litener.getImg(bitmap,imgUrl);
								if (iv != null) {
									String tag = (String) iv.getTag();
									if (tag != null && tag.equals(path)) {
										iv.setImageBitmap(bitmap);
										Log.d("wj","tag:"+tag);
									}
								}
							}

						});
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (is != null) {
						try {
							is.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

			}
		});
	}
}
