/*
Problem Title: Maximum Subarray Sum (Brute Force Approach)

Description:
Given an array of integers, find the maximum sum of a contiguous subarray.

Input:
- First line: Integer N (size of the array)
- Second line: N space-separated integers

Output:
- Maximum subarray sum

Example:
Input:
5
1 -2 3 4 -1

Output:
7

*/

import java.util.*;

class MaxSubarraySum_BruteForce {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];

        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = i; j < N; j++){
                sum += arr[j];
                if(sum > max){
                    max = sum;
                }
            }
        }

        System.out.println(max);
        input.close();
    }
}
