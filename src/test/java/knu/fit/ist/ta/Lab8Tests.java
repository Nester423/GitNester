/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab8.Algorithms;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jovi
 */
public class Lab8Tests {
    Algorithms alg = new Algorithms();
    
    int[] arr1 = {125, 2354, 35, 456 , 1, 1, 3, 45, 0, 456, 0};
    int[] arr2 = {32, 54, 678, 32, 0, 0, 0, 46, 321, 1};
    int[] arr3 = {};
    
    @Test
        void test1() {  
            assertEquals(String.valueOf(alg.linearSearch(arr1, 45)), "7");
            assertEquals(String.valueOf(alg.binarySearch(arr1, 456)), "9");
            assertEquals(String.valueOf(Algorithms.jumpSearch(arr1, 523)), "-1");
        }
  
    @Test 
        void test2() {  
            assertEquals(String.valueOf(alg.linearSearch(arr2, 0)), "4");
            assertEquals(String.valueOf(alg.binarySearch(arr2, 321)), "8");
            assertEquals(String.valueOf(Algorithms.jumpSearch(arr2, 54)), "1");
        }           
   
    @Test 
        void test3() {  
            assertEquals(String.valueOf(alg.linearSearch(arr1, 32)), "-1");
            assertEquals(String.valueOf(alg.binarySearch(arr1, 32)), "-1");
            assertEquals(String.valueOf(Algorithms.jumpSearch(arr1, 32)), "-1");
        }      
    
    
}