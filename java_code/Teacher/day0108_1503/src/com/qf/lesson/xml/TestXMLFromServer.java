package com.qf.lesson.xml;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * 从web服务器获取xml文件然后解析
 *  1 获取xml文件
 *  2 xml文件解析
 */
public class TestXMLFromServer {

	public static void main(String[] args) {
		String path= "http://localhost:8080/first/InfoServlet";
		InputStream xmlStream = getXml(path);
        List<Student> sList = new ArrayList<>();
		try {
			SAXParser  parser = SAXParserFactory.newInstance().newSAXParser();
			CustomHandler handler = new CustomHandler(sList);
			parser.parse(xmlStream, handler);
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
		for(Student s:sList){
			System.out.println(s);
		}
	}
	//获取web中的xml文件I/O流
	public static InputStream getXml(String path){
		InputStream is = null;
		try {
			URL url = new URL(path);
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.setRequestMethod("GET");
			if(huc.getResponseCode() == HttpURLConnection.HTTP_OK){
				is = huc.getInputStream();
			}
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return is;
	}

}
class CustomHandler extends DefaultHandler{
    private List<Student> sList;
    private String preName;//前一个标签值
    private Student student;
	public CustomHandler(List<Student> sList) {
		this.sList = sList;
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if(qName.equals("student")){
			student = new Student();
			student.setNo(Integer.valueOf(attributes.getValue(0)));
		}
		preName = qName;
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		
		if(preName!=null){
			String temp = new String(ch,start,length);
			if(preName.equals("name")){
				student.setName(temp);
			}
			else if(preName.equals("sex")){
				student.setSex(temp);
			}
			else if(preName.equals("age")){
				student.setAge(Integer.valueOf(temp));
			}
			else if(preName.equals("country")){
				student.setCountry(temp);
			}
			
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("student")){
			sList.add(student);
			student = null;
		}
		preName = null;
	}
	
}
