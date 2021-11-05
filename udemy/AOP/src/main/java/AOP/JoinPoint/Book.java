package AOP.JoinPoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Dostoevskiy")
    private String author;

    @Value("1828")
    private String year;

    @Value("prestuplenie i td")
    private String name;

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
