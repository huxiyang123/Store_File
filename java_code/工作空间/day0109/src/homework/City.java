package homework;

public class City {
	private String cityname;
	private String citynumber;
	/**
	 * @return cityname
	 */
	public String getCityname() {
		return cityname;
	}
	/**
	 * @param cityname Ҫ���õ� cityname
	 */
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	/**
	 * @return citynumber
	 */
	public String getCitynumber() {
		return citynumber;
	}
	/**
	 * @param citynumber Ҫ���õ� citynumber
	 */
	public void setCitynumber(String citynumber) {
		this.citynumber = citynumber;
	}
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", citynumber=" + citynumber
				+ "]";
	}
	
}
