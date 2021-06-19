/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

/**
 *
 * @author Jovi
 */
public class Recursion {
    String s = "";
    
    public String reverseDigits(int number) { 
        if (number < 0) {
            number = number * (-1);
            
            int b = number/10;
            int a = number % 10;  

            s += a; 
        
        if (b == 0) return "-" + s;
        if (number == 0) return "0";
        return reverseDigits(b*(-1));  
        }
        
        int b = number/10;
        int a = number % 10;  

        s += a; 
        
        if (b == 0) return s;
        if (number == 0) return "0";
        return reverseDigits(b);   
    }
}