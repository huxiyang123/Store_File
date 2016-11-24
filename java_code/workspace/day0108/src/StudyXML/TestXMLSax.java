package StudyXML;

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


/*
 * XML: Extensible Markup Language ����չ������ԡ�
 *    ��Ƶ���ּ�Ǵ������ݣ�������ʾ���ݡ�
 *    xml��ǩ���û��Լ�����ģ�û�б�Ԥ����
 * ��;��
 *   1 ��ΪӦ�õ������ļ���Ʃ��web.xml
 *   2 ��Ϊͨ�õ����ݽ�����ʽ��Ʃ��web�����ṩ�Ľӿ�
 *   3 �򵥵����ݴ洢��
 * �ص㣺
 *   1 �ϸ����ִ�Сд
 *   2 ��ʼ�ͽ�����ǩ����ɶԳ���
 *   3 ���������﷨��ʽ
 * Ҫ��
 *   1 �ĵ������Ǳ���ġ�����version�汾  encoding���ַ���������
 *   2 ��ǩԪ�ؿ���Ƕ�ף����Ǳ���Ϸ���Ƕ�ס�����������Ƕ��
 *   3 ����xml�ļ�������ֻ����һ������ǩ��������ǩ�����ӱ�ǩ�����ǩ
 *   4 xml�����еĿո�ͻ��У�������Ϊ�Ǳ�ǩ������
 *  Ԫ�ص���������
 *     1 �ϸ����ִ�Сд
 2 ����ʹ������ ��"_"�»��߿�ͷ
 3 ����ʹ��xml����XML Xml�ȣ���ʼ
 4 ���ܰ����ո�
 5 �����м䲻�ܰ���:��
 ʵ�����ã�
 >: &gt;
 <: &lt;
 &: &amp;
 ': &apos;
 ": &quot;
 ������ʽ��
 1 SAX������ʹ���¼���ʽ����xml
   ���裺
   1 ����SAXParser����������,ʹ��SAXParserFactory�������.newSAXParser()��á�����xml�ļ����ʹ�����������й���
   2 ����Handlerʵ����DefaultHandler�����࣬��������xml�ļ��ġ�
   3 ʹ��SAXParser�����parse()����������xml�ļ�����ʹ���������
 SAXParser���з�����
    parse()����xml�ļ��ʹ�����������й�����
 DefaultHandler���з�����
    startDocument():��ȡǰ����ʱ�򴥷����¼���ͨ�������󼯺ϵĳ�ʼ����
    startElement():��ȡԪ�ؿ�ʼ��ǩʱ�򴥷����¼���ͨ��������ĳ�ʼ�������ԵĻ�ȡ����
    characters():��ȡ����Ԫ��ʱ�򴥷����¼���ͨ���Ǿ��������ֵ��ע���ǩ�еĿո�Ҳ�ᱻ��ȡ��������Ҫ���˵���
    endElement():��ȡԪ�ؽ�����ǩʱ�������¼���ͨ���Ƕ�����ֵ��������Ҫ���ӵ����󼯺��С�
    endDocument():��ȡ�ĵ������������¼���ͨ�����������������ͷ�����  �ͷ�ϵͳ��Դ�ȵ�
 2 PULL������ʹ���¼���������xml
    
 3 DOM��������xml��ȫת����DOM�����ڴ��н�����

 *    
 */
public class TestXMLSax {

	public static void main(String[] args) {
		List<Book> books = null;
		try {
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			books = new ArrayList<Book>();
			MyHandler handler = new MyHandler(books);
			parser.parse(new File("Books.xml"), handler);
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
        for(Book b:books){
        	System.out.println(b);
        }
	}

	
}

class MyHandler extends DefaultHandler {
	private List<Book> books;
	
	//��һ���ڵ�����֣�Ŀ���Ǳ���֪���ı������Ľڵ㡣
    private String preName;
    //������������startElement()��endElement()ʹ��
    private Book book;
	public MyHandler(List<Book> books) {
		this.books = books;
	}
	//�����������ȡxml�ļ�ǰ����ʱ�򴥷����¼���ͨ������ʼ�������������ʼ��List���϶���
	@Override
	public void startDocument() throws SAXException {
		// TODO �Զ����ɵķ������
		super.startDocument();
	}
	/*
	 * �����������ȡ��ʼ��ǩʱ�򴥷����¼���ͨ��������ĳ�ʼ�����������紴��һ������
	 * qName������ǰ�ڵ�����
     * Attributes������ǰ�ڵ��������Զ��� 
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
		preName = qName;//�ѵ�ǰ�����Ľڵ����ָ���ȫ�ֱ�����
	}		
	
	/*
	 * ��ȡ�ı�����ʱ�򴥷����¼�
	 * ch[] :��ȡ�ı����ַ�����
	 * start����ʼλ��
	 * length: �ַ����鳤��
	 */
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		//����ַ���
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
	 * ���������ȡ������ǩʱ�򴥷��ķ���
	 * qName�� ��ǰ�����ڵ������
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