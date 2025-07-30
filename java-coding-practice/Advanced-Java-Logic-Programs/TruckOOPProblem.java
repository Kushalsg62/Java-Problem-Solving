/* 
Problem Title: Truck Class - OOP Problem

Problem Statement:
You are given an incomplete Car class and an incomplete Truck class.
A truck object should have attributes like maxCargoWeight, load along with all the attributes of Car and methods like loadCargo, unloadCargo along with all the methods in Car.
Go through the comments in the prefilled code and implement the Car and Truck class accordingly.

Input:
Truck(String truckColor, int truckMaxSpeed, int truckAcceleration, int truckTyreFriction, int truckMaxCargoWeight)
Various method calls such as:
- loadCargo(int)
- unloadCargo(int)
- accelerate(), applyBrakes(), startEngine(), stopEngine()

Output:
Appropriate console prints according to method behavior such as:
- "Cannot load cargo more than max limit: 100"
- "Truck has not started yet"
- "Honk Honk"

Purpose:
This problem tests your understanding of object-oriented programming, inheritance, encapsulation, method overriding, and stateful object behavior.

--------------------------------------------------
*/

import java.util.Scanner;

class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    int currentSpeed;
    boolean isEngineStarted;
    
    Car(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction) {
        color = carColor;
        maxSpeed = carMaxSpeed;
        acceleration = carAcceleration;
        tyreFriction = carTyreFriction;
        isEngineStarted = false;
        currentSpeed = 0;
    }
    
    void startEngine() {
        isEngineStarted = true;
    }
    
    void stopEngine() {
        isEngineStarted = false;
    }
    
    void accelerate() {
        if(isEngineStarted){
            if(currentSpeed >= maxSpeed){
                currentSpeed = maxSpeed;
            }
            else{
                currentSpeed += acceleration;
            }
        }
        else{
            System.out.println("Car has not started yet");
        }
    }
    
    void soundHorn() {
        if(isEngineStarted){
            System.out.println("Peep Peep");
        }
        else{
            System.out.println("Car has not started yet");
        }
    }
    
    void applyBrakes() {
        currentSpeed -= tyreFriction;
        if(currentSpeed < 0){
            currentSpeed = 0;
        }
        else{
            currentSpeed = currentSpeed;
        }
    }
}

class Truck extends Car {
    int maxCargoWeight;
    int load;
    Truck(String truckColor, int truckMaxSpeed, int truckAcceleration, int truckTyreFriction, int truckMaxCargoWeight) {
        super(truckColor, truckMaxSpeed, truckAcceleration, truckTyreFriction);
        maxCargoWeight = truckMaxCargoWeight;
        load = 0;
    }
    
    void loadCargo(int cargoWeight) {
        if(isEngineStarted){
            System.out.println("Cannot load cargo during motion");
        }
        else{
            if(cargoWeight >= maxCargoWeight){
            System.out.println("Cannot load cargo more than max limit: " + maxCargoWeight);
            }
            else{
                load += cargoWeight;
            }
        }
    }
    
    void unloadCargo(int cargoWeight) {
        if(isEngineStarted){
            System.out.println("Cannot unload cargo during motion");
        }
        else{
            load -= cargoWeight;
            if(load < 0){
                load = 0;
            }
            else{
                load = load;
            }
        }
    }
    
    @Override
    void soundHorn() {
        if(isEngineStarted){
            System.out.println("Honk Honk");
        }
        else{
            System.out.println("Truck has not started yet");
        }
    }
}

/**
 * You need not change any code below.
 */

class Base {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Truck truck =  new Truck(input.next(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(truck.isEngineStarted);
        truck.loadCargo(50); // Loading cargoWeight 50 to the truck
        System.out.println(truck.load); // 0 + 50 => 50
        truck.unloadCargo(25); // Unloading cargoWeight 25 from the truck
        System.out.println(truck.load); // 50 - 25 => 25
        truck.unloadCargo(70); // Unloading cargoWeight 70 (more than load in the truck)
        System.out.println(truck.load); // 25 - 75 => 0 as load never be negative
        truck.loadCargo(120); // Prints "Cannot load cargo more than max limit: 100"
        truck.loadCargo(20); // Loading cargoWeight 20 to the truck
        truck.startEngine();
        System.out.println(truck.isEngineStarted); // True
        truck.loadCargo(40); // Prints "Cannot load cargo during motion"
        truck.unloadCargo(10); // Prints "Cannot unload cargo during motion"
        truck.soundHorn(); // Prints "Honk Honk"
        truck.stopEngine();
        truck.soundHorn(); // Prints "Truck has not started yet"
    }
}
