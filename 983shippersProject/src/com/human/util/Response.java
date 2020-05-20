package com.human.util;

import java.util.ArrayList;

import com.human.dto.ShipperDto;

public class Response {
	private ArrayList<ShipperDto> arrShipperDto=null;
	private int resultValue=0;
	public ArrayList<ShipperDto> getArrShipperDto() {
		return arrShipperDto;
	}
	public void setArrShipperDto(ArrayList<ShipperDto> arrShipperDto) {
		this.arrShipperDto = arrShipperDto;
	}
	public int getResultValue() {
		return resultValue;
	}
	public void setResultValue(int resultValue) {
		this.resultValue = resultValue;
	}
	
}
