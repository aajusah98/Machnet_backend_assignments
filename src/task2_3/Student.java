package task2_3;

//Given an array of Students containing name, semester, age, gender.
//        Create a list containing the names of all the students.

class Student{
    String name;
    int semester;
    int age;
    String gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                ", age=" + age +
                ", sex='" + gender + '\'' +
                '}';
    }

    public Student(String name, int semester, int age, String gender) {
        this.name = name;
        this.semester = semester;
        this.age = age;
        this.gender = gender;
    }
}
