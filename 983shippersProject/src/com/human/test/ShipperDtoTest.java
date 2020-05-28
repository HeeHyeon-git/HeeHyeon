package com.human.test;

import java.util.ArrayList;

import com.human.dao.ShipperDao;
import com.human.dto.ShipperDto;

public class ShipperDtoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		insert
//		ShipperDao dao = new ShipperDao();
//		ShipperDto dto = new ShipperDto();
//		dto.setShipperID(100);
//		dto.setCompanyName("gh");
//		dto.setPhone("(041)324-3542");
//		int result=dao.insert(dto);
//		System.out.println(result);
		
		//update
//		ShipperDao dao = new ShipperDao();
//		int result=dao.update(100, "ÈÞ");
//		System.out.println(result);
		
		//delete
//		ShipperDao dao = new ShipperDao();
//		int result=dao.delete(0);
//		System.out.println(result);
		
		//select
		ShipperDao dao=new ShipperDao();
		ArrayList<ShipperDto> dtos=dao.select();
		for(ShipperDto dto:dtos) {
			System.out.println(dto);	
		}
		
		
	}

}











