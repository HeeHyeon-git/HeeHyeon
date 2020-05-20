package com.human.controller;

import java.util.ArrayList;

import com.human.dao.ShipperDao;
import com.human.dto.ShipperDto;
import com.human.util.DBConn;
import com.human.util.Request;
import com.human.util.Response;

public class ShipperUpdate implements ShipperExecute {
	@Override
	public void execute() {
		ShipperDto request=new ShipperDto();
		ArrayList<Integer> response =new ArrayList<Integer>();
		
	}
	
	@Override
	public void execute(Request request, Response response) {
		inputView(request,response);
		logic(request,response);
		outputView(request,response);
	}

	@Override
	public void inputView(Request request, Response response) {
		System.out.println("변경할 해운 회사명와 번호를 입력하세요");
		System.out.println("companyName 입력");
		String companyName=DBConn.inputString();
		System.out.println("shipperID 입력");
		int shipperID=DBConn.inputInt();
		
		ShipperDto dto=new ShipperDto();
		dto.setCompanyName(companyName);
		dto.setShipperID(shipperID);
		request.setPersonDto(dto);
	}

	@Override
	public void logic(Request request, Response response) {
		ShipperDto dto =request.getPersonDto();
		//insert
		ShipperDao dao=new ShipperDao();
		int i=dao.update(dto.getCompanyName(), dto.getShipperID());
		response.setResultValue(i);
	}

	@Override
	public void outputView(Request request, Response response) {
		System.out.println(request.getPersonDto().getShipperID()
				+"번 데이터의 이름을 "+request.getPersonDto().getCompanyName()
				+"로 "+response.getResultValue()
				+"개 변경되었습니다.");
	}

}
