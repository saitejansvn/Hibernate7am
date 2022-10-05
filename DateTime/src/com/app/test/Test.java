package com.app.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sef = cfg.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tx = ses.beginTransaction();
		// create obj to our enitity class
		Employee e = new Employee();
		e.setEmployeeId(9);
		e.setEmployeeName("aaaa");
		e.setEmployeeSal(3.3);
		e.setEmployeejoiningDate(new Date());
		e.setEmployeejoiningTime(new Date());
		e.setEmployeeTimestamp(new Date());
		ses.save(e);
		tx.commit();
		Employee emp = (Employee) ses.get(Employee.class, 01);
		System.out.println(emp);
		ses.close();

	}
}
