package com.human.controller;

import java.util.ArrayList;

import com.human.dao.ShipperDao;
import com.human.dto.ShipperDto;
import com.human.util.DBConn;
import com.human.util.Request;
import com.human.util.Response;

public class ShipperInsert implements ShipperExecute {
	public void execute() {
		ShipperDto request=new ShipperDto();
		ArrayList<Integer> response =new ArrayList<Integer>();
//		inputView(request,response);
//		logic(request,response);
//		outputView(request,response);
	}
	
	public void execute(Request request,Response response) {
		inputView(request,response);
		logic(request,response);
		outputView(request,response);
	}
	public void inputView(Request request,Response response) {
		System.out.println("해운회사 정보를 입력하세요");
		System.out.println("shipperID 입력");
		int shipperID=DBConn.inputInt();
		System.out.println("companyName 입력");
		String companyName=DBConn.inputString();
		System.out.println("phone 입력");
		String phone=DBConn.inputString();
		
		ShipperDto dto=new ShipperDto();
		dto.setShipperID(shipperID);
		dto.setCompanyName(companyName);
		dto.setPhone(phone);
		request.setShipperDto(dto);
	}
	public void logic(Request request,Response response) {
	
		ShipperDto dto = request.getshipperDto();
		System.out.println(request.getshipperDto());
		//insert
		ShipperDao dao=new ShipperDao();
		int i=dao.insert(dto);
		response.setResultValue(i);
	}
	public void outputView(Request request,Response response){
		System.out.println(response.getResultValue());
	}
	
//	public void execute(Object request,Object response) {
//		inputView(request,response);
//		logic(request,response);
//		outputView(request,response);
//	}
//	
//	public void inputView(Object request,
//			Object response) {
//		System.out.println("해운회사 정보를 입력하세요");
//		System.out.println("shipperID 입력");
//		int shipperID=DBConn.inputInt();
//		System.out.println("companyName 입력");
//		String companyName=DBConn.inputString();
//		System.out.println("phone 입력");
//		String phone=DBConn.inputString();
//		
//		
//		
//		ShipperDto dto=(ShipperDto) request;
//		dto.setShipperID(shipperID);
//		dto.setCompanyName(companyName);
//		dto.setPhone(phone);
//	}
//	
//	public void logic(Object request,
//			Object response) {
//		ShipperDto dto =(ShipperDto) request;
//		//insert
//		ShipperDao dao=new ShipperDao();
//		int i=dao.insert(dto);
//		((ArrayList<Integer>)response).add(new Integer(i));	
//	}
//	
//	public void outputView(Object request,
//			Object response) {
//		System.out.println(((ArrayList<Integer>)response).get(0));
//	}
}




