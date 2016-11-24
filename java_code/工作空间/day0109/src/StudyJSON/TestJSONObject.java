package StudyJSON;

import net.sf.json.JSONObject;

/*
 * JSON:(JavaScript Object Notation) ��һ�������������ݽ�����ʽ��
 * 	���Ա�ʾ�����ͣ�
 * 	  1 ����ʹ��{}������������
 * 		{name:'lisi',age:24}
 * 		{student:[name:'zhangsan'],[name:'lisi']}
 * 	  2 ���飺ʹ��[]������������
 * 		["first","second","third"]
 * 	������ʽ��
 * 	  1 JSON:��Ҫ�����Ӧ��jar��
 * 	  2 GSON
 * 	  3 FASTJSON
 */
public class TestJSONObject {

	public static void main(String[] args) {
		String jsonStr = "{sid:1,sname:'zhangsan'}";
		//��jsonStr�ַ���ת��ΪJSONObject����
		JSONObject jo = JSONObject.fromObject(jsonStr);
		//ʹ��toBean()������JSONObject�����Java���class�������
		Student s = (Student) JSONObject.toBean(jo, Student.class);
		System.out.println(s);
		
	}

}
