package hibernate_test.entiti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employe.class)
                .buildSessionFactory();

        try {
        Session session = factory.getCurrentSession();
        Employe emp = new Employe("Nikolay","Zhigulin", "It",100);

        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        } finally {
            factory.close();
        }


    }

}
