/*
Problem Title: Maximum Square Greater Than Y

Description:
Given an array of N integers and an integer Y, 
print the maximum square among the squares of elements that are greater than Y.
If no such square exists, print -1.

Input:
- First line: Integer N (size of the array)
- Second line: N space-separated integers
- Third line: Integer Y

Output:
- Maximum square among those greater than Y, or -1 if none exist.

Example:
Input:
5
1 3 5 7 9
20

Output:
81

*/

import java.util.*;

class MaxSquareGreaterThanY {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }

        int Y = input.nextInt();

        OptionalInt maximum = Arrays.stream(arr)
                              .map(n -> n * n)
                              .filter(square -> square > Y)
                              .max();

        if(maximum.isPresent()){
            System.out.println(maximum.getAsInt());
        } else {
            System.out.println("-1");
        }

        input.close();
    }
}
