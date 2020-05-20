package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.ShipperDto;
import com.human.util.DBConn;

public class ShipperDao {
	public int insert(ShipperDto dto) {
		int returnValue = 0;
		DBConn.getInstance();
		String sql = "insert into Shippers " + "values (%d,'%s','%s')";
		sql = String.format(sql, dto.getShipperID(), dto.getCompanyName(), dto.getPhone());
		
		System.out.println(sql);
		
		returnValue = DBConn.statementUpdate(sql);
		DBConn.dbClose();
		return returnValue;
	}

	public int update(int shipperID, String companyName) {
		int returnValue = 0;
		DBConn.getInstance();
		String sql = "update Shippers " 
				+ "set companyName='%s' " 
				+ "where shipperID=%d";

		sql = String.format(sql, companyName, shipperID);
		returnValue = DBConn.statementUpdate(sql);
		DBConn.dbClose();
		return returnValue;
	}
	public int delete(int shipperID) {
		int returnValue=0;
		DBConn.getInstance();
		String sql="delete Shippers "
				+ "where shipperID=%d";
		sql=String.format(sql,shipperID);
		returnValue=DBConn.statementUpdate(sql);
		DBConn.dbClose();		
		return returnValue;
	}
	public ArrayList<ShipperDto> select(){
		ArrayList<ShipperDto> dtos=new ArrayList<ShipperDto>();
		DBConn.getInstance();
		String sql="select * from Shippers";
		ResultSet rs=DBConn.statementQuery(sql);
		try {
			while(rs.next()) {
				ShipperDto dto=new ShipperDto();
				dto.setShipperID(rs.getInt("shipperID"));
				dto.setCompanyName(rs.getString("companyName"));
				dto.setPhone(rs.getString("phone"));
				
				dtos.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	
}
