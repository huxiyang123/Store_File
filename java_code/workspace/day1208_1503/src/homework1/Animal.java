package homework1;
/*  
 * 1.创建父类Animal，拥有属性name，age，
 *   创建子类Dog，子类Cat，并测试。 
 */		     
public class Animal {
	int age ;
	String name;
	void shout(){
		System.out.println("Animal"+name+" 叫"+age);
	}
}
