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
		System.out.println("������ �ؿ� ȸ���� ��ȣ�� �Է��ϼ���");
		System.out.println("companyName �Է�");
		String companyName=DBConn.inputString();
		System.out.println("shipperID �Է�");
		int shipperID=DBConn.inputInt();
		
		ShipperDto dto=new ShipperDto();
		dto.setCompanyName(companyName);
		dto.setShipperID(shipperID);
		request.setShipperDto(dto);
	}

	@Override
	public void logic(Request request, Response response) {
		ShipperDto dto =request.getshipperDto();
		//insert
		ShipperDao dao=new ShipperDao();
		int i=dao.update(dto.getShipperID(), dto.getCompanyName());
		response.setResultValue(i);
	}

	@Override
	public void outputView(Request request, Response response) {
		System.out.println(request.getshipperDto().getShipperID()
				+"�� �������� �̸��� "+request.getshipperDto().getCompanyName()
				+"�� "+response.getResultValue()
				+"�� ����Ǿ����ϴ�.");
	}

}
