package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class testhibernate {

	public static void main(String[] args) {
		student user=new student();
		 user.setName("Malhar");
		 user.setUserid("Mh235");
        user.setPassword("vm@UP");
        
      try{
        SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionfactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        //sessionfactory.close();
        System.out.println("Saved The Object Data Successfully!");
        
        /* user=null;                                             //code to retrieve object from database
        session=sessionfactory.openSession();
        session.beginTransaction();
        user=(student)session.get(student.class,"Mh234");
        System.out.println("The Name of the student is " +user.getName());
        session.close();*/
        
        
        
      }
      catch(Exception e){
   	   e.printStackTrace();
      }


	}

}
