package studyURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
/*
 *1 URL:Uniform  Resource Locatorͳһ��Դ��λ��
    ��ʽ��Э��://hostname:port/�ļ���/��Դ���ơ�
    ���磺http://www.sina.com:8088/news/newslist.html
   ���췽����
    URL(String spec)�� ���� String ��ʾ��ʽ���� URL ����
   ������
    openConnection()�� ����һ�� URLConnection ��������ʾ�� URL �����õ�Զ�̶�������ӡ�
   HttpURLConnection: ʹ�� HTTP Э��� URLConnection��
    ���ԣ�HTTP_OK��  HTTP ״̬�� 200��OK��
    ������
       getInputStream()�����شӴ˴򿪵����Ӷ�ȡ����������
       getResponseCode()���� HTTP ��Ӧ��Ϣ��ȡ״̬�롣
       setRequestMethod(String method)������ URL ����ķ����� 
         GET POST HEAD OPTIONS PUT DELETE TRACE ���Ϸ���֮һ�ǺϷ���
        setDoOutput(boolean dooutput)������ URLConnection �� doOutput �ֶε�ֵ����Ϊָ����ֵ��
                              ���ʹ�� URL ���ӽ���������� DoOutput ��־����Ϊ true�����������ʹ�ã�������Ϊ false��Ĭ��ֵΪ false�� 
  GET�����裺 
       1 ����URL�����ڹ��췽���д���URL��ַ.GET��ʽ�Ļ�����Ѳ���������URL��ַ����: ?������=����ֵ&&����2=����ֵ
       2 ʹ��url�����openConnection()������ӣ�
       (��Ϊʹ��HttpЭ�飬���԰ѷ��ص�URLConnectionǿתΪHttpURLConnection�����߽����˷�������չ)
       3 �������ӵ�����ʽ���������POST����Ļ�����������setDoOutput()Ϊtrue��
       4 ��ȡ��Ӧ״̬��
       5 ����״̬����д���ͨ��ֻ��HttpURLConnection.HTTP_OK���д���
         �����200���������һ������������ʹ��getInputStream()��ȡ��������
       6 �ر�I/O���� 
 *   
 */
public class TestURLGet {

	public static void main(String[] args) throws MalformedURLException {
		//get请求
		
		BufferedReader br = null;
		try {
			System.out.println("please input name:");
			Scanner s = new Scanner(System.in);
			String name = s.next();
			
	//		URL url = new URL("http://10.12.152.65:8080/first/Login?user="+name+"&&pass=123456");
			URL url = new URL("http://localhost:8080/first/Login?user="+name+"&&pass=12345");
			
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			huc.setRequestMethod("GET");
			int code = huc.getResponseCode();
			if(code==HttpURLConnection.HTTP_OK){
				br = new BufferedReader(new InputStreamReader(huc.getInputStream()));
				String temp = null;
				while((temp=br.readLine())!=null){
					System.out.println(temp);
				}
			}
		} catch (ProtocolException e) {
			// TODO 锟皆讹拷锟斤拷锟缴碉�? catch 锟斤�?
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 锟皆讹拷锟斤拷锟缴碉�? catch 锟斤�?
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				// TODO 锟皆讹拷锟斤拷锟缴碉�? catch 锟斤�?
				e.printStackTrace();
			}
			
				
		}
	}

}
