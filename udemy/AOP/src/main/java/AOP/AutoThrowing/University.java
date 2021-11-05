package AOP.AutoThrowing;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("UniversityBean")
public class University
{
    private List<Student> studentList = new ArrayList<>();

    public void addStudents()
    {
        Student st1 = new Student("Nikolay",4,3.5);
        Student st2 = new Student("Andrey",5,4.5);
        Student st3 = new Student("Alena",3,3.8);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

    }

    public List<Student> getStudents()
    {
        System.out.println("information = ");
        System.out.println(studentList);
        return studentList;
    }

}
