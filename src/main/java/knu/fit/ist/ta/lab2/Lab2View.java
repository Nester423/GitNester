/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import java.text.DecimalFormat;
import org.springframework.stereotype.Service;

/**
 *
 * @author 19sam
 */

@Service
public class Lab2View {
    
    DecimalFormat df = new DecimalFormat("###.##");
    
    public String showResult(String xString) {
        if(xString.equals("")) {return "Please enter x";}
       Float x = Float.parseFloat(xString);
       
       if (x<0) {return "Wrong x. Must be positiive or zero";}
       else if(0.01*Math.round(x*100) == 1.55) {return df.format(Integer.MAX_VALUE);}
       else {return df.format(Calculate.lab2equation(x));}
    } 
    
}