package com.human.util;

import java.util.ArrayList;

import com.human.dto.CustomersDto;

public class Response {
	private ArrayList<CustomersDto> arrCustomersDto=null;
	private int resultValue=0;
	public ArrayList<CustomersDto> getArrCustomersDto() {
		return arrCustomersDto;
	}
	public void setArrPersonDto(ArrayList<CustomersDto> arrCustomersDto) {
		this.arrCustomersDto = arrCustomersDto;
	}
	public int getResultValue() {
		return resultValue;
	}
	public void setResultValue(int resultValue) {
		this.resultValue = resultValue;
	}
	
}
