package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SequrityAspect {

    @Before("AOP.aspects.MyPointcats.allAddMetods()")
    public void beforeAddSequrityAdvice()
    {
        System.out.println("beforeGetBookAdvice : проверка прав на получение книги");
        System.out.println("--------------------------------------");

    }

}
