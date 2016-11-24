package lesson;

import lesson.child.Animal;
import lesson.child.son.Dog;
import lesson.child2.Pig;


public class TestPerson {

	public static void main(String[] args) {
		day07_1503.Person  p = new day07_1503.Person("",23);
        p.changeAge(34);
        
        Person p2 = new Person();
        
        Animal a = new Animal();
        
        Pig p3 = new Pig();
        
        Dog d = new Dog();
	}

}
