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
 * @author Jovi
 */
@Service
public class Laba2View {
    
    DecimalFormat df = new DecimalFormat("###.##");
  
    public String showResult(String xString) {

        if(xString.equals("")){return "Please enter x";}
        
        Float x = Float.parseFloat(xString);

        if (x < 0) {
            return "Wrong x. Must be positive";
        }
        else if(1<1) {return "";}
        else {
            return df.format(Calculate.lab2equation(x));
        }

    }

}
