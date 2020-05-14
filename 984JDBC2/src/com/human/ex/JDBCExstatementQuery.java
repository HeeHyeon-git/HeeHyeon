package com.human.ex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.human.util.DBConn;

public class JDBCExstatementQuery {

	public static void main(String[] args) {
		DBConn.getInstance();
		String sql = "select * from person " ;
		ResultSet rs =DBConn.statementQuery(sql);
		try {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConn.dbClose();
		
		System.out.println("����");
	}

}
