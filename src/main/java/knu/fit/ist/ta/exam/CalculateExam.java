/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.exam;

/**
 *
 * @author Jovi
 */
public class CalculateExam {
    
    public static double Calculate(double x)
    {
        double numerator = ((double)9);
        double denominator = (2 *(double) x-1);
        double result = (double) (numerator / denominator);
        return result;
    }
}