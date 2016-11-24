package world;
 /*
  * 
  */
public class Packag {
	private String name ;
	private int age ;
	private char sex;	
	

	public void setAge(int age1){
		if(age1>150||age1<0){
			System.out.println("´í");
		}
		else{
			age = age1;
		}	
	}
	public int getAge(){
		return age;
	}
	public void setName(String sname){
		name = sname;
	}
	public String getName(){
		return name;
	}
}
