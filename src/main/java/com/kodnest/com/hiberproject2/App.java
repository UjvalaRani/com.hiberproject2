package com.kodnest.com.hiberproject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        Laptop l1= new Laptop(1111,"dell");
        Laptop l2= new Laptop(2222,"hp");
        Laptop l3= new Laptop(3333,"lenovo");
        
        Student s1= new Student(11,"ujvala",l1);
        Student s2= new Student(12,"ujvala rani",l2);
        Student s3= new Student(13,"prabhu",l3);
        
        
        Session ss = factory.openSession();
        Transaction tran = ss.beginTransaction();
        ss.save(s1);
        ss.save(s2);
        ss.save(s3);
        ss.save(l1);
        ss.save(l2);
        ss.save(l3);
        tran.commit();
    }
}