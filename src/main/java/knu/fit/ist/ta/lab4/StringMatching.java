/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 19sam
 */
public class StringMatching {
    
    Matcher matcher;
    
     public int findAmountOfWordsWith3UniqueLet(String string) {
        matcher = Pattern.compile("\\b\\w\\w\\w\\b").matcher(string);
        int z = 0;
        System.out.println("results:");
        while (matcher.find()) {
            z++;
            System.out.print(matcher.start());
            System.out.println(" " + string.substring(matcher.start(), matcher.end()));
        }

        System.out.println("==================");
        
        return z;
    }
}