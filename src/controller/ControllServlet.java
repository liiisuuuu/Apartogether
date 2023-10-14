package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

@WebServlet("*.ict")
public class ControllServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		request.setCharacterEncoding("euc-kr");
		
		String cmd = request.getParameter("cmd");
		Action action = null;
		
		if (cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			action = factory.getAction(cmd); //memberList
			ActionForward af = action.execute(request, response);
			
			if (af.isMethod()) {
				response.sendRedirect(af.getUrl());
				
			} else { // forward
				String path = "/WEB-INF/views";
				RequestDispatcher rd = request.getRequestDispatcher(path + "/" + af.getUrl() + ".jsp");
				rd.forward(request, response);
			}
			
		} else {
			response.setContentType("type/html);charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.print("<h2>��û�Ͻ� �������� ���� ���� �ʽ��ϴ�. </h2>");
			out.close();
		}
	}
}
