/*
Problem: Inverted Half Pyramid

Write a program to print the inverted half pyramid pattern up to the given N number of rows.

Example:
Input:
3

Output:
1 2 3 
1 2 
1 


*/

import java.util.Scanner;

class InvertedHalfPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        for (int i = 0; i < N; i++){
            String num = "";
            for (int j = 1; j <= N - i; j++){
                num += j + " ";
            }
            System.out.println(num);
        }
    }
}
