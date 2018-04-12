import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/Html");
ArrayList userNameList= new ArrayList ();
		
		String userNameString= new String();
		
		req.setAttribute("testName", req.getParameter("username"));
		
		String nextJSP="/WEB-INF/HW.jsp";
		RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req,resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	protected void SaveUserName() {
		
		
	}

}
