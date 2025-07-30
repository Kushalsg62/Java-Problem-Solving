/*
Problem: Full Pyramid - 2

Given a positive integer N, print a full number pyramid pattern with N rows.

Input:
A single line containing a positive integer N.

Example:
Input:
5

Output:
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/

import java.util.Scanner;

class FullPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        for (int i = 1; i <= N; i++){
            String space = " ".repeat(N - i);
            String num = "";
            for (int j = 1; j <= i; j++){
                num += j + " ";
            }
            System.out.println(space + num);
        }
    }
}
