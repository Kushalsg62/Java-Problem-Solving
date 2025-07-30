/*
Problem: Hollow Full Pyramid - 2

Given a positive integer N, print a hollow full number pyramid pattern with N rows.

Input:
A single line containing a positive integer N.

Example:
Input:
5

Output:
    1
   1 2
  1   3
 1     4
1 2 3 4 5


*/

import java.util.Scanner;

class HollowFullPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        for (int i = 1; i <= N; i++){
            for (int s = 1; s <= N - i; s++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++){
                if (i == 1 || i == 2 || i == N){
                    System.out.print(j + " ");
                } else {
                    if(j == 1 || j == i){
                        System.out.print(j + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
