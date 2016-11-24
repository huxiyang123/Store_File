package Exam;

public class TestIPerson {
	public static void main(String[] args) {
		IPerson ip1 = new Chinese();
		TestIPerson.method(ip1);
		IPerson ip2 = new Amrican();
		TestIPerson.method(ip2);		
	}
	public static void method(IPerson p){
		p.say();
	}
}
