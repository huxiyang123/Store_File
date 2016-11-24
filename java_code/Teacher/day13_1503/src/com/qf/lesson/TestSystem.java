package com.qf.lesson;

import java.util.Properties;

/*
 * System:系统相关的类
 *  方法：
 *    1 currentTimeMillis()： 返回以毫秒为单位的当前时间。
 *    2 exit(int statusCode):终止当前运行的JVM
 *    3 setProperty(String key,String value):设置键key对应的值
 *    4 getProperty(String key):获取系统中键为key的属性值
 */
public class TestSystem {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();		
		int[] as = {2,3,6,8,4,7,9};
		
		int [] ts = new int[5];
		
		System.arraycopy(as, 2, ts, 0, 5);
		
       for(int t=0;t<1000;t++){
    	   System.out.print(t+" ");
       }
       
       Properties props = System.getProperties();
       String str = props.getProperty("java.vm.name");
       System.out.println(str);
       
       System.setProperty("test", "hello");
       
       
       long end = System.currentTimeMillis();
       System.out.println(end-begin);
       
       System.out.println(System.getProperty("test"));
	}

}
