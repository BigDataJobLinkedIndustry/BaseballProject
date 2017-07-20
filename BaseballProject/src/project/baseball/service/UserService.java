package project.baseball.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//앞에 안써도 이름만 만들어도됨
public interface UserService {
	//추상메소드 - 몸통없고 머리만
	//abstract안써도됨 

	/**
	 * @param request
	 * @param response
	 * @return
	 */
	public abstract NextPage execute(HttpServletRequest request, HttpServletResponse response);
}
