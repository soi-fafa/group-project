//jdbcTest는 2025.01.20
package jdbcTest;

import java.util.*;
import java.sql.*;

public class JdbcTest1 {

	public static void main(String[] args) {
		System.out.println("DB 드라이버 메모리 로딩!");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //외워라 모르면 압축풀어봐
			System.out.println("드라이버 로딩 성공!");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";//외워라 /오라클 포트번호는 1521부터 시작
			String user="scott";
			String pwd="1234";
			
			Connection conn=DriverManager.getConnection(url,user,pwd); //다리를 연결하는 것
			System.out.println("DB연동 성공!!");
			///////////////////////////////////////
			////비즈니스 영역
//			1)statement 예시
//			Statement st=conn.createStatement();//용달차 할당->sql이란 짐을 가지고 운반
//			String sql="insert into student values('쌍용',40,'서울','02-1212-3434')";//()안에가 sql이란 짐
//			int count=st.executeUpdate(sql); //st.executeUpdate를 통해 반환되는 값은 몇번 옮겻냐라는 정수값 
//			System.out.println(count+"행이 입력되었습니다.");
//			
			//실습1
//			Statement st=conn.createStatement();
//			Scanner sc=new Scanner(System.in);
//			
//			System.out.print("sql 문장을 입력:");
//			String sql=sc.nextLine();
//			int count=st.executeUpdate(sql);  
//			System.out.println(count+"행이 입력되었습니다.");
//			
//			
//			st.close();//여기서 차를 반납해야함
			
//			2)preparedstatement 예시
			String sql="insert into student values(?,?,?,?)" ;//바뀔수 있는 값만 ?(인파라미터)로 대체
			PreparedStatement ps=conn.prepareStatement(sql); //여기서 ps는 위의 sql구문(insert into student values(?,?,?,?)을 셋팅된상태로 받음
			ps.setString(1, "컴포즈");
			ps.setInt(2, 10);
			ps.setString(3, "서울");
			ps.setString(4, "02-4545-6767");
			int count=ps.executeUpdate();//쿼리가 셋팅되어있으므로 매개값 필요 없음
			System.out.println(count+"행이 수행되었습니다.");
			ps.close();
			///////////////////////////////////////
			
			conn.close();
			//st.close();//여기 있으면 용달차 반납하기전에 다리부터 끊어짐
					   //따라서 차를 반납후 다리를 끊어야함
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
