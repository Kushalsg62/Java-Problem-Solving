/*
Problem Title: Rotate Words by Length Condition

Description:
Given a sentence, rotate each word to the right by N positions 
only if its length is greater than M.

Input:
- First line: A sentence (space-separated words)
- Second line: Two integers M and N

Output:
- Transformed sentence

Example:
Input:
Hello world java programming
4 2

Output:
loHel ldwor java ngprogrammi
*/

import java.util.*;

class RotateWordsByLength {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] sentence = input.nextLine().split(" ");
        int M = input.nextInt();
        int N = input.nextInt();
        
        ArrayList<String> newSentence = new ArrayList<>();
        
        for(String word : sentence){
            if(word.length() > M){
                int len = word.length();
                N = N % len;
                String rotate = word.substring(len - N) + word.substring(0, len - N);
                newSentence.add(rotate);
            } else {
                newSentence.add(word);
            }
        }
        
        for(String word : newSentence){
            System.out.print(word + " ");
        }
        System.out.println();
        
        input.close();
    }
}
