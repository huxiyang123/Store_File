package homework;

import java.util.List;

public class StudentXML {
	private int sid;
	private String sname;
	private String sex;
	private List<Course> course;
	/**
	 * @return sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid 要设置的 sid
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname 要设置的 sname
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex 要设置的 sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return course
	 */
	public List<Course> getCourse() {
		return course;
	}
	/**
	 * @param course 要设置的 course
	 */
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentXML [sid=" + sid + ", sname=" + sname + ", sex=" + sex
				+ ", course=" + course.toString() + "]";
	}
	
	
	
}
