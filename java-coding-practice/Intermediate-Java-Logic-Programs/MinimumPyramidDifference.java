/*
Problem Title: Minimum Difference Between Pyramids

Description:
You are given the heights of N pyramids. Your task is to find the minimum
absolute difference in height between any two pyramids.

Input:
- First line: Integer N (number of pyramids)
- Second line: N space-separated integers denoting the heights

Output:
- Minimum absolute difference between any two pyramid heights

Example:
Input:
5
3 8 15 1 9

Output:
1

*/

import java.util.*;

class MinimumPyramidDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long[] pyramids = new long[N];

        for (int i = 0; i < N; i++) {
            pyramids[i] = input.nextLong();
        }

        Arrays.sort(pyramids);

        long min = Long.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            min = Math.min(min, pyramids[i + 1] - pyramids[i]);
        }

        System.out.println(min);
        input.close();
    }
}
