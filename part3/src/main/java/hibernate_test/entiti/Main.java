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
//        Employe emp = new Employe("Andrei","Petrov", "HR",300);
//        Details details = new Details("Anapa",331848,"andrei@com");
//        emp.setDetails(details);

        session.beginTransaction();
//        session.save(emp);
        Details details= session.get(Details.class,4);

//        int myId = emp.getId();
//        session = factory.getCurrentSession();
//        session.beginTransaction();
            System.out.println(details);
        session.delete(details.getEmp());
        session.getTransaction().commit();



        } finally {
            assert session != null;
            session.close();
            factory.close();
        }


    }

}
