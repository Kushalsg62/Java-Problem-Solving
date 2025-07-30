/*
Problem:
Given a string and an index, remove the character at the given index.
If the index is invalid (greater than or equal to string length), print the string as-is.

Input:
kushal
3

Output:
kusal
*/

import java.util.Scanner;

public class RemoveCharacterAtIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int num = input.nextInt();
        if (num < str.length()){
            System.out.print(str.substring(0,num) + str.substring(num + 1));
        }
        else{
            System.out.print(str);
        }
    }
}
