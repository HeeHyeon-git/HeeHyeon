package com.human.dto;

public class RegionsDto {
	private int region_id;
	private String region_name;
	
	public void RegionDto() {};
	public void RegionDto(int region_id,String region_name) {
		
		this.region_id=region_id;
		this.region_name=region_name;
	}
	//toString 
	@Override
	public String toString() {
		return "RegionDto [region_id=" + region_id 
				+ ", region_name=" + region_name + "]";
	}
	// getter,setter
	public int getregion_id() {
		return region_id;
	}
	public void setregion_id(int region_id) {
		this.region_id=region_id;
	}
	public String getregion_name() {
		return region_name;
	}
	public void setregion_name(String region_name) {
		this.region_name=region_name;
	}
	
}
	
