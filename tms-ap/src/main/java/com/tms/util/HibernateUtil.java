package com.tms.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.tms.beans.Employee;
import com.tms.beans.Toc;
import com.tms.beans.Trainer;

/**
 *
 * @author Ashish
 *
 */
public class HibernateUtil {

	public static SessionFactory sessionfactory = null;

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		configuration.addAnnotatedClass(Trainer.class);
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Toc.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);

	}
}
