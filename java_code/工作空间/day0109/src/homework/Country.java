package homework;

import java.util.List;

public class Country {
	private List<CityCode> citycode;

	/**
	 * @return citycode
	 */
	public List<CityCode> getCitycode() {
		return citycode;
	}

	/**
	 * @param citycode Ҫ���õ� citycode
	 */
	public void setCitycode(List<CityCode> citycode) {
		this.citycode = citycode;
	}

	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Country [citycode=" + citycode + "]";
	}

	

	

	

	

}
