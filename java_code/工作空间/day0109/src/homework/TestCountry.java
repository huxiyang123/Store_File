package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import com.alibaba.fastjson.JSONObject;


public class TestCountry {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			StringBuffer sb = new StringBuffer();
			br = new BufferedReader(new FileReader("20160109��ҵ-��ϲ��.txt"));
			String temp = null;
			while((temp=br.readLine())!=null){
				sb.append(temp);				
			}		
			String s = sb.toString().replace("���д���", "citycode").replace("ʡ", "province").replace("����", "cityname").replace("��", "city").replace("����", "citynumber");
			Country coun = JSONObject.parseObject(s, Country.class);
			System.out.println(coun);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
		}
		//coun.replace("���д���", "a").replace("ʡ", "b").replace("����", "c").replace("��", "d").replace("����", "f");

	}

}
