package homework;

public class Course {
	private int cid;
	private String cname;
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	/**
	 * @return cid
	 */
	public int getCid() {
		return cid;
	}
	/**
	 * @param cid Ҫ���õ� cid
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}
	/**
	 * @return cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname Ҫ���õ� cname
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
