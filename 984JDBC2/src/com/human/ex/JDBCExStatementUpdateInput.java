package com.human.ex;

import java.util.Date;

import com.human.util.DBConn;

public class JDBCExStatementUpdateInput {

	public static void main(String[] args) {
		DBConn.getInstance();
		//사용자 입력을 받아서 데이터를 추가해보자.
		System.out.println("no 입력");
		int no = DBConn.inputInt();
		System.out.println("name 입력");
		String name = DBConn.inputString();
		System.out.println("height 입력");
		double height = DBConn.inputDouble();
		System.out.println("birth 입력");
		Date birth = DBConn.inputDate();
		System.out.println("regist 입력");
		Date regist = DBConn.inputDate();
	
//		String sql = "insert into person " 
//				+ "values" 
//				+ "(122,'홍2',123.23,sysdate-1,systimestamp-1)";
		String sql = "insert into person " 
				+ "values" 
				+ "(%d,'%s',%f,"
				+ "to_date('%s','yyyy-mm-dd hh24:mi:ss'),"
				+ "to_date('%s','yyyy-mm-dd hh24:mi:ss'))";
		
		sql = String.format(sql, no, height,
				DBConn.dateToString(birth),
				DBConn.dateToString(regist));
		System.out.println(sql);
		DBConn.statementUpdate(sql);
		sql = "delete from Person " 
				+ "where no = 3"; 
		DBConn.statementUpdate(sql);
		sql = "update person " 
				+ "set name = '강'" 
				+ "where no = 10";
		DBConn.statementUpdate(sql);
		DBConn.dbClose();
		System.out.println("종료");

	}

}
