/* 
Problem Title: Current Account - Inheritance and Transaction Fees

Problem Statement:
You are given two incomplete classes: BankAccount and CurrentAccount.

1. BankAccount:
- Allows basic banking operations:
  - deposit(float amount)
  - withdraw(float amount)
  - getBalance()

2. CurrentAccount (inherits BankAccount):
- This type of account is commonly used by businesses and financial institutions.
- It supports unlimited transactions, but only the first 3 transactions are free.
- After the 3rd transaction, a fee is charged for each additional transaction.
- Fee Formula:
    fee = transactionFee × (transactionCount - freeTransactions)

Attributes:
- static int freeTransactions = 3
- static float transactionFee = 20f
- non-static int transactionCount = 0

Methods:
- deductFee(): Deducts transaction fees if applicable
- deposit(float amount): Deposits money and handles fee logic
- withdraw(float amount): Withdraws money and handles fee logic

Sample Input:
1000  
500  
2000  
1000  
1000  

Sample Output:
0.0  
1000.0  
500.0  
2500.0  
1480.0  
440.0  

Purpose:
This problem checks your understanding of:
- Inheritance in Java
- Static vs non-static attributes
- Business logic implementation
- Method overriding and reuse

--------------------------------------------------
*/

import java.util.Scanner;

class BankAccount {
    float balance = 0.0f;

    void deposit(float amount){
        balance += amount;
    }

    void withdraw(float amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
        }
    }

    float getBalance(){
        return balance;
    }
}

class CurrentAccount extends BankAccount {
    static int freeTransactions = 3;
    static float transactionFee = 20f;
    static int transactionCount = 0;

    void deductFee(){
        float fee = transactionFee * (transactionCount - freeTransactions);
        if(fee > balance){
            System.out.println("Insufficient balance");
        } else {
            balance -= fee;
        }
    }

    void deposit(float amount){
        transactionCount += 1;
        if(transactionCount <= freeTransactions){
            balance += amount;
        } else {
            deductFee();
            balance += amount;
        }
    }

    void withdraw(float amount){
        transactionCount += 1;
        if(transactionCount <= freeTransactions){
            if(amount <= balance){
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            deductFee();
            if(amount <= balance){
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

class Action {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CurrentAccount account1 = new CurrentAccount();
        System.out.println(account1.getBalance()); // => 0.0
        account1.deposit(input.nextInt());         // 1000
        System.out.println(account1.getBalance()); // => 1000.0
        account1.withdraw(input.nextInt());        // 500
        System.out.println(account1.getBalance()); // => 500.0
        account1.deposit(input.nextInt());         // 2000
        System.out.println(account1.getBalance()); // => 2500.0
        account1.withdraw(input.nextInt());        // 1000 + fee
        System.out.println(account1.getBalance()); // => 1480.0
        account1.withdraw(input.nextInt());        // 1000 + fee
        System.out.println(account1.getBalance()); // => 440.0
        input.close();
    }
}
