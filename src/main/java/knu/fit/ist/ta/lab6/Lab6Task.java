/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

/**
 *
 * @author Jovi
 */
public class Lab6Task {
     public static void main(String[] args) {
        Recursion rec = new Recursion();
        Tree tree = new Tree();
        
        String a = rec.reverseDigits(-3895);
        System.out.println(a);
        
        tree.add(3);
        tree.add(11);
        tree.add(6);
        tree.add(2);
        tree.add(10);
        tree.add(4);
        tree.add(8);
        tree.add(7);
        
        System.out.println(tree.containsNode(6));
        System.out.println(tree.containsNode(67));     
        System.out.println(tree.getNodeIndex(2));
        System.out.println("GETTREE");
        System.out.println(tree.getTree());
        
        
        System.out.println(tree.getTraverseInOrder(tree.root));
        System.out.println("------------------");
        
        System.out.println(tree.getTraversePreOrder(tree.root));
        System.out.println("------------------");
        
        System.out.println(tree.getTraversePostOrder(tree.root));
        System.out.println("------------------");
        
        System.out.println(tree.getTraverseLevelOrder(tree.root));
        System.out.println("------------------");
    }
}