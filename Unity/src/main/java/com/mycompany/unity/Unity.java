/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unity;
import java.util.Scanner;
import com.mycompany.unity.Operations;

/**
 *
 * @author julian
 */
public class Unity {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(" 1. add next number");
        /**Ejercicio 3*/System.out.println("2. Generate random number and decrease by 15%");
        /**Ejercicio 12*/System.out.println("3. Check if a number is negative, positive, or zero");
        System.out.println("10. base1 two numbers return devisible");
        Scanner im = new Scanner(System.in);
        String userResult = im.next();
        
        switch (userResult){
            case "1":
                System.out.println("Type an Integer number");
                String userNumber = im.next();
                int userNumberInt=Integer.parseInt(userNumber);
                int nextResult = Operations.NextNumber(userNumberInt);
                System.out.println(nextResult);
                break;
                case "2":
                int randomNumber = Operations.GenerateRandomNumber();
                System.out.println("Random number between 10 and 50: " + randomNumber);
                double decreasedNumber = Operations.DecreaseBy15Percent(randomNumber);
                System.out.println("Decreased by 15%: " + decreasedNumber);
                break;
                case "3":
                System.out.println("Enter a number: ");
                int userNumbers = im.nextInt();
                String result = Operations.CheckNumber(userNumbers);
                System.out.println(result);
                break;
                case "10":
                System.out.println("Type an integer number");
                String firstDivisibleNumber = im.next();
                System.out.println("Type a second integer number");
                String secondDivisibleNumber = im.next();
                boolean results = Operations.IsDivisible(Integer.parseInt(firstDivisibleNumber),Integer.parseInt(secondDivisibleNumber));
                    if (results) {
                        System.out.println(secondDivisibleNumber+"is divisible into"+firstDivisibleNumber);
                    }else{
                      System.out.println(secondDivisibleNumber+"is not divisible into"+firstDivisibleNumber);
                    }
                break;
                default:
                    throw new AssertionError();
        }
        System.out.println("Cambio del segundo branch");
            
    }
}
