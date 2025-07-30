/*
Problem: Solid Half Diamond

Difficulty: Medium

Description:
Given an integer N, write a program to print the solid half diamond pattern 
in (2*N - 1) rows and N columns, similar to the pattern shown below.

Note:
There is a space after each asterisk (*).

Input:
5

Output:
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
*/

import java.util.Scanner;

class SolidHalfDiamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String star;
        
        for (int i = 1; i <= N; i++){
            star = "* ".repeat(i);
            System.out.println(star);
        }
        
        for (int j = 1; j < N; j++){
            star = "* ".repeat(N - j);
            System.out.println(star);
        }
    }
}
