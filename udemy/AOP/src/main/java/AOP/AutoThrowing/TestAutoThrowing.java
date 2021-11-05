package AOP.AutoThrowing;

import AOP.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestAutoThrowing {


        public static void main(String[] args) {


            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(MyConfig.class);

            University university = context.getBean("UniversityBean", University.class);
            university.addStudents();
            List<Student> students = university.getStudents();
            try {
                System.out.println(students.get(1));
            } catch (Exception e)
            {
                System.out.println("было поймано исключение" + e);
            }



            context.close();
        }
    }

