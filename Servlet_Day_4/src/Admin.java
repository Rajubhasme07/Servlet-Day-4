

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/admin")
public class Admin extends HttpServlet {
	


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rw1=request.getRequestDispatcher("about");
		rw1.forward(request, response);
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Local Server");
		out.println("</title>");
		
		out.println("</head>");	
		out.println("<body>");	
	
		out.println("<a href='index.html'>HOME</a>");	
		out.println("<a href='about'>ABOUT</a>");
		out.println("<a href='contact'>CONTACT</a>");
		out.println("<a href='profie'>PROFILE</a>"); 
		out.println("<h1>Welcome To Profile " +name+"</h1>");	
		out.println("<h3>Your User Name is " +name+"</h3>");
		out.println("<h4>Your Password is " +pass+"</h4>");	
		out.println("</body>");
	}

}
