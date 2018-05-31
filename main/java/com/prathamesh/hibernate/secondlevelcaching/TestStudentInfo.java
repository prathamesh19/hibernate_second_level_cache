package com.prathamesh.hibernate.secondlevelcaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1= new Student(101, "abc");
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s1= sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(st1);
		s1.flush();
		tr.commit();
		
		
		s1.evict(st1);
		System.out.println("evicted the object from session");
		
		System.out.println("before get");
		Student st2 = s1.get(Student.class,101);
		System.out.println("after get" + st2);
		s1.close();

		
		Session s2 = sf.openSession();
		System.out.println("before get ob using s2");
		Student st3 = s2.get(Student.class,101);
		System.out.println("after get ob using s2" + st3);
	}

}
