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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConn.dbClose();
		
		System.out.println("종료");
	}

}
