package com.company;

//Write a program to calculate the roots of Quadratic equations

public class Task1 {

    public static void main(String[] args) {

        Task1 questionOneObj = new Task1();
        System.out.println("Roots of a quadratic equation");

        System.out.println( questionOneObj.calculateQuadraticEquations(2.4,4,5.6));
    }


    public String calculateQuadraticEquations(double a, double b, double c){

        String answer = "";
        double determinant = (b*b)-(4*a*c);
        double root1, root2;

        if (determinant > 0) {
            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            answer = "Roots Of Equation =%.2f : "+ root1+" Roots Of Equation = %.2f :" + root2;
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {
            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            answer = "root1 = root2 = %.2f;"+root1;
        }

        else {
            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

        return answer;
    }
}
