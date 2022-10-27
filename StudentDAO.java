package com.Student_Mgt;

import javax.transaction.Transaction;

import org.hibernate.Session;

public class StudentDAO {
	
	public static boolean insertStudent(Student s) {
	
		
		try {
			Session session=HibernateUtil.getSession();
			Transaction t=(Transaction) session.beginTransaction();
			session.save(s);
			t.commit();
			return true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	
public static boolean getStudent(Student s) {
	
		
		try {
			Session session=HibernateUtil.getSession();
			Transaction t=(Transaction) session.beginTransaction();
			session.save(s);
			t.commit();
			return true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
	}

public static boolean deleteStudent(Student s) {
	
	
	try {
		Session session=HibernateUtil.getSession();
		Transaction t=(Transaction) session.beginTransaction();
		session.save(s);
		t.commit();
		return true;
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return false;

}
public static boolean updateStudent(Student s) {
	
	
	try {
		Session session=HibernateUtil.getSession();
		Transaction t=(Transaction) session.beginTransaction();
		session.save(s);
		t.commit();
		return true;
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return false;
	
	
}

}
