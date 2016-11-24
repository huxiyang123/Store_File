package practice;

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
 * ��web��������ȡxml�ļ�Ȼ�����
 *  1 ��ȡxml�ļ�
 *  2 xml�ļ�����
 */
public class TestXMLFromServer {

	public static void main(String[] args) {
		String path= "http://10.12.152.55:8080/first/InfoServlet";
		InputStream xmlStream = getXml(path);
        List<Student> sList = new ArrayList<>();
		try {
			SAXParser  parser = SAXParserFactory.newInstance().newSAXParser();
			CustomHandler handler = new CustomHandler(sList);
			parser.parse(xmlStream, handler);
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
		for(Student s:sList){
			System.out.println(s);
		}
	}
	//��ȡweb�е�xml�ļ�I/O��
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return is;
	}

}
class CustomHandler extends DefaultHandler{
    private List<Student> sList;
    private String preName;//ǰһ����ǩֵ
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
