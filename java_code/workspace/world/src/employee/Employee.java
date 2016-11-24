package employee;
/*
 * 1 创建一个员工Eomployee类.
     构造方法：
        无参构造方法
        包含下面属性的构造方法
     属性：姓名   年龄   薪水(double)
     方法:  display()显示 姓名  年龄  薪水
 */

public class Employee {
	String name;
	int age;
	double pay;
	Employee(){
		System.out.println("无参构造函数");
	}
	Employee(String name1,int age1){
		name = name1;
		age = age1;	
		
	}
	double display(double pay1){
		pay = pay1;
		System.out.println("姓名 "+name+"  年龄   "+age+"  薪水  "+pay);
		return pay;
	}

}
