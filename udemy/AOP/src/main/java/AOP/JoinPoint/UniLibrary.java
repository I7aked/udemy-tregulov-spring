package AOP.JoinPoint;

import AOP.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("unilibraryBeanJoinPoint")
public class UniLibrary extends AbstractLibrary
{
    @Override
    public void getBook()
    {
        System.out.println("Мы Взяли книгу в UniLibrary");
    }
    public void addBook(String personName, Book book)
    {
        System.out.println("добавили книгу в uniLibrary");
        System.out.println("--------------------------------------");
    }

    public void addMagazine(String personName, Book book)
    {
        System.out.println("добавили журнал в uniLibrary");
        System.out.println("--------------------------------------");
    }
}

