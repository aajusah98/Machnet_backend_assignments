package task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Configuration.class);
        Student student =context.getBean("student",Student.class);
        Student student1 =context.getBean("student",Student.class);

        if (student.hashCode() == student1.hashCode()) {
            System.out.println("Objects are same with hash code respectively: student 1--> " + student.hashCode() + "  student2-->   " + student1.hashCode());
        } else {
            System.out.println("Objects are different with hash code respectively: student 1--> " + student.hashCode() + "   student2-->   " + student1.hashCode());
        }

    }
}
