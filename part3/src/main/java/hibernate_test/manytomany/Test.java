package hibernate_test.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test
{
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();


        Session session = null;

        try{
            session = factory.getCurrentSession();
//            Section section1 = new Section("Footbal");
//            Section section2 = new Section("Volleybol");
//            Section section3 = new Section("Dance");
//
//            Child child = new Child("Zaur", 5);
//            Child child1 = new Child("Andrei", 3);
//            Child child2 = new Child("Petr", 4);
//
//            child2.addSectionToChild(section2);
//            child2.addSectionToChild(section3);
            session.beginTransaction();
            Child child = session.get(Child.class,4);
            System.out.println(child);
            System.out.println(child.getSection());


            session.getTransaction().commit();
        }

        finally {
        session.close();
        factory.close();
        }


    }
}
