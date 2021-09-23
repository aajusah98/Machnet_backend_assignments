package task1;

import java.util.Arrays;
import java.util.stream.IntStream;


//Task1: Sum integer array containing numbers from 1 - 50 using reduce operation.

public class Task1 {

    public static void main(String[] args){

        int[] array = new int[50];


        IntStream.range(1,51).forEach(i->{
            array[i-1]= i;
        });

        System.out.println(array);

        System.out.println("Printing array elements : ");
//        Arrays.stream(array)
//                .forEach(e->System.out.print(e + " "));

        int sum = Arrays.stream(array)
                .reduce(0,(acc,e)->acc+e);

        System.out.println("Sum integer array containing numbers from 1 - 50: " + sum);
    }
}
