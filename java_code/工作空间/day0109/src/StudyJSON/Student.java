package StudyJSON;

public class Student {
	private int sid;
	private String sname;
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
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	

	
}
