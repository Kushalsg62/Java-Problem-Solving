/*
Problem: Inverted Full Pyramid - 2

Given a positive integer N, print an inverted full number pyramid pattern with N rows.

Input:
A single line containing a positive integer N.

Example:
Input:
5

Output:
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1


*/

import java.util.Scanner;

class InvertedFullPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        for (int i = 1; i <= N; i++){
            String space = " ".repeat(i - 1);
            System.out.print(space);
            for (int j = 1; j <= N - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
