package task4;
//
//Create an array list containing the names of people. Using predicate, find the name that starts

//        with “a” or “A” and contains length no more than 5.

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class task4 {

    public static void main(String[] args) {
        List<String> peopleList = Arrays.asList("Ajay", "Aku", "Aloo", "Ploo", "toolu", "Arjun", "Ankit", "Akuman", "ajuka", "alopoa", "anupa");

        Predicate<String> startsWithA = e -> e.toLowerCase().startsWith("a") && e.length()<=5 ;

        List<String> peopleNameStartWithA = peopleList.stream()
                .filter(e -> startsWithA.test(e))
                .collect(Collectors.toList());

        System.out.println("Name that starts with “a” or “A” and contains length no more than 5: "+peopleNameStartWithA);
    }
}