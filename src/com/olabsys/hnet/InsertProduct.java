package com.olabsys.hnet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertProduct {

	
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Product p =new Product();
		p.setId(6);
		p.setName("anil");
		//p.setSal(450);
		
		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Successfully inserted Data");
		tx.commit();
		session.close();
		factory.close();		

	}

}
