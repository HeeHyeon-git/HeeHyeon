package com.human.test;

import com.human.controller.ShipperDelete;
import com.human.controller.ShipperExecute;
import com.human.controller.ShipperInsert;
import com.human.controller.ShipperSelect;
import com.human.controller.ShipperUpdate;
import com.human.util.Request;
import com.human.util.Response;

public class ShipperResponseTest {

	public static void main(String[] args) {
		int select = 3;
		ShipperExecute pe = null;
		Response response = new Response();
		Request request = new Request();

		switch (select) {
		case 0:
			pe = new ShipperInsert();
			break;
		case 1:
			pe = new ShipperUpdate();
			break;
		case 2:
			pe = new ShipperDelete();
			break;
		case 3:
			pe = new ShipperSelect();
			break;
		default:
			break;
		}
	
		pe.execute(request, response);
		System.out.println("Á¾·á");

	}

}
