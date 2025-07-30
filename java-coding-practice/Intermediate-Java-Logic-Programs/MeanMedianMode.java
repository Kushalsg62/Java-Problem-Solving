/*
Problem Title: Mean, Median, and Mode

Description:
Given an array of N integers, calculate and print the following:
1. Mean - The average of the numbers, rounded to 2 decimal places
2. Median - The middle value(s), rounded to 1 decimal place if average of two
3. Mode - The value(s) that appear most frequently, sorted in ascending order

Input:
- First line: An integer N (number of elements)
- Second line: N space-separated integers

Output:
Mean: <value>
Median: <value>
Mode: <space-separated values>

Example:
Input:
5
1 2 3 4 4

Output:
Mean: 2.8
Median: 3
Mode: 4
*/

import java.text.DecimalFormat;
import java.util.*;

class MeanMedianMode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int[] arr = new int[N];
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        
        double mean = sum / (double) N;
        DecimalFormat dfMean = new DecimalFormat("#.##");
        System.out.println("Mean: " + dfMean.format(mean));
        
        Arrays.sort(arr);
        if(N % 2 == 0){
            double median = (arr[N/2 - 1] + arr[N/2]) / 2.0;
            DecimalFormat dfMedian = new DecimalFormat("#.#");
            System.out.println("Median: " + dfMedian.format(median));
        } else {
            System.out.println("Median: " + arr[N / 2]);
        }
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = Collections.max(freqMap.values());
        ArrayList<Integer> modes = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == maxFreq){
                modes.add(entry.getKey());
            }
        }
        
        Collections.sort(modes);
        System.out.print("Mode: ");
        for(int mode : modes){
            System.out.print(mode + " ");
        }
        
        input.close();
    }
}
