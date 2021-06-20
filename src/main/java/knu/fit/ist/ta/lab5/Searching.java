/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jovi
 */
public class Searching {
    public List<Integer> linearSearch(String find, List<String> list) {
        int result = -1;
        int flag=0;
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(find)) {
                indexes.add(i);
                flag=1;
            }
        }
        if (flag==0)
        {
           indexes.add(-1);
           return indexes; 
        }
        else
        {
          return indexes;  
        }
    }
    
    public List<Integer> linearSearch(Integer find, List<Integer> list) {
        int result = -1;
        int flag=0;
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == find) {
                indexes.add(i);
                flag=1;
            }
        }
        if (flag==0){
           indexes.add(-1);
           return indexes; 
        }
        else
        {
          return indexes;  
        }
    }
    
     public int linearSearch(int find, int start, List<Integer> list) {
        int result = -1;

        for (int i = start; i < list.size(); i++) {
            if (list.get(i) == find) {
                return i;
            }
        }
        return result;
    }
     
     public int linearSearch(int find, int start, int finish, List<Integer> list) {
        int result = -1;

        for (int i = start; i < finish; i++) {
            if (list.get(i) == find) {
                return i;
            }
        }
        return result;
    }
     

    public int binarySearch(int find, List<Integer> sortedList) {
        int result = -1;
        int start = 0;
        int n = sortedList.size() - 1;
        while (n > 1) {

            if (start + n > sortedList.size()) {
                start--;
            }
            n = (n + 1) / 2;

            if (sortedList.get(n + start).intValue() == find) {
                return start + n;
            } else if (sortedList.get(n+start).intValue() < find) {
                start = start + n;
            }

        }

        return result;
    }

    public int jumpSearch(int find, List<Integer> list, int jump) {
        int result = -1;
        int start;
        int step = 0;

        while (step <= list.size()) {

            start = step;
            step += jump;
            if (step >= list.size()) {
                step = list.size() - 1;
            }
            if (list.get(step) == find) {
                return step;
            } else if (list.get(step) > find) {
                result = linearSearch(find, start, list);
                if (result >= 0) {
                    result= start + result;
                } 
                    return result;
                
            }
        }
        return result;
    }
}
