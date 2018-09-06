/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investone;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author ranmartz
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
  try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();                    
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceregistry);
            return sessionFactory;
        } catch (HibernateException e) {
            System.out.println("La creación de Session Factory a fallado "+e) ;
            throw new ExceptionInInitializerError();
        }            
    }

    /**
     * @return the sessionfactory
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
