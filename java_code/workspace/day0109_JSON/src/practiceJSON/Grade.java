package practiceJSON;

import java.util.List;

import StudyJSON.Student;

public class Grade {
	private String cName;
	
	private String cRoom;
	private List<Student> student;
	/**
	 * @return cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName Ҫ���õ� cName
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return cRoom
	 */
	public String getcRoom() {
		return cRoom;
	}
	/**
	 * @param cRoom2 Ҫ���õ� cRoom
	 */
	public void setcRoom(String cRoom) {
		this.cRoom = cRoom;
	}
	/**
	 * @return student
	 */
	public List<Student> getStudent() {
		return student;
	}
	/**
	 * @param student Ҫ���õ� student
	 */
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Grade [cName=" + cName + ", cRoom=" + cRoom + ", student="
				+ student + "]";
	}
	
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	
	
}
