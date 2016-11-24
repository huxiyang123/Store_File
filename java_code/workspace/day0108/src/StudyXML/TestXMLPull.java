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
 * Pull:ʹ���¼�����������AndroidĬ�Ͻ����������Դ��ġ�
 * 	XMLPullParser��pull��������
 * 		setInput(FileReader fr):����xml�ļ�
 *  XMLPullParser.START_DOCUMENT (0)
 *  XmlPullParser.START_TAG(2)
	XmlPullParser.END_TAG(3)
	XmlPullParser.END_DOCUMENT(1)
   �������裺
   	1 ����XmlPullParser����������
   	2 ʹ��setInput��������xml�ļ�
   	3 ��whileѭ���жϽ����Ƿ񵽴�Ľ�β
 */
public class TestXMLPull {

	public static void main(String[] args) {
		List<Book> list = null;
		Book book = null;
		try {
			XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
			parser.setInput(new FileReader("Books.xml"));
			//��������
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
						//��ȡ��Ӧλ�����Ե�ֵ
						book.setType(parser.getAttributeValue(0));
					}
					else if(tagname.equals("id")){
						
						//ָ����ǰ�ƶ�һλ
						parser.next();
						book.setId(Integer.valueOf(parser.getText()));
					}
					else if(tagname.equals("name")){
						//ָ����ǰ�ƶ�һλ
						parser.next();
						book.setName(parser.getText());
					}
					else if(tagname.equals("price")){
						//ָ����ǰ�ƶ�һλ
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		for(Book b:list){
			System.out.println(b);
		}

	}

}