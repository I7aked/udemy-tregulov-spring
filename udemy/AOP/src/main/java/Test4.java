import AOP.MyConfig;
import AOP.SchoolLibrary;
import AOP.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4
{

    public static void main(String[] args) {

        System.out.println("Main start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("unilibraryBean",UniLibrary.class);


       String bookName = uniLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу " + bookName);



        context.close();
        System.out.println("Main end");

    }
}
