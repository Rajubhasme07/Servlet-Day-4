

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Myprofile extends HttpServlet {
	
       
   
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("uname");
	String pass=request.getParameter("upass");
	
	
	if(pass.equals("123")){
		
	RequestDispatcher rd=request.getRequestDispatcher("admin");
	rd.forward(request, response);
	response.sendRedirect("about?nam="+name);
	response.sendRedirect("about?pass="+pass);
	response.sendRedirect("contact?nam="+name);
	response.sendRedirect("contact?pass="+pass);
	
	}
	else{
		
		request.getRequestDispatcher("index.html").include(request, response);
		out.println("<center style='color:red'><b>Wrong Password<b></center>");
	}
		
	}

}
