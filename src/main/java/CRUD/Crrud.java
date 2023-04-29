package CRUD;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.Student;

@WebServlet("/ii")
public class Crrud extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	   String name=	req.getParameter("name");
	   String address=req.getParameter("address");
	   long mob=Long.parseLong(req.getParameter("mno"));
	   String [] lang=req.getParameterValues("language");
	   String country=req.getParameter("country");
	   Studentdao s=new Studentdao();
	   Student st=new Student();
	   st.setName(name);
	   st.setAddress(address);
	   st.setMob(mob);
	   st.setLang(lang);
	   st.setCountry(country);
	   s.insert(st);
	}

}
