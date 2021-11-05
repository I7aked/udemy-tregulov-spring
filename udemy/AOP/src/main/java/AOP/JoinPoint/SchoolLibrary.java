package AOP.JoinPoint;

import AOP.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component("schoolLibraryBeanJoinPoint")
public class SchoolLibrary extends AbstractLibrary
{
    @Override
    public void getBook() {
        System.out.println("Взяли книгу из SHoolLibrary");
        System.out.println("--------------------------------------");
    }

    public void addBook(String personName, Book book)
    {
        System.out.println("добавили книгу в shoolLibrary");
        System.out.println("--------------------------------------");
    }

    public void addMagazine(String personName, Book book)
    {
        System.out.println("добавили журнал в shoolLibrary");
        System.out.println("--------------------------------------");
    }

}
