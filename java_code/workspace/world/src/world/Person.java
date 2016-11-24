package world;

public class Person {
	String name;
	int age = 24;
	char sex;
	Person(){
		name = "张三";
		
		sex = '男';
	}
	Person(String name1){
		name = name1;
	}
	Person(String name2,int age2){
		name = name2;
		age = age2;
	}
	void eat(String type){

		System.out.println(name+"爱吃"+type+"  年龄"+this.age+"  性别"+sex);
	}
	void run(char sex3){
		sex =sex3;
		System.out.println(name+"喜欢跑步  年龄"+age+"  性别"+sex);
	}

	
}
