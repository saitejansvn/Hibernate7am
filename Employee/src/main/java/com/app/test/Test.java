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
//this non-select operation save the data inside our database 
		//Transaction tx = ses.beginTransaction();
//create obj to our enitity class 
		/*Employee emp=new Employee();
		emp.setEmpId(1);
		emp.setEmpName("john");
		emp.setEmpSal(3.3);
		emp.setEmpTime(new Date());
		emp.setEmpDate(new Date());
		emp.setEmpTimestamp(new Date());
		ses.save(emp);
		tx.commit();*/
	Employee emp = (Employee) ses.get(Employee.class, 1);
	System.out.println(emp);
		ses.close();

	}
}
