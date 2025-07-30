/*
Problem: Max Books Within Budget

Description:
You are given the number of books and a total budget.
Each book has a cost. Buy as many books as possible without exceeding the budget.
Always choose the cheapest books first.

Input:
- T: Number of test cases.
For each test case:
- B P: Number of books and total budget
- B space-separated integers: Prices of each book

Output:
- For each test case, print the maximum number of books that can be bought.

Example:
Input:
1
5 10
4 2 1 10 5

Output:
3
*/

import java.util.*;

class MaxBooksWithinBudget {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = Integer.parseInt(input.nextLine());
        
        for(int t = 0; t < T; t++){
            String[] firstLine = input.nextLine().trim().split(" ");
            int B = Integer.parseInt(firstLine[0]);
            int P = Integer.parseInt(firstLine[1]);
            
            List<Integer> pricesList = new ArrayList<>();
            while(pricesList.size() < B){
                String[] parts = input.nextLine().trim().split(" ");
                for(String s : parts){
                    if(!s.isEmpty()){
                        pricesList.add(Integer.parseInt(s));
                    }
                }
            }
            
            int[] prices = new int[B];
            for(int i = 0; i < B; i++){
                prices[i] = pricesList.get(i);
            }
            
            Arrays.sort(prices);
            
            int sum = 0, count = 0;
            for(int price : prices){
                if(sum + price <= P){
                    sum += price;
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
