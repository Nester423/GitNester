/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.exam;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jovi
 */
public class Results {
    public List<Double> mas;
    public static List<Double> results;
    
    public Results(){
        mas = new LinkedList<Double>();
        results = new LinkedList<Double>();
    }
    
    public Results(int length)
    {
       mas = new LinkedList<Double>();
        results = new LinkedList<Double>();
        Random random = new Random();
        
        for (int i = 0; i < length; i++)
            mas.add((double)random.nextInt(25));
    }
    
    public void SetArgs(double[] mas)
    {
        this.mas.clear();
        for (int i = 0; i < mas.length; i++)
            this.mas.add(mas[i]);
    }
    
    public String Calculate()
    {
        results.clear();
        int length = mas.size();

        for (int i = 0; i < length; i++){
            double result = CalculateExam.Calculate(mas.get(i));
            BigDecimal bigDecimal = new BigDecimal(Double.toString(result));
            bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
            results.add(bigDecimal.doubleValue());
            
        }
        return results.toString();
    }
    
    public String GetArgs()
    {
        return mas.toString();
    }
}