package StudyXML;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/*
 * Pull:使用事件常量解析，Android默认解析方法，自带的。
 * 	XMLPullParser：pull解析器。
 * 		setInput(FileReader fr):加载xml文件
 *  XMLPullParser.START_DOCUMENT (0)
 *  XmlPullParser.START_TAG(2)
	XmlPullParser.END_TAG(3)
	XmlPullParser.END_DOCUMENT(1)
   解析步骤：
   	1 创建XmlPullParser解析器对象；
   	2 使用setInput（）加载xml文件
   	3 在while循环判断解析是否到达的结尾
 */
public class TestXMLPull {

	public static void main(String[] args) {
		List<Book> list = null;
		Book book = null;
		try {
			XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
			parser.setInput(new FileReader("Books.xml"));
			//集合申明
			int type = parser.getEventType();
			while(type!=XmlPullParser.END_DOCUMENT){
				String tagname = parser.getName();
				switch(type){
				case XmlPullParser.START_TAG:
					if(tagname.equals("books")){
						 list = new ArrayList<Book>();
					}
					else if(tagname.equals("book")){
						book = new Book();
						//获取对应位置属性的值
						book.setType(parser.getAttributeValue(0));
					}
					else if(tagname.equals("id")){
						
						//指针向前移动一位
						parser.next();
						book.setId(Integer.valueOf(parser.getText()));
					}
					else if(tagname.equals("name")){
						//指针向下移动一位
						parser.next();
						book.setName(parser.getText());
					}
					else if(tagname.equals("price")){
						//指针向下移动一位
						parser.next();
						book.setPrice(Double.valueOf(parser.getText()));
					}   
					break;
				case XmlPullParser.END_TAG:
					if(tagname.equals("book")){
						
						list.add(book);
						book = null;
					}
					break;	
				}
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
