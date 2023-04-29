package CRUD;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.catalina.tribes.util.Arrays;

import dao.Studentdao;
import dto.Student;
@WebServlet("/id")
public class FetchID extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		Studentdao st=new Studentdao();
        Student student=st.Fetch(Integer.parseInt(req.getParameter("id")));
        if(student==null)
        {
        	res.getWriter().print("<h1>Data Not Foud</h1>");
        }
        else
        {
        	res.getWriter().print("<html>"
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
        	res.getWriter().print("<tr>"
					+ "<th>"+student.getId()+"</th>"
					+ "<th>"+student.getName()+"</th>"
					+ "<th>"+student.getAddress()+"</th>"
					+ "<th>"+student.getMob()+"</th>"
							+ "<th>"+Arrays.toString(student.getLang())+"</th>"
					+ "<th>"+student.getCountry()+"</th>"
					+ "</tr>");
			   res.getWriter().print("</table><a href='home.html'>Home</a></body></html>"); 
        }
	}

}
