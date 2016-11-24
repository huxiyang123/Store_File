package homework;

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

public class TestStudentXMLSAX {

	public static void main(String[] args) {
		List<StudentXML> students = null;

		try {
	/*
	 *  步骤1 创建SAXParser解析器对象,使用SAXParserFactory工厂类的.newSAXParser()获得。
	 *   加载xml文件，和处理器对象进行关联
	*/
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			students = new ArrayList<StudentXML>();
		// 步骤2 创建Handler实现类DefaultHandler的子类，用来处理xml文件的。	
			MyHandler handler = new MyHandler(students);
		//步骤3 使用SAXParser对象的parse()方法，传入xml文件对象和处理器对象。
			parser.parse(new File("StudentXML.xml"), handler);
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
		for (StudentXML b : students) {

			System.out.println(b);
		}		
	}
}

class MyHandler extends DefaultHandler {
	private List<StudentXML> students;

	private String preName;

	private StudentXML student;

	private List<Course> courses;
	private Course course;

	public MyHandler(List<StudentXML> students) {
		this.students = students;

	}

	@Override
	public void startDocument() throws SAXException {
		// TODO 自动生成的方法存根
		super.startDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.equals("student")) {
			student = new StudentXML();
			courses = new ArrayList<>();
		}
		if (qName.equals("course")) {
			course = new Course();
		}
		preName = qName;// 把当前解析的节点名字赋给全局变量。
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {

		String result = new String(ch, start, length);
		if (preName != null) {
			if (preName.equals("sid")) {
				student.setSid(Integer.valueOf(result));
			} else if (preName.equals("sname")) {
				student.setSname(result);

			} else if (preName.equals("sex")) {
				student.setSex(result);
			} else if (preName.equals("cid")) {
				course.setCid(Integer.valueOf(result));
			} else if (preName.equals("cname")) {
				course.setCname(result);
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equals("student")) {
			student.setCourse(courses);
			students.add(student);
			student = null;
			
		}
		if(qName.equals("course")){
			courses.add(course);
			
		}
		preName = null;
	}
}
