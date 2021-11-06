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
        Employe emp = new Employe("Oleg","Nikiforov", "HR",200);

        session.beginTransaction();
        session.save(emp);
//        session.getTransaction().commit();

        int myId = emp.getId();
//        session = factory.getCurrentSession();
//        session.beginTransaction();
        Employe employe =session.get(Employe.class, myId);
        session.getTransaction().commit();

            System.out.println(employe);


        } finally {
            factory.close();
        }


    }

}
