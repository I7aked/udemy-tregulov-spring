package AOP.JoinPoint;

import AOP.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJoinPoint {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("unilibraryBeanJoinPoint", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.addBook("Zaur", book);
//        uniLibrary.addMagazine("Bvan",book);



    }
}
