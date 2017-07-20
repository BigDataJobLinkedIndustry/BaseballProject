package project.baseball.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchDAO {
	// 싱글턴 패턴--------------------------------------
	private static SearchDAO dao = new SearchDAO();

	private SearchDAO() {
		}

	public static SearchDAO getInstance() {
		return dao;
	}

	// ----------------------------------------------
	public void selectStadiumHomeRun() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	}

	public void selectStadiumFoul() {

	}

	public void selectStadium() {

	}

}
