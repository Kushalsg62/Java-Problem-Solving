/*
Problem: Non-Adjacent Word Pairs

Description:
Given a sentence, generate all unique unordered pairs of words that are not adjacent in the sentence.
Output the result in lexicographical order.

Input:
A single line of input with space-separated words.

Output:
All non-adjacent word pairs in sorted order. If none, print "No Combinations".

Example:
Input:
java is super fast language

Output:
fast is
fast java
fast language
is language
is super
java language
java super
language super
*/

import java.util.*;

class NonAdjacentWordPairs {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().trim();
        input.close();
        
        String[] words = sentence.split(" ");
        int n = words.length;
        
        Set<String> result = new HashSet<>();
        Set<String> adjacentPairs = new HashSet<>();
        
        for(int i = 0; i < n - 1; i++){
            String a = words[i];
            String b = words[i + 1];
            if(a.compareTo(b) > 0){
                String temp = a;
                a = b;
                b = temp;
            }
            adjacentPairs.add(a + " " + b);
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                String w1 = words[i];
                String w2 = words[j];
                
                if(w1.compareTo(w2) > 0){
                    String temp = w1;
                    w1 = w2;
                    w2 = temp;
                }
                
                String pair = w1 + " " + w2;
                if(!adjacentPairs.contains(pair)){
                    result.add(pair);
                }
            }
        }
        
        if(result.isEmpty()){
            System.out.println("No Combinations");
        } else {
            List<String> output = new ArrayList<>(result);
            Collections.sort(output);
            for(String s : output){
                System.out.println(s);
            }
        }
    }
}
