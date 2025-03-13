package billy.hibernate_project.utils;

import billy.hibernate_project.entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try{
            sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
