package com.olabsys.hnet;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PaymentLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		CreditCard cc = new CreditCard();
		cc.setPaymentId(104);
		cc.setAmount(10000);
		cc.setCreditCardType("Debit");
		
		Cheque cq = new Cheque();
		cq.setAmount(20000);
		cq.setChequeType("HDFC");
		cq.setPaymentId(103);
		
		 
		Transaction tx=session.beginTransaction();
		session.save(cc);
		session.save(cq);
		
		System.out.println(" sucessfully saved data.");
		tx.commit();
		session.close();
		factory.close();
		
		
		
		

	}

}
