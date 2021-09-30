package task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Calculator.class);

        Calculator calculator =context.getBean("calculator",Calculator.class);

        int div=calculator.calculate(10,'/',20);
        int mul=calculator.calculate(10,'*',20);
        int add=calculator.calculate(10,'+',20);
        int sub=calculator.calculate(10,'-',20);

        System.out.println("Divide Of Two Integer" + div);
        System.out.println("Multiplication Of Two Integer" + mul);
        System.out.println("Sum Of Two Integer" + add);
        System.out.println("Subtraction Of Two Integer" + sub);

    }

}
