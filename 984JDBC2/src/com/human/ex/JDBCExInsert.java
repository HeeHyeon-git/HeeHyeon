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
			// 1. 사용할 데이터베이스 드라이브 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 해당 데이터 베이스에 접속 url, user, pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "human";
			String pw = "human";
			conn = DriverManager.getConnection(url, user, pw);
			// 3. connection를 통해서 statement 객체 생성
			// statement는 서로(client, server) 데이터 주고 받을 때 사용
			st = conn.createStatement();
			int  n = st.executeUpdate("insert into person "+"values"+"(3,'홍',123.23,sysdate-1,systimestamp-1);");

			if(n==1) {
				System.out.println("정상동작");
			}else {
				System.out.println("비정상동작");
			}
			
			n = st.executeUpdate("delete from Person "+"where no = 2");

			if(n>0) {
				System.out.println("정상동작");
			}else {
				System.out.println("비정상동작");
			}
			
			n = st.executeUpdate("update Person "+"set name='강'"+"where no = 1");

			if(n>0) {
				System.out.println("정상동작");
			}else {
				System.out.println("비정상동작");
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
