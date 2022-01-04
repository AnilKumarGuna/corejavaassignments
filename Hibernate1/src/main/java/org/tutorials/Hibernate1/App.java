package org.tutorials.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
       SessionFactory factory= cfg.buildSessionFactory();
       System.out.println(factory);
       ProductDetails st=new ProductDetails();
		st.setId(106);
		st.setName("bottle");
		st.setDesc("liquid storage device");
		st.setPrice(20);
		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		session.save(st);
		session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }
}
