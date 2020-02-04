package cts.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import cts.model.model1.Course;
import cts.model.model1.Trainee;
import cts.util.JPAUtil;

public class Example4OneToMany {

	public static void main(String[] args) {
      Course mca=new Course(101,"MCA",new TreeSet<Trainee>());
      Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
      
      mca.getTrainees().add(new Trainee(201,"vinu",mca));
      mca.getTrainees().add(new Trainee(202,"abhi",mca));
      mca.getTrainees().add(new Trainee(203,"megha",mca));
      
      
      mba.getTrainees().add(new Trainee(204,"preethi",mba));
      mba.getTrainees().add(new Trainee(205,"rashmi",mba));
      mba.getTrainees().add(new Trainee(206,"chinnu",mba));
      EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
      EntityTransaction txn=em.getTransaction();
      
      
      txn.begin();
      em.persist(mca);
      em.persist(mba);
      txn.commit();
      JPAUtil.shutdown();
	}

}
