package com.company;

/*2.	Write a program to create a Room class, the attributes of this class
    is roomno, roomtype, roomarea and acMachine with type: integer, String, float
     and boolean respectively. In this class
    the member functions are setData and displayData.
*/

public class Task2 {

    int roomNo;
    String roomType;
    float roomArea;
    boolean acMachine;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Question number Two ");
        Task2 roomObj = new Task2();
        roomObj.setData(100,"Ac room",30.0f,true);
        roomObj.displayData();
    }

    public void setData(int roomno, String roomtype, float roomarea, boolean acmachine){
        roomNo= roomno;
        roomType= roomtype;
        roomArea= roomarea;
        acMachine= acmachine;
    }

    public void displayData(){
        System.out.println(
                " Room number: "+ roomNo +'\n'+
                        " Room Type: "+roomType+"\n" +
                        " Room Area: "+ roomArea+ " foot \n"+
                        " Room have Ac: "+((acMachine)? "Yes":"No")
        );

    }
}
