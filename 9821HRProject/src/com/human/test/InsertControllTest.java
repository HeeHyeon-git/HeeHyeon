package com.human.test;

import com.human.dao.InsertDao;
import com.human.util.Request;
import com.human.util.Response;

public class InsertControllTest {

	public static void main(String[] args) {
		int select = 3;
		Response response = new Response();
		Request request = new Request();

		switch (select) {
		case 0:
			//�����߰�
			InsertDao eDao = new InsertDao();
			eDao.insert_employees();
			break;
		case 1:
			//����߰�
			InsertDao rDao = new InsertDao();
			rDao.insert_regions();
			break;
		case 2:
			//�����߰�
			InsertDao cDao = new InsertDao();
			cDao.insert_countries();
			break;
		case 3:
			//�����߰�
			InsertDao lDao = new InsertDao();
			lDao.insert_locations();
			break;
		default:
			break;
		}
		System.out.println("����");

	}
	
}
