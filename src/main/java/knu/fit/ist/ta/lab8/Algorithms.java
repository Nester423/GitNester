/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Jovi
 */
public class Algorithms {

    public int linearSearch(int arr[], int elementToSearch) {

    for (int index = 0; index < arr.length; index++) {
        if (arr[index] == elementToSearch)
            return index;
    }
    return -1;
    }
    
    public int binarySearch(int arr[], int elementToSearch) {

    int firstIndex = 0;
    int lastIndex = arr.length - 1;

    while(firstIndex <= lastIndex) {
        int middleIndex = (firstIndex + lastIndex) / 2;
        
        if (arr[middleIndex] == elementToSearch) {
            return middleIndex;
        }

        else if (arr[middleIndex] < elementToSearch)
            firstIndex = middleIndex + 1;

        else if (arr[middleIndex] > elementToSearch)
            lastIndex = middleIndex - 1;

    }
    return -1;
    }
    
    public static int jumpSearch(int[] integers, int elementToSearch) {

    int arrayLength = integers.length;
    int jumpStep = (int) Math.sqrt(integers.length);
    int previousStep = 0;

    while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
        previousStep = jumpStep;
        jumpStep += (int)(Math.sqrt(arrayLength));
        if (previousStep >= arrayLength)
            return -1;
    }
    while (integers[previousStep] < elementToSearch) {
        previousStep++;
        if (previousStep == Math.min(jumpStep, arrayLength))
            return -1;
    }

    if (integers[previousStep] == elementToSearch)
        return previousStep;
    return -1;
    }
 
}