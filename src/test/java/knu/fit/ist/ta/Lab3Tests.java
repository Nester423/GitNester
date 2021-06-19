/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab3.Lab3Task;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jovi
 */
public class Lab3Tests {
    
    int[] test_arr1 = {1, 1, 0};  
    int[] test_arr2 = {1, 2, 400, 3, 4, 4, 40, };
    int[] test_arr3 = {21, 21, 5, 5, 3, 12, 40, 5};
    int[] test_arr4 = {10, 8, 216, 250, 125, 47};
       
     @Test
        void test1() {    
        assertEquals(2, Lab3Task.amountOfMaxEl(test_arr1));        
        }
        
     @Test 
        void test2() {    
        assertEquals(4, Lab3Task.amountOfMaxEl(test_arr2));        
        }
        
    @Test 
        void test3() {    
        assertEquals(3, Lab3Task.amountOfMaxEl(test_arr3));        
        }
        
    @Test 
        void test4() {    
        assertEquals(1, Lab3Task.amountOfMaxEl(test_arr4));        
        }
}