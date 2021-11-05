package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect
{

    @Around("execution(* returnBook())")
    public Object aroudReturnBookLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroudReturnBookLoggingAspect: в библиотеку пытаются вернуть книгу");
        long begin = System.currentTimeMillis();
         Object targetMetodRezult = proceedingJoinPoint.proceed();
        long end =System.currentTimeMillis();
        System.out.println("aroudReturnBookLoggingAspect: в библиотеку успешно вернули " +
                "книгу и время работы :" + (end - begin) + " мс");
        return  targetMetodRezult;

    }
}
