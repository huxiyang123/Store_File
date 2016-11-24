package com.s.jiemian_newsapp.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import com.s.jiemian_newsapp.adapter.TechnologyAdapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;

/**
 * Created by lenovo on 2016/3/29.
 */
public class FileUtils {

    private static String CACHE_DIR = null;

    public static boolean checkDir() {

        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }


    public static void initCacheDir(Context context) {
        if (CACHE_DIR != null) {
            return;
        }
        if (!checkDir()) {
            CACHE_DIR = context.getCacheDir() + "/boundary/images";
        } else {
            CACHE_DIR = Environment.getExternalStorageDirectory() + "/boundary/images";
        }
    }

    public static void saveImage(String url, Bitmap bitmap) {

        File dir = new File(CACHE_DIR);
        if (!dir.exists()) {
            dir.mkdirs();

            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(dir, getFileName(url))));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static Bitmap getImage(String url) {
        File file = new File(CACHE_DIR, getFileName(url));
        if (file.exists()) {
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        }

        return null;
    }

    public static String getFileName(String url) {
        return url.substring(url.lastIndexOf("/") + 1);
    }

    private static android.os.Handler mHandler = new android.os.Handler();

    private static void clearCache(final Runnable runnable) {
        new Thread() {
            @Override
            public void run() {
                File dir = new File(CACHE_DIR);

                for (File file : dir.listFiles()) {
                    if (file.exists()) {
                        file.delete();
                    }

                }
                mHandler.post(runnable);
            }
        }.start();
    }

    public static String getTotalCacheSize(Context context) throws Exception {
        long cacheSize = getFolderSize(context.getCacheDir());
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            cacheSize = cacheSize + getFolderSize(context.getExternalCacheDir());
        }

        return getFormatSize(cacheSize);
    }

    public static void clearAllCache(Context context) {
        deleteDir(context.getCacheDir());
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            deleteDir(context.getExternalCacheDir());
        }
    }

    private static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    public static long getFolderSize(File file) throws Exception {
        long size = 0;
        try {
            File[] fileList = file.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isDirectory()) {
                    size = size + getFolderSize(fileList[i]);
                } else {
                    size = size + fileList[i].length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return size;
    }

    public static String getFormatSize(double size) {
        double kiloByte = size / 1024;
        if (kiloByte < 1) {
            return "ok";
        }

        double megaByte = kiloByte / 1024;
        if (megaByte < 1) {
            BigDecimal result1 = new BigDecimal(Double.toString(kiloByte));
            return result1.setScale(2, BigDecimal.ROUND_HALF_UP).toString() + "KB";
        }

        double gigaByte = megaByte / 1024;
        if (gigaByte < 1) {
            BigDecimal result2 = new BigDecimal(Double.toString(megaByte));
            return result2.setScale(2, BigDecimal.ROUND_HALF_UP).toString() + "MB";
        }

        double teraByte = gigaByte / 1024;
        if (teraByte < 1) {
            BigDecimal result3 = new BigDecimal(Double.toString(gigaByte));
            return result3.setScale(2, BigDecimal.ROUND_HALF_UP).toString() + "GB";
        }

        BigDecimal result4 = new BigDecimal(teraByte);
        return result4.setScale(2, BigDecimal.ROUND_HALF_UP).toString() + "TB";
    }
}
