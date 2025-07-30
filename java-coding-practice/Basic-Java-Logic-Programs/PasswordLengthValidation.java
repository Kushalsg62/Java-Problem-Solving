/*
Problem:
Validate if a password is strong based on its length.
A password is considered valid if its length is greater than 7 characters.

Input:
kushal321

Output:
True

Input:
abc123

Output:
False
*/

import java.util.Scanner;

public class PasswordLengthValidation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int lengthPassword = str.length();
        String validation = (lengthPassword > 7) ? "True" : "False";
        System.out.println(validation);
    }
}
