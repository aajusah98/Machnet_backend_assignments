package task2_3;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;


/*Given an array of Students containing name, semester, age, gender.
  Create a list containing the names of all the students.
 */


public class Task2 {

    public static void main(String[] args) {
        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student("Ajay",4,22,"male"));
        studentlist.add(new Student("Ash",3,25,"Female"));
        studentlist.add(new Student("Ram",6,27,"Male"));
        studentlist.add(new Student("Tom",7,29,"Female"));
        studentlist.add(new Student("jom",3,30,"Male"));
        studentlist.add(new Student("Jonny",3,30,"Male"));

        //Fetching student names as List
        List<String> names = studentlist.stream()
                .map(n->n.name)
                .collect(Collectors.toList());
        System.out.println("List Of Name Of Student");
        System.out.println(names);





//       Task3 IN QN 2 filter all the students whose name starts with (j or J) and study in the 3rd semester.

        List <Student> studenFilter = studentlist.stream()
                .filter(e -> (e.name.startsWith("J") && e.semester == 3) ||(e.name.startsWith("j") && e.semester == 3))
                .collect(Collectors.toList());

//        Print Student whose name start with j and J and semester 3

        System.out.println(studenFilter);

//        for(Student stu : studenFilter) {
//            System.out.println(stu.name+" "+stu.semester+" "+stu.age+" "+stu.gender);
//        }





    }
}