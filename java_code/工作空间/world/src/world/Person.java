package world;

public class Person {
	String name;
	int age = 24;
	char sex;
	Person(){
		name = "����";
		
		sex = '��';
	}
	Person(String name1){
		name = name1;
	}
	Person(String name2,int age2){
		name = name2;
		age = age2;
	}
	void eat(String type){

		System.out.println(name+"����"+type+"  ����"+this.age+"  �Ա�"+sex);
	}
	void run(char sex3){
		sex =sex3;
		System.out.println(name+"ϲ���ܲ�  ����"+age+"  �Ա�"+sex);
	}

	
}
