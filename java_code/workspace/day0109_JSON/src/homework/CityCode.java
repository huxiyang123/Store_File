package homework;

import java.util.List;

public class CityCode {
	private String province;
	private List<City> city;
	
	/**
	 * @return province
	 */
	public String getProvince() {
		return province;
	}


	/** ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CityCode [province=" + province + ", city=" + city + "]";
	}

	/**
	 * @param province Ҫ���õ� province
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return city
	 */
	public List<City> getCity() {
		return city;
	}
	/**
	 * @param city Ҫ���õ� city
	 */
	public void setCity(List<City> city) {
		this.city = city;
	}
}