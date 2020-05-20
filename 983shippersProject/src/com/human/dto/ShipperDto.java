package com.human.dto;

public class ShipperDto {
	private int shipperID;
	private String companyName;
	private String phone;
	
	//»ý¼ºÀÚ
	public ShipperDto() {}
	public ShipperDto(int shipperID, String companyName, String phone) {
		super();
		this.shipperID = shipperID;
		this.companyName = companyName;
		this.phone = phone;
	}
	//getter, setter
	public int getShipperID() {
		return shipperID;
	}
	public void setShipperID(int shipperID) {
		this.shipperID = shipperID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//toString 
	@Override
	public String toString() {
		return "ShipperDto [ShipperID=" + shipperID + 
				", CompanyName=" + companyName + ", Phone=" + phone + "]";
	}
	
}










