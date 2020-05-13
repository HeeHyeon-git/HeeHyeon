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
			// 1.����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε��Ϸ�");

			// 2.�����ͺ��̽��� ���� : url, user, pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:��ǰ�� localhost:�� ��ǻ���ּ�
			String user = "human";
			String pw = "human";
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("�����ͺ��̽� ���Ӽ���");

			st = con.createStatement();
			rs = st.executeQuery("select * from member");

			while (rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String hp = rs.getString("hp");
				String addr = rs.getString(4);
				System.out.println(no + ":" + name + ":" + hp + ":" + addr);
			}
			// �÷� rs.���� ����

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
