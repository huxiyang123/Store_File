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
	 *  ����1 ����SAXParser����������,ʹ��SAXParserFactory�������.newSAXParser()��á�
	 *   ����xml�ļ����ʹ�����������й���
	*/
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			students = new ArrayList<StudentXML>();
		// ����2 ����Handlerʵ����DefaultHandler�����࣬��������xml�ļ��ġ�	
			MyHandler handler = new MyHandler(students);
		//����3 ʹ��SAXParser�����parse()����������xml�ļ�����ʹ���������
			parser.parse(new File("StudentXML.xml"), handler);
		} catch (ParserConfigurationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
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
		// TODO �Զ����ɵķ������
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
		preName = qName;// �ѵ�ǰ�����Ľڵ����ָ���ȫ�ֱ�����
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
