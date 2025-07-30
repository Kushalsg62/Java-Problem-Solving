/*
Problem: Palindrome Pair Indices

Description:
Given a list of words, find the first pair of indices (i, j) such that the concatenation of the word at index i with the word at index j forms a palindrome.

Input:
- A single line containing space-separated words.

Output:
- The first such pair of indices i and j.
- If no such pair exists, print -1.

Example:
Input:
abc cba def

Output:
0 1
*/

import java.util.*;

class PalindromePairIndices {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] inputSentence = input.nextLine().split(" ");
        boolean found = false;
        
        for(int i = 0; i < inputSentence.length; i++){
            for(int j = 0; j < inputSentence.length; j++){
                if(i == j) continue;
                String combined = inputSentence[i] + inputSentence[j];
                if (isPalindrome(combined)){
                    System.out.println(i + " " + j);
                    found = true;
                    return;
                }
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
