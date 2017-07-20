package project.baseball.dao;

public class SearchDAO {
	// 싱글턴 패턴--------------------------------------
	private static SearchDAO dao = new SearchDAO();

	private SearchDAO() {
		}

	public static SearchDAO getInstance() {
		return dao;
	}

	// ----------------------------------------------
	public void selectHomeRun() {

	}

	public void selectFoul() {

	}

	public void selectStadium() {

	}

}
