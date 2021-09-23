package Task5;

//Given an array of employees containing name, age, gender, department and salary.
//        Find the average salary of an employee.
//        Print unique departments.
//        Find the average salary of the department.


public class Employees {
    String name;
    int age;
    String gender;
    String department;
    int salary;

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }


    public Employees(String name, int age, String gender, String department, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public Integer getSalary(){
        return this.salary;
    }



}


