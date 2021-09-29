package task3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student student2= (Student) applicationContext.getBean("student3");
        Address address= (Address) applicationContext.getBean("address2");

        System.out.println(address);
        System.out.println(student2);
    }
}
