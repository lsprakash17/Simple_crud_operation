package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;

public class Studentdao 
{
EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
EntityManager m=e.createEntityManager();
EntityTransaction t=m.getTransaction();

public void insert(Student S)
{
	t.begin();
	m.persist(S);
	t.commit();
}
public List<Student> Fetchall()
{
	return m.createQuery("select g from Student g").getResultList();
}
public Student Fetch(int id)
{
	return m.find(Student.class, id);
}
public void Delet(int id)
{
 Student s=m.find(Student.class, id);
	t.begin();
	m.remove(s);
	t.commit();
}
}
