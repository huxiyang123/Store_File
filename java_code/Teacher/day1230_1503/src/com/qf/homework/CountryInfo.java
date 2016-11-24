package com.qf.homework;

public class CountryInfo {
	// 举办国
	private String countryName;
	// 冠军国
	private String victName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getVictName() {
		return victName;
	}

	public void setVictName(String victName) {
		this.victName = victName;
	}

	@Override
	public String toString() {
		return "CountryInfo [countryName=" + countryName + ", victName="
				+ victName + "]";
	}

	public CountryInfo(String countryName, String victName) {
		super();
		this.countryName = countryName;
		this.victName = victName;
	}

}
