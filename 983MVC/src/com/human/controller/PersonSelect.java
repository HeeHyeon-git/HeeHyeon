package com.human.controller;

import java.util.ArrayList;

import com.human.dao.PersonDao;
import com.human.dto.PersonDto;
import com.human.util.Request;
import com.human.util.Response;

public class PersonSelect implements PersonExecute {

	@Override
	public void execute() {

		PersonDto request=new PersonDto();
		ArrayList<PersonDto> response =new ArrayList<PersonDto>();
		
//		inputView(request,response);
//		logic(request,response);
//		outputView(request,response);

	}

	@Override
	public void execute(Request request, Response response) {
		inputView(request,response);
		logic(request,response);
		outputView(request,response);

	}

	@Override
	public void inputView(Request request, Response response) {
		// TODO Auto-generated method stub
		System.out.println("모든 회원을 출력할 예정입니다.");

	}

	@Override
	public void logic(Request request, Response response) {
		// TODO Auto-generated method stub
		PersonDao dao=new PersonDao();
		response.setArrPersonDto(dao.select());
		
		//response=dao.select();
	}

	@Override
	public void outputView(Request request, Response response) {
		// TODO Auto-generated method stub
		System.out.println("start1");
		if(response!=null) {
			System.out.println("start2");
			ArrayList<PersonDto> dtos
				=response.getArrPersonDto();
			System.out.println("회원정보는 다음과 같습니다.");
			for(PersonDto dto:dtos) {
				System.out.println(dto);
			}
		}else {
			System.out.println("start3");
			System.out.println("회원이 없습니다.");
		}
		System.out.println("start4");

	}

}




