/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unity;
import java.util.Random;

/**
 *
 * @author julia
 */
public class Operations {
       public static int NextNumber(int userNumber){
       return userNumber + 1;
    }
    public static boolean IsDivisible(int firstNumber,int secondNumber){
     int moduleResult = secondNumber % firstNumber;
     return moduleResult == 0;
    }   
    public static int GenerateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(41) + 10; 
    }

    public static double DecreaseBy15Percent(int number) {
        return number * 0.85; 
    }
     public static String CheckNumber(int number) {
        if (number < 0) {
            return "El número es negativo";
        } else if (number > 0) {
            return "El número es positivo";
        } else {
            return "El número es cero";
        }
     }
     

}
