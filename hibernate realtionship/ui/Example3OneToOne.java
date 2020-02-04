package cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import cts.model.model1.BankAccount;
import cts.model.model1.Customer;
import cts.util.JPAUtil;

public class Example3OneToOne {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("123273432","Sundar",ba);
		ba.setAccno("SB002");
		ba.setCustomer(cs);
		
	EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
	EntityTransaction txn=em.getTransaction();
	
	txn.begin();
	em.persist(cs);
	txn.commit();
     JPAUtil.shutdown();
	}

}
