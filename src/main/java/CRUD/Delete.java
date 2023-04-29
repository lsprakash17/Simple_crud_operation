package CRUD;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.Student;

@WebServlet("/delete")
public class Delete extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
	   int id=Integer.parseInt(req.getParameter("id"));
	  Studentdao stud=new Studentdao();
	  stud.Delet(id);
	  res.getWriter().print("<h1> the given id "+id+"Deleted");
	}
}
