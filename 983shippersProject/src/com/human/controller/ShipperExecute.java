package com.human.controller;

import java.util.ArrayList;
import java.util.Date;


import com.human.dao.ShipperDao;
import com.human.dto.ShipperDto;
import com.human.util.DBConn;
import com.human.util.Request;
import com.human.util.Response;

public interface ShipperExecute {
	public void execute();
	public void execute(Request request,Response response);
	public void inputView(Request request,Response response);
	public void logic(Request request,Response response);
	public void outputView(Request request,Response response);
}






