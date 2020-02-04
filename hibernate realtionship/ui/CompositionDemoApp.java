package cts.ui;

import javax.persistence.EntityManager;

import cts.model.model1.composition.Address;
import cts.model.model1.composition.Faculty;
import cts.util.JPAUtil;

public class CompositionDemoApp {
public static  void main(String args[]) {
	Faculty f=new Faculty("bhanu",
			new  Address("serling  brookside Apartment","Bangalore","Karnataka."));
	EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	em.persist(f);
 //em.flush();
	em.getTransaction().commit();
	System.out.println("Faculty Saved!");
	JPAUtil.shutdown();
}
}
