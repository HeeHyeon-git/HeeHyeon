 package com.human.ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.human.util.DBConn;

public class JDBCExSingleton {

	public static void main(String[] args) {
		Connection conn = DBConn.getInstance();

		Statement st;
		try {
			st = conn.createStatement();
			// 프로그램에서는 auto commit 기본값
			int n = st.executeUpdate("insert into person " 
			+ "values" 
			+ "(3,'홍',123.23,sysdate-1,systimestamp-1)");
			if (n == 1) {
				System.out.println("정상동작");
			} else {
				System.out.println("비정상동작");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBConn.dbClose();
		}

		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
