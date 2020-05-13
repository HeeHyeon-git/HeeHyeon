package com.human.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JDBCExInsert {

	public static void main(String[] args) {
		//insert
		Connection conn = null;
		Statement st = null;

		try {
			// 1. ����� �����ͺ��̽� ����̺� ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. �ش� ������ ���̽��� ���� url, user, pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "human";
			String pw = "human";
			conn = DriverManager.getConnection(url, user, pw);
			// 3. connection�� ���ؼ� statement ��ü ����
			// statement�� ����(client, server) ������ �ְ� ���� �� ���
			st = conn.createStatement();
			int  n = st.executeUpdate("insert into person "+"values"+"(3,'ȫ',123.23,sysdate-1,systimestamp-1);");

			if(n==1) {
				System.out.println("������");
			}else {
				System.out.println("��������");
			}
			
			n = st.executeUpdate("delete from Person "+"where no = 2");

			if(n>0) {
				System.out.println("������");
			}else {
				System.out.println("��������");
			}
			
			n = st.executeUpdate("update Person "+"set name='��'"+"where no = 1");

			if(n>0) {
				System.out.println("������");
			}else {
				System.out.println("��������");
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {

			try {
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
