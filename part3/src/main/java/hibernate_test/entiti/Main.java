package hibernate_test.entiti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employe.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
        Session session = null;


        try {
        session = factory.getCurrentSession();
        Employe emp = new Employe("Oleg","Nikiforov", "HR",200);
        Details details = new Details("Kras",884848,"oleg@com");
        emp.setDetails(details);

        session.beginTransaction();
//        session.save(emp);
//        session.getTransaction().commit();

//        int myId = emp.getId();
//        session = factory.getCurrentSession();
//        session.beginTransaction();
        Employe employe =session.get(Employe.class, 1);
        session.getTransaction().commit();

            System.out.println(employe);


        } finally {
            assert session != null;
            session.close();
            factory.close();
        }


    }

}
