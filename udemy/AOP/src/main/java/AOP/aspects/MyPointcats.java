package AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcats {

    @Pointcut("execution( * abs*(..))")
    public void allAddMetods(){};



}
