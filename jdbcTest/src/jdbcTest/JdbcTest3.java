package jdbcTest;


import java.sql.*;

public class JdbcTest3 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String pwd="1234";
		Connection conn=DriverManager.getConnection(url,user,pwd);
//		1)Statement 예시		
//		Statement st=conn.createStatement();
//		String sql="select * from student";
//		ResultSet rs=st.executeQuery(sql);//ResultSet은 열거형 클래스

// 		2)PreparedStatement 예시
		String sql="select * from student"; //단지 쿼리를 먼저 만들뿐 
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {//혹시 내뒤에 데이터 있니?
			String name=rs.getString("name");	//getString(컬럼명);		
			int age=rs.getInt("age");           //getInt(컬럼명);
			String addr=rs.getString(3);         //index번호로도 가지고 올수 있다. 근데 추천은 안함. 다른개발자가 보면 뭔지 모름
			String tel=rs.getString(4);
			System.out.println(name+"\t"+age+"\t"+addr+"\t"+tel);
		}
		rs.close();
		ps.close();
		//st.close();
		conn.close();
		
	}

}
