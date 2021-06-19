/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;

/**
 *
 * @author 19sam
 */
public class Lab4Task {
       
    Matcher matcher;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
       StringProcessing sp = new StringProcessing();
       StringMatching sm = new StringMatching();
       List list = sp.getList(sp.text);
       Set set = sp.getSet(sp.text);
  
       System.out.println(list);
       System.out.println(list.size());
       System.out.println("=====================");
       System.out.println(set);
       System.out.println(set.size());
       System.out.println("==========find6MostFrequentWords===========");
       System.out.println(sp.find6MostFrequentWords(sp.text));
       System.out.println("============findAmountOfWordsWithoutV=========");
       System.out.println(sp.findAmountOfWordsWithoutV(sp.getText()));
       
       System.out.println("=========findAmountOfWordsWith3UniqueLet============");
       System.out.println(sp.findAmountOfWordsWith3UniqueLet(sp.getText()));
       
       System.out.println("===========find4MostPopular3Sequences==========");
       System.out.println(sp.find4MostPopular3Sequences(sp.getText()));
    
       
      
    }
   
 

}