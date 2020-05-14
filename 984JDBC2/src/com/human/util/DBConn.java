package com.human.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DBConn {
	// .getInstance() -�̱���
	// new DBConn(); -�������� �ʵ��� ����� �� �ϴ�.
	private DBConn() {};

	private static Connection dbConn = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	private static Scanner sc = new Scanner(System.in);
	
	public static ResultSet statementQuery(String sql) {
		try {
			if (st == null) {
				st = dbConn.createStatement();
			}
			// 4. resultSet ������: ��û�� ���� �����
			rs = st.executeQuery("select * from person");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

		}
		return rs;

	}
	public static int statementUpdate(String sql) {
		int resultValue = 0;
//		DBConn.getInstance();
		try {
			if (st == null) {
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
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (dbConn != null)
				dbConn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs = null;
			st = null;
			dbConn = null;
		}

	}
	
	public static int inputInt() {
		System.out.println("�����Է�>>");
		return Integer.parseInt(sc.nextLine());
	}
	public static double inputDouble() {
		System.out.println("�Ǽ��Է�>>");
		return Double.parseDouble(sc.nextLine());
	}
	public static String inputString() {
		System.out.println("�����Է�>>");
		return sc.nextLine();
	}
	public static Date inputDate() {
		Date returnValue = null;
		SimpleDateFormat transFormat = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("��¥�Է�(yyyy-MM-dd HH:mm:ss)");
		String inputString = sc.nextLine();		
		try {
			returnValue = transFormat.parse(inputString);
		}catch (ParseException e){
			e.printStackTrace();
		}
		return returnValue;
	}
	public static String dateToString(Date d) {
		DateFormat df = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		return df.format(d);
		
	}
	
	
	
	
	
}
