/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 *
 * @author Jovi
 */
public class StringProcessing {
    
    String text;

    public StringProcessing() {

        text = "The idea of adding sensors and intelligence to basic objects was discussed throughout the 1980s and 1990s (and there are arguably some much earlier ancestors), but apart from some early projects - including an internet-connected vending machine - progress was slow simply because the technology wasn't ready. Chips were too big and bulky and there was no way for objects to communicate effectively.\n" +
                "Processors that were cheap and power-frugal enough to be all but disposable were needed before it finally became cost-effective to connect up billions of devices. The adoption of RFID tags - low-power chips that can communicate wirelessly - solved some of this issue, along with the increasing availability of broadband internet and cellular and wireless networking. The adoption of IPv6 - which, among other things, should provide enough IP addresses for every device the world (or indeed this galaxy) is ever likely to need - was also a necessary step for the IoT to scale. Kevin Ashton coined the phrase 'Internet of Things' in 1999, although it took at least another decade for the technology to catch up with the vision. \"The IoT integrates the interconnectedness of human culture - our 'things' - with the interconnectedness of our digital information system - 'the internet.' That's the IoT,\" Ashton told ZDNet.\n" +
                "The IoT was initially most interesting to business and manufacturing, where its application is sometimes known as machine-to-machine (M2M), but the emphasis is now on filling our homes and offices with smart devices, transforming it into something that's relevant to almost everyone. Early suggestions for internet-connected devices included 'blogjects' (objects that blog and record data about themselves to the internet), ubiquitous computing (or 'ubicomp'), invisible computing, and pervasive computing. However, it was Internet of Things and IoT that stuck.";

       text = cleanString(text);
    }
    
    public String getText() {
        return this.text;
    }
    
    public String getCleanText()
    {
        return String.join(" ", getList(text));
    }

    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    private String cleanString(String input){
    input = input.toLowerCase();
    input = input.replaceAll("-{2,}","");
    input = input.replaceAll(" {2,}"," ");
    input = input.replaceAll("[^\\w -]", "").trim();       
    return input;
    }
    
    /**
     *
     * @param s
     * @return
     */
    
     public String findMostFrequentWord(String s) {
        String[] str = s.split("\\W+");         
        int[] howMuch = new int[str.length];    
        int maxCount = 0;                       
        int index = 0;                          
        for(int i=0; i<str.length; i++) 
            for (String str1 : str) {
                if (str[i].equals(str1)) {
                    howMuch[i]++;
                }
            } 
        for(int i=0; i<howMuch.length; i++) 
            if(howMuch[i]>maxCount) {
                maxCount = howMuch[i];                  
                index = i;                              
            }
        return str[index];                     
    }
     
    public String find6MostFrequentWords(String text) {
        String str = "";
        String textMod = text;
        for (int i = 0; i<6; i++) {
            str += findMostFrequentWord(textMod) + " ";
            textMod = textMod.replaceAll(findMostFrequentWord(textMod), "");    
        }
        return str;
    }
    
       public int findAmountOfWordsWithoutV(String s) {
        String[] str = s.split("\\W+");
        if ("".equals(s)) return 0;
        int k = 0;
        int z;
        
        for (String str1 : str) {
            if (str1.contains("v")) {
                k++;
            }
        }

        z = str.length - k;
        
        return z;
    }
      
     public String findAmountOfWordsWith3UniqueLet(String s){
    
        String[] str = s.split("\\W+");
        List<String> result = getList(s);
        int answerLine = 0;
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            Set<String> resLetters = new HashSet<>();
            
            for (int i = 0; i < letters.length(); i++){
                
                resLetters.add("" + letters.charAt(i));
            }
            if (resLetters.size() == 3)
                answerLine++;
        }
        return "" + answerLine;
    }
     
     public String find4MostPopular3Sequences(String s)
    {   
        String[] str = s.split("\\W+");
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        int currentWordLength;
        String sequence;
        for (int i = 0; i < str.length; i++) {
            currentWordLength = str[i].length();
            for (int j = 0; j < currentWordLength - 3; j++) {
                sequence = str[i].substring(j, j + 3);
                if(dictionary.containsKey(sequence))
                    dictionary.put(sequence, dictionary.get(sequence) + 1);
                else
                   dictionary.put(sequence, 1);
            }
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        Object[] sortedArray = list.toArray();
        return Arrays.toString(Arrays.copyOfRange(sortedArray, 0, 4));
    }
    
}
