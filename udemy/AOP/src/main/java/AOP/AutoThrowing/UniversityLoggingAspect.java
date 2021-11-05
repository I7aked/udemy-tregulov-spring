package AOP.AutoThrowing;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice = логгируем получение списка студентов " +
//                "перед методом getStudents");
//
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        System.out.println("afterGetStudentsLoggingAdvice = логгируем получение списка студентов " +
//                "после методом getStudents");
//        Student firstStudent = students.get(0);
//        String nameSurname = "Mr." + firstStudent.getNameSurname();
//        firstStudent.setNameSurname(nameSurname);
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLogging(Throwable exception)
    {
        System.out.println("afterThrowingGetStudentsLogging = логгируме выброс исключения");
    }


    @After("execution(* getStudents())")
    public void afterGetStudentsLogging(){
        System.out.println("Всё нормально закончилось");
    }
}
