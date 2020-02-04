package cts.ui;

import java.sql.Date;

import javax.persistence.EntityManager;

import cts.model.Student;
import cts.model.StudentIdentity;
import cts.util.JPAUtil;

public class Example1ForCompsitePK {
public static void main(String args[]) {
	Student s=new Student(new StudentIdentity(1,'A',7),"vinu","Aripaka",new Date(2000,5,5));
	EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
	 em.getTransaction().begin();
	 em.persist(s);
	 em.getTransaction().commit();
	 
	 System.out.println("Student saved!");
	 JPAUtil.shutdown();
}
}
