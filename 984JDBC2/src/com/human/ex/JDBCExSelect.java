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
			// 4. resultSet ������: ��û�� ���� �����
			rs = st.executeQuery("select * from person");
			while (rs.next()) {
				// rs.getInt("no");
				int no = rs.getInt(1);
				String name = rs.getString(2);// 2 ��ſ�"name"
				double height = rs.getDouble(3);
				// �ڹٿ����� java.util.Date, DB�� �������� java.sql.Date
				Date birth1 = rs.getDate(4); // ��¥
				Date birth2 = rs.getTime(4); // �ð�
				Date birth3 = rs.getTimestamp(4); // ��¥�� �ð�
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
