/*
Problem: Shaded Diamond

Difficulty: Medium

Description:
Given an integer value N as input, write a program to print a shaded diamond of 2*N - 1 rows using an asterisk (*) character as shown below.

Note:
There is a space after each asterisk (*) character.

Input:
5

Output:
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 *     * 
  *   * 
   * * 
    * 
*/

import java.util.Scanner;

class ShadedDiamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String leftSpace;
        String star;
        String hallowSpace;
        
        for (int i = 1; i <= N; i++){
            leftSpace = " ".repeat(N - i);
            star = "* ".repeat(i);
            System.out.println(leftSpace + star);
        }
        
        for (int j = 2; j <= N; j++){
            if (j == N){
                leftSpace = " ".repeat(j - 1);
                star = "*";
                System.out.println(leftSpace + star);
            }
            else{
                leftSpace = " ".repeat(j - 1);
                star = "* ";
                hallowSpace = "  ".repeat(N - j - 1);
                System.out.println(leftSpace + star + hallowSpace + star); 
            }
        }
    }
}
