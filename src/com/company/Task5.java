package com.company;

/*5.	Write a program to create interface named Test. In this interface the
        member function is calculateSquare. Implement this interface in
        Arithmetic class. Create one new class called ToTestInt, in this class use the object of Arithmetic class.
*/

interface Test{
    int calculateSquare(int value);
}

class  Arithmetic implements Test{
    public int calculateSquare(int value){
        return (value*value);
    }
}

public class Task5 {
    public static void main (String []arg){
        int value = 6;
        Arithmetic  Obj = new  Arithmetic();

        System.out.println(
                "Square of "+value+" is "+Obj.calculateSquare(value)
        );

    }
}
