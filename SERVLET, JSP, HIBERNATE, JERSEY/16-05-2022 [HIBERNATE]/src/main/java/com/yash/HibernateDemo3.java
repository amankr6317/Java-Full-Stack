package com.yash;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateDemo3 {

	private static SessionFactory factory;

	public static void main(String[] args) {

		try {
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
			factory = meta.getSessionFactoryBuilder().build();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		HibernateDemo3 hibernateDemo3 = new HibernateDemo3();

		/* List down all the employees */
		hibernateDemo3.listEmployees();

	}

	/* Method to READ all the employees */
//	public void listEmployees() {
//		Session session = factory.openSession();
//		Transaction tx = null;
//
//		try {
//			tx = session.beginTransaction();
//			List employees = session.createQuery("FROM EmployeeInfo").list();
//			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
//				EmployeeInfo employeeInfo = (EmployeeInfo) iterator.next();
//				System.out.print("First Name: " + employeeInfo.getEmpFname());
//				System.out.print("	Last Name: " + employeeInfo.getEmpLname());
//				System.out.print("	DOB: " + employeeInfo.getDOB());
//				System.out.print("	Gender: " + employeeInfo.getGender());
//				System.out.print("	Address: " + employeeInfo.getAddress());
//				System.out.println("	Department: " + employeeInfo.getDepartment());
//			}
//			tx.commit();
//		} catch (HibernateException e) {
//			if (tx != null)
//				tx.rollback();
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
//	}
	
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM EmployeePosition").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				EmployeePosition employeePosition = (EmployeePosition) iterator.next();
				System.out.print("ID: " + employeePosition.getID());
				System.out.print("	EmpID: " + employeePosition.getEmployeeInfo().getEmpID());
				System.out.print("	DateOfJoining: " + employeePosition.getDateOfJoining());
				System.out.println("	Salary: " + employeePosition.getSalary());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
}
