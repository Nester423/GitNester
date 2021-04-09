/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

/**
 *
 * @author Jovi
 */
public class MyFirstJavaClass {

    private int myInt;
    private static int myStaticIng;

    public MyFirstJavaClass() {
    }

    public MyFirstJavaClass(int myInt) {
        this.myInt = myInt;
    } 

    public static int getMyStaticing() {
        return myStaticIng;
    }

    public static void setMyStaticing(int aMyStaticing) {
        myStaticIng = aMyStaticing;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    @Override
    public String toString() {
        return "MyFirstJavaClass{" + "myInt=" + myInt + '}';
    }
    
        public static String toStringStatic() {
        String MyStaticIng = null;
        return "MyFirstJavaClass{" + "MyStaticIng=" + MyStaticIng + '}';
    }
 
}
