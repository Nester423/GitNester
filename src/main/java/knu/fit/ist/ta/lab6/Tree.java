/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
     public Node root;
     ArrayList<Integer> indexes = new ArrayList<>();

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
        indexes.add(value);
    }
    
    public int getNodeIndex(int value) {
        return indexes.indexOf(value);
    }
    
    public ArrayList<Integer> getTree() {
        return indexes;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {

            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

//    public void traverseInOrder(Node node) {
//        if (node != null) {
//            traverseInOrder(node.left);
//            System.out.print(" " + node.value);
//            traverseInOrder(node.right);
//        }
//    }
    
  String s_getTraverseInOrder = "";  
    
    public String getTraverseInOrder(Node node) { 
        if (node != null) {  
            getTraverseInOrder(node.left);
            s_getTraverseInOrder += " " + node.value;
            getTraverseInOrder(node.right);   
        }
        return s_getTraverseInOrder;
    }

//    public void traversePreOrder(Node node) {
//        if (node != null) {
//            System.out.print(" " + node.value);
//            traversePreOrder(node.left);
//            traversePreOrder(node.right);
//        }
//    }
    
    String s_getTraversePreOrder = "";
    
    public String getTraversePreOrder(Node node) {
        if (node != null) {
            s_getTraversePreOrder += " " + node.value;
            getTraversePreOrder(node.left);
            getTraversePreOrder(node.right);
        }
        return s_getTraversePreOrder;
    }

//    public void traversePostOrder(Node node) {
//        if (node != null) {
//            traversePostOrder(node.left);
//            traversePostOrder(node.right);
//            System.out.print(" " + node.value);
//        }
//    }
    
    String s_getTraversePostOrder = "";
    
    public String getTraversePostOrder(Node node) {
        if (node != null) {
            getTraversePostOrder(node.left);
            getTraversePostOrder(node.right);
            s_getTraversePostOrder += " " + node.value;
        }
        return s_getTraversePostOrder;
    }

//    public void traverseLevelOrder(Node root) {
//        if (root == null) {
//            return;
//        }
//
//        Queue<Node> nodes = new LinkedList<>();
//        nodes.add(root);
//
//        while (!nodes.isEmpty()) {
//
//            Node node = nodes.remove();
//
//            System.out.print(" " + node.value);
//
//            if (node.left != null) {
//                nodes.add(node.left);
//            }
//
//            if (node.right != null) {
//                nodes.add(node.right);
//            }
//        }
//    }
    
    String s_getTraverseLevelOrder = "";
    
    public String getTraverseLevelOrder(Node node) {
        if (root == null) {
            return " ";
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            node = nodes.remove();

            s_getTraverseLevelOrder += " " + node.value;

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        return s_getTraverseLevelOrder;
    }
}