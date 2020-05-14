package com.human.ex;

import com.human.util.DBConn;

public class JDBCExStatementUpdate {

	public static void main(String[] args) {
		DBConn.getInstance();
		String sql = "insert into person " 
				+ "values" 
				+ "(122,'È«2',123.23,sysdate-1,systimestamp-1)";
		DBConn.statementUpdate(sql);
		sql = "delete from Person " 
				+ "where no = 3"; 
		DBConn.statementUpdate(sql);
		sql = "update person " 
				+ "set name = '°­'" 
				+ "where no = 10";
		DBConn.statementUpdate(sql);
		DBConn.dbClose();
		System.out.println("Á¾·á");

	}

}
