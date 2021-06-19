/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab4.StringProcessing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 19sam
 */
public class Lab4Tests {
    StringProcessing sp = new StringProcessing();
    
    String text1 = "Internet of things is the coming together of internet and physical devices in a "
            + "network of unlimited possibilities using microcontrollers, arduino and raspberry pi. "
            + "IOT allows for physical devices to wirelessly communicate over networks which has led to a growing number of applications for iot devices. "
            + "Nevon Projects brings you the list of most innovative IOT projects for students and engineers using micocontroller arduino raspberry pi etc.";
    // of - 5; and - 3; devices - 3; for - 3; the - 2; physical - 2
    // 61 words without v
    // 15 words with 3 unique let
     
    String text2 = "Internet of things is the coming together of internet and physical devices in  in a";
    // of - 2; in - 2; internet - 2 
    // 14 words without v (15 words at all, exception-word: devices)
    // 2 words with 3 unique let (the, and)
    
    String text3 = "";
    
    @Test
        void test1() {  
          assertEquals(sp.find6MostFrequentWords(text1), "of and devices for the physical ");       
          assertEquals(sp.findAmountOfWordsWithoutV(text1), 61);
          assertEquals(sp.findAmountOfWordsWith3UniqueLet(text1), "15");
          assertEquals(sp.find4MostPopular3Sequences(text1), "[ica=4, evi=3, ice=3, dev=3]");
        }
        
     @Test 
        void test2() {    
          assertEquals(sp.find6MostFrequentWords(text2), "of in Internet    ");       
          assertEquals(sp.findAmountOfWordsWithoutV(text2), 14);
          assertEquals(sp.findAmountOfWordsWith3UniqueLet(text2), "2");
          assertEquals(sp.find4MostPopular3Sequences(text2), "[rne=2, ern=2, ter=2, nte=2]");
        }
        
    @Test 
        void test3() {    
          assertEquals(sp.find6MostFrequentWords(text3), "      ");       
          assertEquals(sp.findAmountOfWordsWithoutV(text3), 0);
          assertEquals(sp.findAmountOfWordsWith3UniqueLet(text3), "0");
          assertEquals(sp.find4MostPopular3Sequences(text3), "[null, null, null, null]");
        }
 
}