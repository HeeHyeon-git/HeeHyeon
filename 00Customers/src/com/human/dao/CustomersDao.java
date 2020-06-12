package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.CustomersDto;
import com.human.util.DBConn;

public class CustomersDao {
	public int insert(CustomersDto dto) {
		int returnValue=0;
		DBConn.getInstance();
		String sql="insert into customers "
				+ "values ('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
	
		sql=String.format(sql,dto.getCustomerID(),dto.getCompanyName(),
				dto.getContactName(),dto.getContactTitle(),dto.getAddress(),
				dto.getCity(),dto.getRegion(),dto.getPostalCode(),dto.getCountry(),
				dto.getPhone(),dto.getFax());
		returnValue=DBConn.statementUpdate(sql);
		DBConn.dbClose();
		return returnValue;
	
	}
	
	
	public int update(CustomersDto dto) {
		int returnValue=0;
		DBConn.getInstance();
		String sql="update customers "
				+ "set customerID='%s' "
				+ "where companyName='%s'";
		
		sql=String.format(sql,dto.getCustomerID(),dto.getCompanyName());
		returnValue=DBConn.statementUpdate(sql);
		DBConn.dbClose();		
		return returnValue;
	}
	
	public int delete(String customerID) {
		int returnValue=0;
		DBConn.getInstance();
		String sql="delete customers "
				+ "where customerID='%s'";
		sql=String.format(sql,customerID);
		returnValue=DBConn.statementUpdate(sql);
		DBConn.dbClose();		
		return returnValue;
	}
	public ArrayList<CustomersDto> select(){
		ArrayList<CustomersDto> dtos=new ArrayList<CustomersDto>();
		DBConn.getInstance();
		String sql="select * from customers";
		ResultSet rs=DBConn.statementQuery(sql);
		try {
			while(rs.next()) {
				CustomersDto dto=new CustomersDto();
				dto.setCustomerID(rs.getString("customerID"));
				dto.setCompanyName(rs.getString("companyName"));
				dto.setContactName(rs.getString("contactName"));
				dto.setContactTitle(rs.getString("contactTitle"));
				dto.setAddress(rs.getString("address"));
				dto.setCity(rs.getString("city"));
				dto.setRegion(rs.getString("region"));
				dto.setPostalCode(rs.getString("postalCode"));
				dto.setCountry(rs.getString("country"));
				dto.setPhone(rs.getString("phone"));
				dto.setFax(rs.getString("fax"));
			
				dtos.add(dto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dtos;
	}
	


	
	

}
