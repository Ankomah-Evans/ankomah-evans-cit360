package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	public static void main(String[] args) {
		// Create a session factory
		SessionFactory factory = new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(Employee.class)
		.buildSessionFactory();
	
		
		// Create a session
		Session session = factory.getCurrentSession();
		
		try {
			// Create object
			System.out.println("Creating a new Employee object...");
			Employee myEmployee = new Employee(" Nana Baah", 0);
			
			// Start transaction
			session.beginTransaction();
			
			// Save object
			System.out.println("Saving Employee names...");
			session.save(myEmployee);
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
		} finally {
			factory.close();
		}
	}
}
		