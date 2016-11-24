package study;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		
		return age+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student)obj;
			if(name.equals(other.name)&&age==other.age){
				return true;
			}
			return false;
		
	}

}

