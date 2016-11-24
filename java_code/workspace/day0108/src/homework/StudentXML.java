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
	 * @param sid Ҫ���õ� sid
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
	 * @param sname Ҫ���õ� sname
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
	 * @param sex Ҫ���õ� sex
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
	 * @param course Ҫ���õ� course
	 */
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentXML [sid=" + sid + ", sname=" + sname + ", sex=" + sex
				+ ", course=" + course.toString() + "]";
	}
	
	
	
}