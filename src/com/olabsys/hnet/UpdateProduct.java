package com.olabsys.hnet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Object o =session.load(Product.class, new Integer(5));
		Product p = (Product)o;
		
		
		Transaction tx =session.beginTransaction();
		p.setName("abdul hamid");
		p.setSal(2000);
		tx.commit();
		System.out.println("successfully updated in DB");
		
		session.close();
		factory.close();
		
		
		
		
	}

}
