/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;


import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
/**
 *
 * @author Jovi
 */
public class Part2 {
    
    private int modelsNumber;
    private LinkedList<Model> list;
    
    public Part2(int modelsNumber)
    {
        this.modelsNumber = modelsNumber;
        list = new LinkedList<Model>();
    }
    
    public void InitList()
    {
        Random rd = new Random();
        list.clear();
        for (int i = 0; i < modelsNumber; i++)
            list.add(new Model("model #" + i, (long)rd.nextInt(29966)));
    }
    
    public String DisplayList()
    {
        String s = "";
        Iterator<Model> itr = list.iterator();
        for (int i = 0; itr.hasNext(); i++) {
            s += i + ". " + itr.next() + "<br/>";
        }
        return s;
    }
    
    public int IndexOf(Model find)
    {
        int result = -1;
        for (int i = 0; i < modelsNumber; i++)
            if (list.get(i).equals(find))
                return i;
        return result;
    }
    
    public int IndexOf(String find)
    {
        int result = -1;
        for (int i = 0; i < modelsNumber; i++)
            if (list.get(i).getStringField().equals(find))
                return i;
        return result;
    }
    
    public int IndexOf(long find)
    {
        int result = -1;
        for (int i = 0; i < modelsNumber; i++)
            if (list.get(i).getLongField().equals(find))
                return i;
        return result;
    }
    
    public void Sort(Comparator<Model> comparator)
    {
        int listLength = list.size();
        Model key;
        int j;
        for (int i = 1; i < listLength; ++i) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0 && comparator.compare(list.get(j), key) > 1) {
                list.set(j + 1, list.get(j--));
            }
            list.set(j + 1, key);
        }
    }
    
    public void SortByStringField(){
        ByStringComparer comparator = new ByStringComparer();
        Sort((Comparator<Model>) comparator);
    }
    
    public void SortByLongField(){
        ByLongComparer comparator = new ByLongComparer();
        Sort((Comparator<Model>) comparator);
    }
    
}