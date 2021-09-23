package Task5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task5 {


    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<Employees>();
        employees.add(new Employees("Ajay", 42, "Male", "It", 15000));
        employees.add(new Employees("Tom", 33, "Male", "HR", 8000));
        employees.add(new Employees("Bob", 21, "Male", "It", 50000));
        employees.add(new Employees("Kom", 22, "Male", "It", 1000));
        employees.add(new Employees("Ash", 45, "Female", "Manger", 12000));
        employees.add(new Employees("Jas", 33, "Female", "It", 1000));
        employees.add(new Employees("Tas", 22, "Female", "Manger", 1000));
        employees.add(new Employees("Has", 66, "Male", "Manger", 1000));
        employees.add(new Employees("Kas", 26, "Femla", "It", 1500));


        //Task 5 question 1
        List<Integer> salaries = employees.stream()
                .map(e->e.salary)
                .collect(Collectors.toList());

        System.out.println("Average salary: "+ averageSalary(salaries));


        //Task 5 question 2
        Set<String > department = employees.stream()
                .map(e->e.department)
                .collect(Collectors.toSet());

        System.out.println("Unique Departments: "+department);


        //Task 5 question 3
        Map<String, Double> departmentsWaiseSalary = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingInt(Employees::getSalary)));

        System.out.println(departmentsWaiseSalary);


    }

    public static Integer averageSalary(List<Integer> salary){
        int totalSalary = salary.stream().reduce(0, (acc, e) -> acc + e);
        return  totalSalary/salary.size();
    }


}
