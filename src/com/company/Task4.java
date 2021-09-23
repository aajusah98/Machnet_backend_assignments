package com.company;


/*
4.	Write a program to create a class named Shape. In this
class we have three sub classes Circle, Triangle and Square each
class has two member function named draw () and erase ().
        Create these using polymorphism concepts
*/

class Shapes {
    public void draw(){
        System.out.println("Shape Draw");
    }

    public void erase(){
        System.out.println("Shape Erase");
    }
}

class Circle extends Shapes {
    public void draw() {
        System.out.println("Circle Draw");
    }

    public void erase() {
        System.out.println("Circle Erase");
    }
}

class Triangle extends Shapes{
    public void draw() {
        System.out.println("Tringle Draw");
    }

    public void erase() {
        System.out.println("Tringle Erase");
    }
}

class Square extends Shapes{
    public void draw() {
        System.out.println("Square Draw");
    }

    public void erase() {
        System.out.println("Square Erase");
    }
}

public class Task4 {

    public static void main(String []arg){
        System.out.println("Hello");
        Shapes shapeObj= new Shapes();
        shapeObj.draw();
        shapeObj.erase();

        Shapes circleObj = new Circle();
        circleObj.draw();
        circleObj.draw();

        Shapes triangleObj = new Triangle();
        triangleObj.draw();
        triangleObj.erase();

        Shapes squareObj = new Square();
        squareObj.draw();
        squareObj.erase();

    }
}
