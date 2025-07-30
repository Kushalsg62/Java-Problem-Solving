/*
Problem:
Given a two-digit number, print "Lucky Number" if:
- The number is divisible by 9 OR
- Either digit is 9

Otherwise, print "Unlucky Number".

Input:
29

Output:
Lucky Number

Input:
23

Output:
Unlucky Number
*/

import java.util.Scanner;

public class LuckyNumberCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        int number = Integer.parseInt(num);
        char ch1 = num.charAt(0);
        char ch2 = num.charAt(1);
        int num1 = Character.getNumericValue(ch1);
        int num2 = Character.getNumericValue(ch2);
        if ((number % 9 == 0) || ((num1 == 9) || (num2 == 9))){
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Unlucky Number");
        }
    }
}
