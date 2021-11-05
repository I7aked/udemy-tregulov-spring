package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1
{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("unilibraryBean",UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        uniLibrary.getBook();
        schoolLibrary.getBook();



        context.close();
    }
}
