package com.assignment3;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//Write a program to read a file. If a file does not exist, throw a runtime exception with the message “File Not Exist”.


public class task1 {

    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/assignment3/dummy.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}




