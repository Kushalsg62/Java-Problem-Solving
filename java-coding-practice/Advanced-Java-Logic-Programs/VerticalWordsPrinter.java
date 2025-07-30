/*
Problem: Vertical Words Printer

Description:
Given a sentence with space-separated words, print the characters of the words vertically.
Each row in the output should contain the corresponding characters from each word (in order),
and if a word is shorter, fill the space with whitespace.

Input:
- A single line of space-separated words.

Output:
- Multiple lines representing vertical printing of the sentence.

Example:
Input:
CODE IN JAVA

Output:
CIJ 
OAA 
D V 
E A
*/

import java.util.*;

class VerticalWordsPrinter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] SArray = input.nextLine().split(" ");
        
        ArrayList<String> S = new ArrayList<>();
        
        for(int i = 0; i < SArray.length; i++){
            S.add(SArray[i]);
        }
        
        int count = 0;
        
        while(true){
            String newWord = "";
            boolean hasChar = false;
            
            for(int i = 0; i < S.size(); i++){
                String word = S.get(i);
                if(count < word.length()){
                    char eachCharacter = word.charAt(count);
                    newWord += eachCharacter;
                    hasChar = true;
                } else {
                    newWord += " ";
                }
            }
            
            if(!hasChar){
                break;
            }
            
            System.out.println(newWord + " ");
            count++;
        }
    }
}
