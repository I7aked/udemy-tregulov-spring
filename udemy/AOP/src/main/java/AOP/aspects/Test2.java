package AOP.aspects;

import AOP.MyConfig;
import AOP.SchoolLibrary;
import AOP.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("unilibraryBean",UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        uniLibrary.getBook();
        schoolLibrary.getBook();



        context.close();
    }

}
