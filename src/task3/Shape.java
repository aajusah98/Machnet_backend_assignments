package task3;


//Create a functional interface named Shape which contains a method calculateArea. Using
//        this functional interface, calculate the area of rectangle and triangle.

@FunctionalInterface
interface ShapesArea {
    Double calculate(double length, double breadth);
}

public class Shape {
    public static void main(String[] args) {
        ShapesArea calculateAreaOfRectangle = (double length, double width)-> length*width;
        ShapesArea calculateAreaOfTriangle = (double length, double width)-> 0.5*(length*width);

        double areaOfRectangle = calculateAreaOfRectangle.calculate(10,8);
        double areaOfTriangle = calculateAreaOfTriangle.calculate(12,9);

        System.out.println("Area of Rectangle is: "+ areaOfRectangle);
        System.out.println("Area of Triangle is: "+ areaOfTriangle);
    }
}