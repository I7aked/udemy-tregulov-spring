package AOP.aspects;

import AOP.JoinPoint.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect
{

    @Before("AOP.aspects.MyPointcats.allAddMetods()")
    public void beforeAddBookAdvice(JoinPoint joinPoint)
    {
        System.out.println("beforeAddBookAdvice : попытка получить книгу");
        System.out.println("--------------------------------------");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature" + methodSignature);
        System.out.println("getMethod" + methodSignature.getMethod());
        System.out.println("getReturnType" + methodSignature.getReturnType());

        if(methodSignature.getName().equals("addBook"))
        {
            Object[] arg = joinPoint.getArgs();

            for (Object obj:arg)
            {
                if (obj instanceof Book)
                {
                    Book myBook = (Book)obj;
                    System.out.println("информация о книге = "
                    + myBook.getAuthor() + " автор "
                            + myBook.getName() + " название "
                            + myBook.getYear() + "год издания");
                } else if (obj instanceof String)
                {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }


    }

}
