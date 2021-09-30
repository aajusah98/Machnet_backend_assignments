package task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.student_name}")
    private String studentName;

    @Value("${student.student_id}")
    private int studentId;

    @Value("${student.company}")
    private String company;


    @Autowired
    private  Address address;

    @Autowired
    private Programming programming;

    public void displayStudentInfo(){
        System.out.println("--------Student Info---------");
        System.out.println("Student Id: " +   studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Working Company: " + company);
        address.displayAdress();
        programming.programming();
    }
}
