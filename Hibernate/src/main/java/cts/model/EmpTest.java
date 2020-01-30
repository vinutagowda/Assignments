package cts.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpTest {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cts");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Emp e=new Emp();
		e.setEname("vinu");
		em.persist(e);
		em.getTransaction().commit();
		em.clear();
		emf.close();
		System.out.println("inserted..............");
		

	}

}
