package com.qf.lesson.xml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.qf.lesson.Book;

/*
 * Pull: 使用事件常量解析。Android默认解析方法
 *   XmlPullParser:pull解析器
 *     setInput(Reader fr)：加载xml文件
 *    XmlPullParser.START_DOCUMENT:加载前导区返回的常量值0
 *    XmlPullParser.END_DOCUMENT:xml结束返回的常量1
 *    XmlPullParser.START_TAG:加载开始标签返回的常量2
 *    XmlPullParser.END_TAG:加载结束标签返回的常量3
 *  解析步骤：
 *    1 创建XmlPullParser解析器对象
 *    2 使用setInput()加载xml文件
 *    3 在while循环判断解析是否到达文件的结尾:需要每次更新事件常量
 *    
 */
public class TestXMLPull {

	public static void main(String[] args) {
		// 集合及对象声明
		List<Book> list = null;
		try {
			XmlPullParser parser = XmlPullParserFactory.newInstance()
					.newPullParser();
			parser.setInput(new FileReader("Books.xml"));
		
			Book book = null;
			// 定义事件的处理常量
			int type = parser.getEventType();
			while (type != XmlPullParser.END_DOCUMENT) {
				// 当前标签名
				String tagName = parser.getName();
				switch (type) {
				case XmlPullParser.START_TAG:
					if (tagName.equals("books")) {
						list = new ArrayList<Book>();
					} else if (tagName.equals("book")) {
						book = new Book();
						// 获取对应位置属性的值并设置到对象中
						book.setType(parser.getAttributeValue(0));
					} else if (tagName.equals("id")) {
						// 指针向前移动一位
						parser.next();
						book.setId(Integer.valueOf(parser.getText()));
					} else if (tagName.equals("name")) {
						// 指针向前移动一位
						parser.next();
						book.setName(parser.getText());
					} else if (tagName.equals("price")) {
						// 指针向前移动一位
						parser.next();
						book.setPrice(Double.valueOf(parser.getText()));
					}
					break;

				case XmlPullParser.END_TAG:
					if (tagName.equals("book")) {
						list.add(book);
						book = null;
					}
					break;

				}
				// 每次需要更新事件类型常量
				type = parser.next();
			}
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		for(Book b:list){
			System.out.println(b);
		}
	}
}
