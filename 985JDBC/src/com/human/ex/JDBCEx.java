package com.human.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// 1.드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료");

			// 2.데이터베이스와 연결 : url, user, pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:제품명 localhost:내 컴퓨터주소
			String user = "human";
			String pw = "human";
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스 접속성공");

			st = con.createStatement();
			rs = st.executeQuery("select * from member");

			while (rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String hp = rs.getString("hp");
				String addr = rs.getString(4);
				System.out.println(no + ":" + name + ":" + hp + ":" + addr);
			}
			// 컬럼 rs.으로 접근

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (st != null)
					rs.close();
				if (con != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
