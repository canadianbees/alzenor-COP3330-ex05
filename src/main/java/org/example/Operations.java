/*
 *  UCF COP3330 Fall 2021 Operations Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Scanner;

public class Operations
{
    String fNum;
    String sNum;

    //asks user for two numbers
    public Operations() {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the first number? ");
        this.fNum = scan.nextLine();

        System.out.print("What is the second number? ");
        this.sNum = scan.nextLine();
    }

    
    public void Maths()
    {
        //converts strings to integers
        int firstNum = Integer.parseInt(this.fNum);
        int secondNum = Integer.parseInt(this.sNum);

        //does necessary operations
        System.out.println(
        this.fNum+ " + "+this.sNum+ " = "+(firstNum+secondNum)+"\n"
        +this.fNum+ " - "+this.sNum+ " = "+(firstNum-secondNum)+"\n"
        +this.fNum+ " * "+this.sNum+ " = "+(firstNum*secondNum)+"\n"
        +this.fNum+ " / "+this.sNum+ " = "+(firstNum/secondNum));
    }


}
