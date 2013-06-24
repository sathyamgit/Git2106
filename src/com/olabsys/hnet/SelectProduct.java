package com.olabsys.hnet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Object o =session.load(Product.class,new Integer(1));
		Product p=(Product)o;
		
		System.out.println(p.getId()+ "\t "+p.getName()+" \t " +p.getSal());
		
		session.close();
		factory.close();
		
		

	}

}
