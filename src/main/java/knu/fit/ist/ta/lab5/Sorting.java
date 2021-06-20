/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jovi
 */
public class Sorting {

    private Random rnd = new Random(1);
    private List<Integer> unsortedList;
    private List<String> unsortedText;
    public long time1;
    public long time2;

    public List<Integer> getUnsortedList() {
        return unsortedList;
    }

    public List<String> getUnsortedText() {
        return unsortedText;
    }

    public Sorting(int arrayLength) {
        this.unsortedList = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            unsortedList.add(rnd.nextInt(arrayLength));
        }
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        this.unsortedText = new ArrayList<>();
        int j;
        char letter;
        for (int i = 0; i < arrayLength; i++) {
            j = rnd.nextInt(25);
            letter = alphabet.charAt(j);
            unsortedText.add(String.valueOf(letter));
        }

    }

    public List<Integer> sortApproach1() {

        int s, t;

        List<Integer> result = new ArrayList<>();
        result.addAll(unsortedList);

        int n = result.size() - 1;
        int k = -1;

        while (k != n) {
            s = k + 1;
            t = s;

            while (t != n) {
                t++;
                if (result.get(t) < result.get(s)) {
                    s = t;
                }
            }

            t = result.get(k + 1);
            result.set(k + 1, result.get(s));
            result.set(s, t);

            k++;
        }

        return result;
    }

    public List<String> sortApproach22() {

        String s;
        int t;

        List<String> result = new ArrayList<>();
        result.addAll(unsortedText);

        int n = 0;
        int k = result.size() - 1;
        int arrsize = result.size() - 1;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index1 = 0;
        int index2 = 0;

        while (k != n) {
            t = k - 1;

            index1 = alphabet.indexOf(result.get(t));
            index2 = alphabet.indexOf(result.get(t + 1));
            while (t < arrsize && index1 > index2) {
                s = result.get(t);
                result.set(t, result.get(t + 1));
                result.set(t + 1, s);
                t++;
                index1 = alphabet.indexOf(result.get(t));
                if (t + 1 <= arrsize) {
                    index2 = alphabet.indexOf(result.get(t + 1));
                }
            }

            k--;

        }

        return result;
    }

    public List<Integer> sortApproach2() {

        long startTime = System.currentTimeMillis();
        int s, t;

        List<Integer> result = new ArrayList<>();
        result.addAll(unsortedList);

        int n = 0;
        int k = 0;
        if (result.size() != 0) {
            k = result.size() - 1;
        }
        int arrsize = result.size() - 1;

        while (k != n) {
            t = k - 1;

            while (t < arrsize && result.get(t) > result.get(t + 1)) {
                s = result.get(t);
                result.set(t, result.get(t + 1));
                result.set(t + 1, s);
                t++;
            }

            k--;

        }

        long endTime = System.currentTimeMillis();
        time1 = endTime - startTime;
        return result;
    }

    public List<Integer> mergeLists(List<Integer> inputList1, List<Integer> inputList2) {
        List<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < inputList1.size() || i2 < inputList2.size()) {
            if (!(i1 < inputList1.size())) {
                result.add(inputList2.get(i2));
                i2++;

            } else if (!(i2 < inputList2.size())) {
                result.add(inputList1.get(i1));
                i1++;
            } else {
                if (inputList1.get(i1) <= inputList2.get(i2)) {
                    result.add(inputList1.get(i1));
                    i1++;

                } else {
                    result.add(inputList2.get(i2));
                    i2++;

                }

            }
        }

        return result;
    }

    public List<Integer> sortApproach3() {

        long startTime = System.currentTimeMillis();
        int p, q, r, t;

        List<Integer> result = new ArrayList<>();
        result.addAll(unsortedList);

        int n = result.size() - 1;

        int k = 1;

        while (k < n) {
            List<Integer> tempList = new ArrayList<>();
            t = 0;
            while (t < n + 1) {
                p = t;
                q = t + k;
                if (q > n + 1) {
                    q = n + 1;
                }
                r = t + 2 * k;
                if (r > n + 1) {
                    r = n + 1;
                }
                t = r;

                tempList.addAll(mergeLists(result.subList(p, q), result.subList(q, r)));

            }

            result = tempList;

            k *= 2;
        }

        long endTime = System.currentTimeMillis();
        time2 = endTime - startTime;
        return result;
    }

    public List<Integer> sortApproach4() {

        List<Integer> result = unsortedList;

        return result;
    }

    public List<Integer> sortApproach5() {

        List<Integer> result = unsortedList;

        return result;
    }
}