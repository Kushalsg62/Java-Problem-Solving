/*
Problem Title: Merge Strings Alternately

Description:
Given two strings `a` and `b`, merge them by alternating their characters.
If one string is longer, append the remaining characters at the end.

Input:
- First line: String `a`
- Second line: String `b`

Output:
- A single merged string

Example:
Input:
abc
xyz

Output:
axbycz

Input:
abc
wxyz

Output:
awbxcyz

*/

import java.util.*;

class MergeStringsAlternately {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();

        int length = 0;
        String remain = "";

        if(a.length() < b.length()){
            length = a.length();
            remain = b.substring(a.length());
        } else {
            length = b.length();
            remain = a.substring(b.length());
        }

        String newWord = "";

        for(int i = 0; i < length; i++){
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            newWord += ch1;
            newWord += ch2;
        }

        System.out.println(newWord + remain);
        input.close();
    }
}
