package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Student;

public class Test {
//main ctrl+space
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sef = cfg.buildSessionFactory();

		Session ses = sef.openSession();
          //set the data in database
		Transaction tx = ses.beginTransaction();
		Student s = new Student();
		s.setStudentId(14);
		s.setStudentName("abcde");
		s.setStudentFee(1.1);
		ses.save(s);
		tx.commit();
		ses.close();
	}

}
