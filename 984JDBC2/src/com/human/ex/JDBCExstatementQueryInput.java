package com.human.ex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.human.util.DBConn;

public class JDBCExstatementQueryInput {

	public static void main(String[] args) {
		DBConn.getInstance();
		//사용자 입력을 받아서 특정 no만 출력해보자.
		System.out.println("검색하고자 하는 no를 입력하세요");
		int inputNo = DBConn.inputInt();
		//String sql = "select * from person " ;
		String sql = String.format(
				"select * from person where no = %d", inputNo);
		//문자일 경우 '%s'로 작은 따옴표로 감싸주기, 숫자는 바로.
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
