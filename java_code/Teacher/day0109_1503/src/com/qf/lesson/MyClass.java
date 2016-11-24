package com.qf.lesson;

import java.util.List;

public class MyClass {
  private String cName;
  private String cRoom;
  private List<Student> studetns;
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getcRoom() {
	return cRoom;
}
public void setcRoom(String cRoom) {
	this.cRoom = cRoom;
}
public List<Student> getStudetns() {
	return studetns;
}
public void setStudetns(List<Student> studetns) {
	this.studetns = studetns;
}
@Override
public String toString() {
	return "MyClass [cName=" + cName + ", cRoom=" + cRoom + ", studetns="
			+ studetns + "]";
}
  
  
}
