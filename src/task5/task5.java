package task5;

//Generate random integers of size 100 and sort them using stream API in descending order.

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class task5 {
    public static void main(String []args) {
        List<Integer> numList= new Random().ints(100, 1,100).boxed().collect(Collectors.toList());
        List<Integer> numbersInDescending=numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());



        System.out.println("Random integers of size 100 : \n"+numList);
        System.out.println("Random integers of size 100 in descending order: \n"+numbersInDescending);
    }
}