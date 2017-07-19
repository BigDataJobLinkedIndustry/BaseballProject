package project.baseball.util;
//javadoc
/**
 * DB 서버 연결 관리하는 클래스(1,2,6)
 * @author cse
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	//접속하는 것을 만듬
	//jdbc로드는 한번만 로드하면 됨
	//static은 한 번만 실행이됨
	
	/*//로드 할 때 만들어짐--클래스(메소드)영역에 메모리 만들어짐
	//private static int a;
	
	//new할때 힙에 만들어짐
	//private int b;*/
	
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String CON_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID = "test";
	private static final String USER_PWD = "1234";
	
	//클래스 로드할때 한번만 실행시키는 것
	//클래스당 하나 만들때
	static {
		try {
			Class.forName(DRIVER_NAME);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	/**
	 * 데이터베이스 서버 연결하는 메소드
	 * @return Connection 데이터 베이스 연결 정보 객체 반환
	 * @throws SQLException
	 */
	//객체를 생성 하지 않아도 됨
	public static Connection getConnection() throws SQLException {
		/*Connection con = DriverManager.getConnection("","","");
		return con; 밑의 한줄로 줄임*/
		//()안을 일일히 써도 되고 상수로 만들수 있음
		//static붙어있으면 클래스이름.(DBUtil.CON_URL)으로 써야 함
		return DriverManager.getConnection(CON_URL,USER_ID,USER_PWD);
	}
	/**
	 * 데이터 베이스 연결시 사용한 자원 해제
	 * @param
	 * @return
	 * 
	 */
	//닫는 것을 만듬
	//객체가 생성될 때마다 생성
	//con이랑 pstmt를 종료해야하는데 매니저에서 가져와야 함
	public static void close(PreparedStatement pstmt,Connection con) {
		if(pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(con != null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void close(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}

}
