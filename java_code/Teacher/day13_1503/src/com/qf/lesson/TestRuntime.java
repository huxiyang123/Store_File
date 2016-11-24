package com.qf.lesson;

import java.io.IOException;

/*
 * Runtime:
 *   java程序的运行时环境，每个程序都有一个与之关联的Runtime实例，应用程序通过该对象与运行时环境相连。
 *   方法：
 *    1 getRuntime():返回当前程序的Runtime实例
 *    2 exec(String command):执行当前操作系统中的命令
 *    3 availableProcessors():和JVM相关的系统信息，获取可用处理器数目
 */
public class TestRuntime {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		
        try {
			r.exec("calc.exe");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        
        System.out.println(r.availableProcessors());
	}

}
