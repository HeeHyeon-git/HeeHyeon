package com.human.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	// .getInstance() -싱글턴
	// new DBConn(); -생성하지 않도록 만드는 법 하단.
	private DBConn() {};
	private static Connection dbConn = null;
	private static Statement st = null;
	public static int StatementUpdate(String sql) {
		int resultValue = 0;
//		DBConn.getInstance();
		try {
			if(st == null) {
				st = dbConn.createStatement();
			}
			// 프로그램에서는 auto commit 기본값
			resultValue = st.executeUpdate(sql);
//			if (n == 1) {
//				System.out.println("정상동작");
//			} else {
//				System.out.println("비정상동작");
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			DBConn.dbClose(); //줄려고 하는데 받을 애가 없어서 주석을 안하면 에러남.
		}
		return resultValue;
	}
	public static Connection getInstance() {
		if (dbConn == null) {
			try {
				// 1. 사용할 데이터베이스 드라이브 등록
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 2. 해당 데이터 베이스에 접속 url, user, pw
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "human";
				String pw = "human";
				dbConn = DriverManager.getConnection(url, user, pw);

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		return dbConn;
	}
	
	public static void dbClose() {
		try {
			if (st != null) st.close();	
			if (dbConn != null) dbConn.close();

		} catch (SQLException e) {
			e.printStackTrace();	
		}finally {
			dbConn = null;
		}
		
	}
}















