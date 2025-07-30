/* 
Problem Title: Savings Account - Encapsulation and Getters/Setters

Problem Statement:
Implement a SavingsAccount class with the following:
- A constructor that takes the customer name.
- Private attributes: accNo (long), email (String), amount (float)
- Public attribute: name (String)
- Setter and Getter methods for accNo, email, and amount.

Input:
Constructor takes a name.
Setter methods setAccNo(), setEmail(), setAmount() are called with values from input.

Output:
Prints name, accNo, email, and amount using getters.

Sample Input:
Paul
63742211
xyz@gmail.com
10000.0

Sample Output:
Paul
63742211
xyz@gmail.com
10000.0

Purpose:
This problem checks your understanding of:
- Encapsulation
- Constructors
- Getter and Setter methods in Java
--------------------------------------------------
*/

import java.util.Scanner;

class SavingsAccount {
    String name;
    private long accNo;
    private String email;
    private float amount;

    SavingsAccount(String name){
        this.name = name;
    }

    void setAccNo(long accNo){
        this.accNo = accNo;
    }

    long getAccNo(){
        return accNo;
    }

    void setEmail(String email){
        this.email = email;
    }

    String getEmail(){
        return email;
    }

    void setAmount(float amount){
        this.amount = amount;
    }

    float getAmount(){
        return amount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        SavingsAccount account = new SavingsAccount(name);
        System.out.println(account.name); // Should print the name passed to the constructor => Paul
        account.setAccNo(input.nextLong()); // Should set the account number
        System.out.println(account.getAccNo()); // => 63742211
        account.setEmail(input.next()); // Should set the email
        System.out.println(account.getEmail()); // => xyz@gmail.com
        account.setAmount(input.nextFloat()); //Should set the amount
        System.out.println(account.getAmount()); // => 10000.0
        input.close();
    } 
}
