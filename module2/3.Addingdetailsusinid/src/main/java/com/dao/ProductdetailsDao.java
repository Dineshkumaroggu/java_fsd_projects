package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.productdetails;

public class ProductdetailsDao {
	
	public int storeProduct(productdetails pd) {
    	try {
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");                //load xml files it must be inside src
    	SessionFactory sf=con.buildSessionFactory();        //connection
    	Session session=sf.openSession();                     //statement or prepared
    	Transaction tran=session.getTransaction();
    	tran.begin();
    	session.save(pd);                                  //insert query
    	tran.commit();
    	return 1;
    	}
    	catch(Exception e) {
    		System.out.println(e);
    		return 0;
    	}
    }
}