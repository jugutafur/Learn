package Conection.Portfolio;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;	
	
	static {
		try {
			sessionFactory = new Configuration()
					.configure("Persistence/MapperXML/Proyecto/hibernate.cfg.xml")
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory create failed " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
    public static void shutdown() {
        getSessionFactory().close();
    }
}