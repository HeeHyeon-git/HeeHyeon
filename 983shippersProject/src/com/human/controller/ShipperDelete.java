package com.human.controller;

import java.util.ArrayList;

import com.human.dao.ShipperDao;
import com.human.dto.ShipperDto;
import com.human.util.DBConn;
import com.human.util.Request;
import com.human.util.Response;

public class ShipperDelete implements ShipperExecute {

	@Override
	public void execute() {
		ShipperDto request=new ShipperDto();
		ArrayList<Integer> response =new ArrayList<Integer>();

	}

	@Override
	public void execute(Request request,Response response) {
		inputView(request,response);
		logic(request,response);
		outputView(request,response);

	}

	@Override
	public void inputView(Request request,Response response) {
		System.out.println("삭제할 해운회사 번호를 입력하세요.");
		System.out.println("shipperID 입력");
		int shipperID=DBConn.inputInt();
		ShipperDto dto=new ShipperDto();
		dto.setShipperID(shipperID);
		request.setPersonDto(dto);
		
	}

	@Override
	public void logic(Request request,Response response) {
		ShipperDto dto=request.getPersonDto();
		ShipperDao dao=new ShipperDao();
		int i=dao.delete(dto.getShipperID());
		response.setResultValue(i);
	}

	@Override
	public void outputView(Request request,Response response){
		ShipperDto req=request.getPersonDto();
		
		System.out.println("해운 회사 번호"+req.getShipperID()+"를 "
		+response.getResultValue()+"개를 삭제하였습니다.");

	}

}









