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
		String id = request.getParameter("memId");
		String pw = request.getParameter("memPw");
		
		String url = "";
		boolean method = false;
		
		ActionForward af = null;
		
		try {

			MemberDTO mem = new MemberDTO();
			mem.setId(id);
			mem.setPassword(pw);
			
			MemberDTO member = MemberDAO.getDao().member(mem);
			
			if (member == null) {
				System.out.println("없는 회원");
				
				url = "index";
				method = false;
				
				af = new ActionForward(url, method);
				
			} else {
				af =  new MemberAction().execute(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return af;
	}
}