package com.qf.lesson.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.qf.lesson.Book;

/*
 * XML: Extensible Markup Language 可扩展标记语言。
 *    设计的宗旨是传输数据，而非显示数据。
 *    xml标签是用户自己定义的，没有被预定义
 * 用途：
 *   1 作为应用的配置文件。譬如web.xml
 *   2 作为通用的数据交换格式。譬如web服务提供的接口
 *   3 简单的数据存储。
 * 特点：
 *   1 严格区分大小写
 *   2 开始和结束标签必须成对出现
 *   3 必须遵守语法格式
 * 要求：
 *   1 文档声明是必须的。包含version版本  encoding是字符编码声明
 *   2 标签元素可以嵌套，但是必须合法的嵌套。不允许交差嵌套
 *   3 所有xml文件必须且只能有一个根标签，其他标签都是子标签或孙标签
 *   4 xml中所有的空格和换行，都被认为是标签的内容
 *  元素的命名规则：
 *     1 严格区分大小写
 2 不能使用数字 和"_"下划线开头
 3 不能使用xml（或XML Xml等）开始
 4 不能包含空格
 5 名称中间不能包含:号
 实体引用：
 >: &gt;
 <: &lt;
 &: &amp;
 ': &apos;
 ": &quot;
 解析方式：
 1 SAX解析：使用事件方式解析xml
   步骤：
   1 创建SAXParser解析器对象,使用SAXParserFactory工厂类的.newSAXParser()获得。加载xml文件，和处理器对象进行关联
   2 创建Handler实现类DefaultHandler的子类，用来处理xml文件的。
   3 使用SAXParser对象的parse()方法，传入xml文件对象和处理器对象。
 SAXParser类中方法：
    parse()：把xml文件和处理器对象进行关联。
 DefaultHandler类中方法：
    startDocument():读取前导区时候触发的事件。通常做对象集合的初始化。
    startElement():读取元素开始标签时候触发的事件，通常做对象的初始化和属性的获取操作
    characters():读取数据元素时候触发的事件，通常是具体的属性值。注意标签中的空格也会被读取处理，需要过滤掉。
    endElement():读取元素结束标签时触发的事件，通常是对象设值结束，需要添加到对象集合中。
    endDocument():读取文档结束触发的事件。通常用作清理工作：释放连接  释放系统资源等等
 2 PULL解析：使用事件常量解析xml
    
 3 DOM解析：把xml完全转换成DOM树在内存中解析。

 *    
 */
public class TestXmlSax {

	public static void main(String[] args) {
		List<Book> books = null;
		try {
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			books = new ArrayList<Book>();
			MyHandler handler = new MyHandler(books);
			parser.parse(new File("Books.xml"), handler);
		} catch (ParserConfigurationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        for(Book b:books){
        	System.out.println(b);
        }
	}

	
}

class MyHandler extends DefaultHandler {
	private List<Book> books;
	
	//上一个节点的名字，目的是便于知晓文本所属的节点。
    private String preName;
    //定义对象变量，startElement()和endElement()使用
    private Book book;
	public MyHandler(List<Book> books) {
		this.books = books;
	}
	//当解析程序读取xml文件前导区时候触发的事件：通常做初始化工作，例如初始化List集合对象
	@Override
	public void startDocument() throws SAXException {
		// TODO 自动生成的方法存根
		super.startDocument();
	}
	/*
	 * 当解析程序读取开始标签时候触发的事件：通常做对象的初始话工作。例如创建一个对象；
	 * qName代表当前节点名称
     * Attributes代表当前节点所有属性对象 
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if(qName.equals("book")){
			book = new Book();			
			book.setType(attributes.getValue(0));
		}
//		else if(qName.equals("id")){
//			
//		}
		preName = qName;//把当前解析的节点名字赋给全局变量。
	}		
		
	/*
	 * 读取文本数据时候触发的事件
	 * ch[] :读取文本的字符数组
	 * start：开始位置
	 * length: 字符数组长度
	 */
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		//结果字符串
		String result = new String(ch,start,length);
		if (preName !=null){
		if(preName.equals("id")){
			book.setId(Integer.valueOf(result));
		}
		else if(preName.equals("name")){
			book.setName(result);
		}
		else if(preName.equals("price")){
			book.setPrice(Double.valueOf(result));
		}
		}
	}
	/*
	 * 解析程序读取结束标签时候触发的方法
	 * qName： 当前结束节点的名字
	 */
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("book")){
			books.add(book);
			book = null;
		}
		preName = null;
	}
	
}
