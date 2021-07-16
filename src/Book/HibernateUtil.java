package Book;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    /* Cilj klase je kreiranje fabrike za kreiranje knjiga, SessionFactory...*/
    private static SessionFactory factory;
    private static ServiceRegistry registry;
   
    
    public static  SessionFactory createSessionFactory(){
        /*Kao i kod DBConnection kreiramo konekciju sa bazom koristeci confg. hibernate file */
        Configuration conn = new Configuration();
        conn.configure("Book/hibernate.cfg.xml");
        
        registry = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
        factory = conn.buildSessionFactory(registry);
        
        return factory;
        
    }
    
    
    
}
