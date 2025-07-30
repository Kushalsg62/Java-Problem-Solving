/*
Problem Title: Vertical Word Concatenation

Description:
Given a sentence with space-separated words, print vertical combinations of the characters. 
Each word contributes one character per "column", going left to right, then down to the next set of characters.

Input:
- A single line containing space-separated words.

Output:
- Multiple strings formed by reading characters vertically from each word.

Example:
Input:
Java is fun

Output:
Jif asu van
*/

import java.util.*;

class VerticalWordConcat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] sentenceArray = input.nextLine().split(" ");
        
        ArrayList<String> sentence = new ArrayList<>();
        Collections.addAll(sentence, sentenceArray);
        
        int count = 0;
        while(true){
            String newWord = "";
            boolean hasChar = false;
            
            for(String word : sentence){
                if(count < word.length()){
                    newWord += word.charAt(count);
                    hasChar = true;
                }
            }
            
            if(!hasChar){
                break;
            }
            
            System.out.print(newWord + " ");
            count++;
        }
        
        input.close();
    }
}
