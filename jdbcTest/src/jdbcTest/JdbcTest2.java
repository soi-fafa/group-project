package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//이 경로는 벤더 업체에서 만든것.여기서 오타로 ClassNotFoundException가 발생할수도 있으니 예외처리 필요
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String pwd="1234";			
			Connection conn=DriverManager.getConnection(url,user,pwd);//여기서 오타로 SQLException발생할수도 있으니 예외처리 필요,다리 만들기
			
			////////////////////////////////
			Scanner sc= new Scanner(System.in);
			System.out.println("SQL문자입력[insert/update/delete만..");
			System.out.println("=>");
			String sql=sc.nextLine();
				
			Statement st=conn.createStatement();
			int count=st.executeUpdate(sql);
			System.out.println(count+"행이 수행되었습니다.");
				
			st.close();
			////////////////////////////////
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}								
														 
	}

}
