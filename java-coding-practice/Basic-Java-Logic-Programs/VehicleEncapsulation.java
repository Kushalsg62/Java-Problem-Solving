/* 
Problem Title: Vehicle - Encapsulation and Getters/Setters

Problem Statement:
You are given an incomplete Vehicle class. Implement the class with the following:
- Private attributes: name (String), topSpeed (int), makeYear (int), fuelType (String)
- Getter and Setter methods for each attribute:
  - setName(), getName()
  - setTopSpeedMPH(), getTopSpeedMPH()
  - setMakeYear(), getMakeYear()
  - setFuelType(), getFuelType()

Input:
- A string representing the vehicle name
- An integer for top speed
- An integer for manufacturing year
- A string for fuel type

Output:
- The values returned by each getter method in order of input

Sample Input:
Audi  
250  
2022  
Diesel  

Sample Output:
Audi  
250  
2022  
Diesel  

Purpose:
This problem checks your understanding of:
- Encapsulation in Java
- Getter and Setter methods
- Handling private class attributes

--------------------------------------------------
*/

import java.util.Scanner;

class Vehicle {
    private String name;
    private int topSpeed;
    private int makeYear;
    private String fuelType;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setTopSpeedMPH(int topSpeed){
        this.topSpeed = topSpeed;
    }

    int getTopSpeedMPH(){
        return topSpeed;
    }

    void setMakeYear(int makeYear){
        this.makeYear = makeYear;
    }

    int getMakeYear(){
        return makeYear;
    }

    void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    String getFuelType(){
        return fuelType;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Vehicle vehicle =  new Vehicle();
        vehicle.setName(input.next()); // Should set the name of the vehicle
        System.out.println(vehicle.getName()); // => Audi
        vehicle.setTopSpeedMPH(input.nextInt()); // Should set the top speed
        System.out.println(vehicle.getTopSpeedMPH()); // => 250
        vehicle.setMakeYear(input.nextInt()); // Should set manufacturing year
        System.out.println(vehicle.getMakeYear()); // => 2022
        vehicle.setFuelType(input.next()); // Should set the fuel type
        System.out.println(vehicle.getFuelType()); // => Diesel
    }
}
