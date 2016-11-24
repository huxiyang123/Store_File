package com.qf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test
{

	public static void main(String[] args)
	{
		try
		{
			copy("icon_idea.gif", "icon_idea1.gif");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void copy(String fromPath, String toPath) throws Exception
	{
		FileInputStream fis = null;
		OutputStream os = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		StringBuffer sb = new StringBuffer();

		File file = new File(fromPath.toString());
//		System.out.println("file:" + file.length());//file:25624
		if (file.exists() && file.isFile())
		{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

			byte[] b = new byte[1024];
			int len = -1;
//			int count = 0;
			while ((len = bis.read(b)) != -1)
			{
				sb.append(new String(b, 0, len));
//				count += len;
			}

//			System.out.println("count:" + count);//count:25624
//			System.out.println("sb.toString():" + sb.toString().length());//sb.toString():19282
			os = new FileOutputStream(toPath);
			bos = new BufferedOutputStream(os);
			byte[] temp = sb.toString().getBytes();
//			System.out.println("output:" + temp.length);//output:25585
			bos.write(temp);
			bos.flush();

			bos.close();
			os.close();
			bis.close();
			fis.close();
		}

	}

}
