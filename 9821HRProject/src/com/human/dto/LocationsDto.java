package com.human.dto;

public class LocationsDto {
	private int location_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	
	//������ get,set,toString
	public LocationsDto() {}

	public LocationsDto(int location_id, String street_address, String postal_code, String city, String state_province,
			String country_id) {
		super();
		this.location_id = location_id;
		this.street_address = street_address;
		this.postal_code = postal_code;
		this.city = city;
		this.state_province = state_province;
		this.country_id = country_id;
	}

	
	@Override
	public String toString() {
		return "HrDto [location_id=" + location_id + ", street_addresssssss=" + street_address + ", postal_code=" + postal_code
				+ ", city=" + city + ", state_province=" + state_province + ", country_id=" + country_id + "]";
	}

	public int getlocation_id() {
		return location_id;
	}

	public void setlocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getstreet_address() {
		return street_address;
	}

	public void setstreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getpostal_code() {
		return postal_code;
	}

	public void setpostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getstate_province() {
		return state_province;
	}

	public void setstate_province(String state_province) {
		this.state_province = state_province;
	}

	public String getcountry_id() {
		return country_id;
	}

	public void setcountry_id(String country_id) {
		this.country_id = country_id;
	}
	
	
	
}