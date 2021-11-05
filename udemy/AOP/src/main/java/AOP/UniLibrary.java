package AOP;

import org.springframework.stereotype.Component;

@Component("unilibraryBean")
public class UniLibrary extends AbstractLibrary
{
    @Override
    public void getBook()
    {
        System.out.println("Мы Взяли книгу в UniLibrary");
    }

    public String returnBook()
    {

       return "Война и мир";
    }
}

