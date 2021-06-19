/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jovi
 */

@Component
public class EquationSample {
    
    public int solve(int x) {
        
        if(x==0) {return Integer.MAX_VALUE;}
        return 10/x;
    }
    
}