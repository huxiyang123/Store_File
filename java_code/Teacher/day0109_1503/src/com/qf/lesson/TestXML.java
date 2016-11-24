package com.qf.lesson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestXML {
  public static void main(String[] args) {
	 MyHandler handler = null;
	try {
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		 handler = new MyHandler();
		 parser.parse("Students.xml", handler);
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
	  
	 System.out.println(handler.getsList());
  }
}
class MyHandler extends DefaultHandler{
	private List<Student> sList;
	private String preTag = null;
    private Student st;
    
    private List<Course> cList = null;
    private Course c;
	public List<Student> getsList() {
		return sList;
	}

	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
	
	@Override
	public void startDocument() throws SAXException {
		sList = new ArrayList<>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if(qName.equals("student")){
			st = new Student();
		}	
		else if(qName.equals("courses")){
			cList = new ArrayList<Course>();
		}
		else if(qName.equals("course")){
			c = new Course();
		}
		preTag = qName;
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(preTag!=null){
			String temp = new String(ch,start,length);
			if(preTag.equals("sid")){
				st.setSid(Integer.valueOf(temp));
			}
			else if(preTag.equals("sname")){
				st.setSname(temp);
			}
			else if(preTag.equals("sex")){
				st.setSex(temp);
			}
			else if(preTag.equals("cid")){
				c.setCid(Integer.valueOf(temp));
			}
			else if(preTag.equals("cname")){
				c.setCname(temp);
			}
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("course")){
			cList.add(c);
			c = null;
		}
		else if(qName.equals("courses")){
			st.setCourses(cList);
			cList = null;
		}
		else if(qName.equals("student")){
			sList.add(st);
			st = null;
		}
		preTag = null;;
	}
	
 }