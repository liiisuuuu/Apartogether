package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.MemberDAO;
import dto.MemberDTO;

public class MemberAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String url = "member/memberList";
		boolean method = false;
		
		List<MemberDTO> list = MemberDAO.getDao().memberList();
		request.setAttribute("list", list);
		request.setAttribute("msg", "ListPage");
		
		return new ActionForward(url, method);
	}
}