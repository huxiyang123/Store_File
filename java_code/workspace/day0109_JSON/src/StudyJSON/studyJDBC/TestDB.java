package StudyJSON.studyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * JDBC:Java DataBase Connectivity:java���ݿ����ӡ���һ���淶��
 *     ͨ��JDBC,javaӦ�ó�����Թ������ݿ⡣��һ������ִ��SQL����Java API��JDBC����Ϊ���ֹ�ϵ���ݿ��ṩͳһ���ʣ�
 *     ����һ����Java���Ա�д����ͽӿ���ɡ�
 *   ������ӿڣ�λ��java.sql��
 *      DriverManager������jdbc��������
 *      Connection:���ڽ���һ�����ݿ����Ӷ���
 *      Statement:ִ�ж�Ӧ��SQL���
 *      PerpardStatement��ִ��Ԥ����sql������
 *      ResultSet����ѯ�Ľ����
 *    ʹ�ò��裺ǰ��������jar�����ӵ���Ŀ����·����
 *      1 �������ݿ�����
 *      2 ��ȡ���ݿ�����
 *      3 ����SQL���������ݿ����
 *      4 ��ȡ����ֵ
 *      5 �ر�����     
 */
public class TestDB {

	public static void main(String[] args) {
		
		Connection conn = null;		
		try {
			// ��������
			Class.forName("org.sqlite.JDBC");
			// ���ݿ��ַ
			String url = "jdbc:sqlite://e:/Teacher/test.db";			
			// ��ȡ����
			conn = DriverManager.getConnection(url);
			// ��ȡStatement����
			Statement stmt = conn.createStatement();
			//ִ�гɹ���������insert update delete��ִ�и÷���
			int num = stmt.executeUpdate("insert into user(name,sex,age) values('wangwu99','Ů',20)");
			if (num>0) {
				System.out.println("insert success!!");
			} else {
				System.out.println("failure!!");
			}
			
			List<Person>  list = new ArrayList<Person>();
			//ִ�в�ѯ��select
			ResultSet rs = stmt.executeQuery("select * from user");
			while(rs.next()){
				Person p = new Person();
				//������������������ȡ��Ӧ�е�ֵ,����ʹ������
				int id = rs.getInt("sid");
				p.setSid(id);
				String name = rs.getString("name");
				p.setName(name);
				String sex = rs.getString("sex");
				p.setSex(sex);
				int age = rs.getInt("age");
				p.setAge(age);
				list.add(p);
			}
			
			System.out.println(list);
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}

	}

}