package practice;

public class Student {
	private String name;
	private int age;
	private String country;
	private int no;
	private String sex;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age Ҫ���õ� age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country Ҫ���õ� country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no Ҫ���õ� no
	 */
	public void setNo(int no) {
		this.no = no;
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
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", country="
				+ country + ", no=" + no + ", sex=" + sex + "]";
	}

}
