package com.human.test;

import com.human.controller.ShipperDelete;
import com.human.controller.ShipperExecute;
import com.human.controller.ShipperInsert;
import com.human.controller.ShipperSelect;
import com.human.controller.ShipperUpdate;

public class ShipperControllerTest {

	public static void main(String[] args) {
	
		int select=3;
		ShipperExecute pe=null;

		switch(select) {
		case 0:
			pe=new ShipperInsert();
			break;
		case 1:
			pe=new ShipperUpdate();
			break;
		case 2:
			pe=new ShipperDelete();
			break;
		case 3:
			pe=new ShipperSelect();
			break;
		default:
			break;
		}
		pe.execute();
		System.out.println("����");

	}

}
