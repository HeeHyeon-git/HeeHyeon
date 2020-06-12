package com.human.test;

import java.util.ArrayList;

import com.human.dao.PersonDao;
import com.human.dto.PersonDto;

public class PersonDtoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insert
//		PersonDao dao=new PersonDao();
//		PersonDto dto=new PersonDto();
//		dto.setNo(20);
//		dto.setName("kim");
//		dto.setHeight(124.3);
//		dto.setBirth(new Date());
//		dto.setRegist(new Date());
//		int result=dao.insert(dto);
//		System.out.println(result);
		
		//update
//		PersonDao dao=new PersonDao();
//		int result=dao.update("hong", 20);
//		System.out.println(result);
		
		//delete
//		PersonDao dao=new PersonDao();
//		int result=dao.delete(20);
//		System.out.println(result);
		
		//select
		PersonDao dao=new PersonDao();
		ArrayList<PersonDto> dtos=dao.select();
		for(PersonDto dto:dtos) {
			System.out.println(dto);	
		}
		
		
	}

}











