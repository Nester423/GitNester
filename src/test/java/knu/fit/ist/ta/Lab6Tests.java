/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab6.Recursion;
import knu.fit.ist.ta.lab6.Tree;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jovi
 */
public class Lab6Tests {
    
    Recursion rec = new Recursion();
    Tree tree1 = new Tree();   
    Tree tree2 = new Tree();
    Tree tree3 = new Tree();
    
 @Test
        void test1() {  
            tree1.add(1);
            tree1.add(10);
            tree1.add(8);
            tree1.add(4);
            tree1.add(11);
            tree1.add(2);
            tree1.add(9);
            tree1.add(6);
    
        assertEquals(rec.reverseDigits(57896), "69875");
        assertEquals(String.valueOf(tree1.containsNode(6)), "true");        
        assertEquals(String.valueOf(tree1.getNodeIndex(10)), "1");
        assertEquals((tree1.getTree()).toString(), "[1, 10, 8, 4, 11, 2, 9, 6]");
        assertEquals((tree1.getTraverseInOrder(tree1.root)), " 1 2 4 6 8 9 10 11");
        assertEquals((tree1.getTraversePreOrder(tree1.root)), " 1 10 8 4 2 6 9 11");
        assertEquals((tree1.getTraversePostOrder(tree1.root)), " 2 6 4 9 8 11 10 1");
        assertEquals((tree1.getTraverseLevelOrder(tree1.root)), " 1 10 8 11 4 9 2 6");
        }
  
    @Test 
        void test2() {  
            tree2.add(3);
            tree2.add(1);
            tree2.add(5);
            tree2.add(4);
            tree2.add(10);
            tree2.add(6);
            tree2.add(11);
            tree2.add(8);
            
        assertEquals(rec.reverseDigits(-3871), "-1783");
        assertEquals(String.valueOf(tree2.containsNode(123)), "false");
        assertEquals(String.valueOf(tree2.getNodeIndex(121)), "-1");
        assertEquals((tree2.getTree()).toString(), "[3, 1, 5, 4, 10, 6, 11, 8]");
        assertEquals((tree2.getTraverseInOrder(tree2.root)), " 1 3 4 5 6 8 10 11");
        assertEquals((tree2.getTraversePreOrder(tree2.root)), " 3 1 5 4 10 6 8 11");
        assertEquals((tree2.getTraversePostOrder(tree2.root)), " 1 4 8 6 11 10 5 3");
        assertEquals((tree2.getTraverseLevelOrder(tree2.root)), " 3 1 5 4 10 6 11 8");
        }           
   
    @Test 
        void test3() {  
            tree3.add(0);
            tree3.add(0);
            tree3.add(0);
            tree3.add(0);

        assertEquals(rec.reverseDigits(0), "0");
        assertEquals((tree3.getTree()).toString(), "[0, 0, 0, 0]");
        assertEquals((tree3.getTraverseInOrder(tree3.root)), " 0");
        assertEquals((tree3.getTraversePreOrder(tree3.root)), " 0");
        assertEquals((tree3.getTraversePostOrder(tree3.root)), " 0");
        assertEquals((tree3.getTraverseLevelOrder(tree3.root)), " 0");
        }       
}