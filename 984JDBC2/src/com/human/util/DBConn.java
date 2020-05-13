package com.human.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	// .getInstance() -�̱���
	// new DBConn(); -�������� �ʵ��� ����� �� �ϴ�.
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
			// ���α׷������� auto commit �⺻��
			resultValue = st.executeUpdate(sql);
//			if (n == 1) {
//				System.out.println("������");
//			} else {
//				System.out.println("��������");
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			DBConn.dbClose(); //�ٷ��� �ϴµ� ���� �ְ� ��� �ּ��� ���ϸ� ������.
		}
		return resultValue;
	}
	public static Connection getInstance() {
		if (dbConn == null) {
			try {
				// 1. ����� �����ͺ��̽� ����̺� ���
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 2. �ش� ������ ���̽��� ���� url, user, pw
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















