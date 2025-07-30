/* 
Problem Title: Smartwatch - Interfaces and Inheritance

Problem Statement:
You are given two incomplete interfaces `Watch` and `Smartwatch` and a class `IWatch`.

1. Watch Interface:
- Has one abstract method:
    void displayTime(int hours, int minutes, int seconds)

2. Smartwatch Interface:
- Extends `Watch` interface.
- Has two abstract methods:
    void makeCall(long mobileNum)
    void displayHeartRate(int heartRate)

3. IWatch Class:
- Implements `Smartwatch` interface.
- Implements the following methods:
    - displayTime: prints "hours:minutes:seconds"
    - makeCall: prints "Calling...<mobileNum>"
    - displayHeartRate: prints "Heart Rate: <heartRate> bpm"

Sample Input:
14  
20  
30  
98989898  
96  

Sample Output:
14:20:30  
Calling...98989898  
Heart Rate: 96 bpm  

Purpose:
This problem checks your understanding of:
- Interfaces and inheritance in Java
- Implementing multiple abstract methods in a class
- Separation of contracts (interfaces) and implementation (class)

--------------------------------------------------
*/

import java.util.Scanner;

interface Watch {
    void displayTime(int hours, int minutes, int seconds);
}

interface Smartwatch extends Watch {
    void makeCall(long mobileNum);
    void displayHeartRate(int heartRate);
}

class IWatch implements Smartwatch {
    public void displayTime(int hours, int minutes, int seconds){
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public void makeCall(long mobileNum){
        System.out.println("Calling..." + mobileNum);
    }

    public void displayHeartRate(int heartRate){
        System.out.println("Heart Rate: " + heartRate + " bpm");
    }
}

class Base {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IWatch iWatch = new IWatch();
        iWatch.displayTime(input.nextInt(), input.nextInt(), input.nextInt()); // => 14:20:30
        iWatch.makeCall(input.nextLong()); // => Calling...98989898
        iWatch.displayHeartRate(input.nextInt()); // => Heart Rate: 96 bpm
        input.close();
    }
}
