package homework;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		User u = new User("zhangsan","123456");

		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名：");
		//获取键盘输入的用户名
		String name = s.next();
		System.out.println("请输入密码：");
		String pass = s.next();
		
		if(name.equals(u.getName())&&pass.equals(u.getPassword())){
			System.out.println("欢迎你： "+name);
			System.out.println("请选择业务种类：0代表退出   1存款 2取款 3查询");
			String type = s.next();//业务种类
			if(type.equals("0")){
				System.exit(0);
			}
			else if(type.equals("1")){
				System.out.println("请输入存款金额：仅限输入整数类型");
				int r = s.nextInt();
				u.saveMoney(r);
				System.out.println("账户余额："+u.getAccount());
			}
		}
		else{
			System.out.println("用户名或密码有误，请重新输入！！！ ");
		}
	}

}
