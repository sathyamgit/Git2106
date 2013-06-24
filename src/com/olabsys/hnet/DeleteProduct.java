package com.olabsys.hnet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Object o = session.load(Product.class,new Integer(1));
		Product p=(Product)o;
		
		Transaction tx = session.beginTransaction();
		session.delete(p);
		
		tx.commit();
		System.out.println("Record deleted successfully from DB");
		
		session.close();
		factory.close();
		

		
		
		
		
		

	}

}
