package com.human.ex;

import java.util.Date;

import com.human.util.DBConn;

public class JDBCExStatementUpdateInput {

	public static void main(String[] args) {
		DBConn.getInstance();
		//����� �Է��� �޾Ƽ� �����͸� �߰��غ���.
		System.out.println("no �Է�");
		int no = DBConn.inputInt();
		System.out.println("name �Է�");
		String name = DBConn.inputString();
		System.out.println("height �Է�");
		double height = DBConn.inputDouble();
		System.out.println("birth �Է�");
		Date birth = DBConn.inputDate();
		System.out.println("regist �Է�");
		Date regist = DBConn.inputDate();
	
//		String sql = "insert into person " 
//				+ "values" 
//				+ "(122,'ȫ2',123.23,sysdate-1,systimestamp-1)";
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
				+ "set name = '��'" 
				+ "where no = 10";
		DBConn.statementUpdate(sql);
		DBConn.dbClose();
		System.out.println("����");

	}

}
