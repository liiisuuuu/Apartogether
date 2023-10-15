package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.MemberDAO;
import dto.MemberDTO;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String url = "index";
		boolean method = false;
		ActionForward af = new ActionForward(url, method);
		
		if (request.getMethod().equalsIgnoreCase("post")) {
			String id = request.getParameter("memId");
			String pw = request.getParameter("memPw");
			
			MemberDTO mem = new MemberDTO();
			mem.setId(id);
			mem.setPassword(pw);
			
			try {
				MemberDTO member = MemberDAO.getDao().member(mem);
				
				if (member == null) {
					System.out.println("없는 회원");
					
				} else {
					af =  new MemberAction().execute(request, response);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return af;
	}
}