package com.human.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JDBCExSelect {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;


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
			// 4. resultSet 얻어오기: 요청한 실행 결과물
			rs = st.executeQuery("select * from person");
			while (rs.next()) {
				// rs.getInt("no");
				int no = rs.getInt(1);
				String name = rs.getString(2);// 2 대신에"name"
				double height = rs.getDouble(3);
				// 자바에서는 java.util.Date, DB에 넣을때는 java.sql.Date
				Date birth1 = rs.getDate(4); // 날짜
				Date birth2 = rs.getTime(4); // 시간
				Date birth3 = rs.getTimestamp(4); // 날짜랑 시간
				Date regist = rs.getTimestamp(5);

				System.out.println(
						no + "~" + name + "~" + height + "~" + birth1 + "~" + birth2 + "~" + birth3 + "~" + regist);

				DateFormat df = new SimpleDateFormat ("yyyy/MM/dd hh:mm:ss");
				System.out.println(df.format(birth1));
				System.out.println(df.format(birth2));
				System.out.println(df.format(birth3)); 
				
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
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
