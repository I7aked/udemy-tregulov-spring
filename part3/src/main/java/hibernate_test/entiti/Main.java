package hibernate_test.entiti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employe.class)
                .addAnnotatedClass(Departmen.class)
                .buildSessionFactory();
        Session session = null;


        try {
            session = factory.getCurrentSession();
            Employe emp = new Employe("Andrei", "Petrov", 30);
            Employe emp1 = new Employe("Petr", "Visokiy", 40);
            Employe emp2 = new Employe("Sergei", "Nizkii", 50);

            session.beginTransaction();
            Departmen departmen = session.get(Departmen.class, 2);
//            departmen.addEmploye(emp);
//            departmen.addEmploye(emp1);
//            departmen.addEmploye(emp2);


            session.delete(departmen);

//            Employe emp = session.get(Employe.class,1);
//            Employe emp2 = session.get(Employe.class,2);
//            Employe emp3 = session.get(Employe.class,3);
//
//            session.delete(emp);
//            session.delete(emp2);
//            session.delete(emp3);
//            Departmen departmen = session.get(Departmen.class, 1);
//            session.delete(departmen);



            session.getTransaction().commit();


        } finally {
            assert session != null;
            session.close();
            factory.close();
        }


    }

}
