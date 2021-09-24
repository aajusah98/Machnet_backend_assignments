package task2;

import java.util.function.Supplier;
import java.util.stream.IntStream;


//Write a supplier which gives two digit random prime numbers.


public class task2 {

    public static boolean isPrime(int value){
        return value > 1 && IntStream.rangeClosed(2, value/ 2).noneMatch(i -> value% i == 0);
    }

    public static void main(String[] args) {
        Supplier<Integer> primeNumber=()->(int)(Math.random()*(91)+10);
        int number=0;

        while(!isPrime(number)){
            number=primeNumber.get();
        }
        System.out.println("The Random Prime Number is: "+number);
    }
}