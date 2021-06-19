/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Jovi
 */

@SpringBootTest
public class Lab2Tests {
   
    @Autowired
    Calculate Calculate;

        @Test
        void test1() {
           
        assertEquals(0.71 ,Calculate.solve((float) 1.00), 0.01f); 
        assertEquals(6.93 ,Calculate.solve((float) 1.50), 0.01f);
        assertEquals(-0.67 ,Calculate.solve((float) 2.00), 0.01f);
      
        }
}