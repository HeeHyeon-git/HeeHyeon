package com.human.controller;

import java.util.ArrayList;

import com.human.dao.ShipperDao;
import com.human.dto.ShipperDto;
import com.human.util.Request;
import com.human.util.Response;

public class ShipperSelect implements ShipperExecute {

	@Override
	public void execute() {

		ShipperDto request=new ShipperDto();
		ArrayList<ShipperDto> response =new ArrayList<ShipperDto>();

	}

	@Override
	public void execute(Request request, Response response) {
		inputView(request,response);
		logic(request,response);
		outputView(request,response);

	}

	@Override
	public void inputView(Request request, Response response) {
		System.out.println("��� �ؿ�ȸ�縦 ����� �����Դϴ�.");

	}

	@Override
	public void logic(Request request, Response response) {
		ShipperDao dao=new ShipperDao();
		response.setArrShipperDto(dao.select());
		
	}

	@Override
	public void outputView(Request request, Response response) {

		//System.out.println("start1");
		if(response!=null) {
			//System.out.println("start2");
			ArrayList<ShipperDto> dtos
				=response.getArrShipperDto();
			System.out.println("�ؿ�ȸ�� ������ ������ �����ϴ�.");
			for(ShipperDto dto:dtos) {
				System.out.println(dto);
			}
		}else {
			//System.out.println("start3");
			System.out.println("�ؿ�ȸ�簡 �����ϴ�.");
		}
		//System.out.println("start4");

	}

}




