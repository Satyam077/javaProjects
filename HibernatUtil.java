package com.Student_Mgt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
        cfg.configure();
       
   
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();

	}

	public static Session getSession() {
	
		return null;
	}

}
