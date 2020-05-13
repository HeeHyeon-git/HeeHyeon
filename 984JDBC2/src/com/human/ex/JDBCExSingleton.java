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
			// ���α׷������� auto commit �⺻��
			int n = st.executeUpdate("insert into person " 
			+ "values" 
			+ "(3,'ȫ',123.23,sysdate-1,systimestamp-1)");
			if (n == 1) {
				System.out.println("������");
			} else {
				System.out.println("��������");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBConn.dbClose();
		}

		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
