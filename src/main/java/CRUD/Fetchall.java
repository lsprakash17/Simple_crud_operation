package CRUD;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

import dao.Studentdao;
import dto.Student;

@WebServlet("/fetchall")
public class Fetchall extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.getWriter().print("<html>"
	 		+ "<body>"
			 +"<table border='1'>"
			 +"<tr>"
	 		+"<th>Id</th>"
	 		+"<th>Name</th>"
			+ "<th>Address</th>"
			+ "<th>Mobile:</th>"
			+ "<th>Language</th>"
			+ "<th>country</th>"
			+"</tr>"
			);
	 Studentdao s=new Studentdao();
	 List<Student> st=s.Fetchall();
	 for(Student student:st)
	 {
		 resp.getWriter().print("<tr>"
					+ "<th>"+student.getId()+"</th>"
					+ "<th>"+student.getName()+"</th>"
					+ "<th>"+student.getAddress()+"</th>"
					+ "<th>"+student.getMob()+"</th>"
							+ "<th>"+Arrays.toString(student.getLang())+"</th>"
					+ "<th>"+student.getCountry()+"</th>"
					+ "</tr>");
		}
			   resp.getWriter().print("</table><a href='home.html'>Home</a></body></html>"); 
	 }
}
