package com.human.controller;

import java.util.ArrayList;

import com.human.dao.PersonDao;
import com.human.dto.PersonDto;
import com.human.util.DBConn;
import com.human.util.Request;
import com.human.util.Response;

public class PersonDelete implements PersonExecute {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		PersonDto request=new PersonDto();
		ArrayList<Integer> response =new ArrayList<Integer>();
		
//		inputView(request,response);
//		logic(request,response);
//		outputView(request,response);

	}

	@Override
	public void execute(Request request,Response response) {
		// TODO Auto-generated method stub
		inputView(request,response);
		logic(request,response);
		outputView(request,response);

	}

	@Override
	public void inputView(Request request,Response response) {
		System.out.println("삭제할 회원 번호를 입력하세요.");
		System.out.println("no 입력");
		int no=DBConn.inputInt();
		PersonDto dto=new PersonDto();
		dto.setNo(no);
		request.setPersonDto(dto);
		
	}

	@Override
	public void logic(Request request,Response response) {
		PersonDto dto=request.getPersonDto();
		PersonDao dao=new PersonDao();
		int i=dao.delete(dto.getNo());
//		((ArrayList<Integer>)response).add(new Integer(i));
		response.setResultValue(i);
	}

	@Override
	public void outputView(Request request,Response response){
		PersonDto req=request.getPersonDto();
		
		System.out.println("사원번호"+req.getNo()+"를 "
		+response.getResultValue()+"개를 삭제하였습니다.");

	}

}









