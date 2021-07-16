package Notebook;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
// klasa za proizvodnj notebooks..
public class HibernateUtil {
    // Instanciranje SessionFactory, static - samo jedna metoda za izradu objekata.
    // Service za Registraciju...
    private static SessionFactory factory;
    private static ServiceRegistry registry;
    
    // Potrebno nam je metod za stancanje Objekata SessionFactory, sesije..
    public static SessionFactory createSessionFactory(){
         // Potrebna mu je konfiguracija...
    Configuration con = new Configuration();
    // Ovom conf objektu potrebno je dodeliti atribute
    // Configurisati objekat.
    con.configure();
    registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    factory = con.buildSessionFactory(registry);
    return factory;
    }
   
    
}
