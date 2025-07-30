/*
Problem: Implement a Car Class with Attributes and Methods

Description:
Create a Car class with the following:
Attributes:
- color (String)
- maxSpeed (int)
- acceleration (int)
- tyreFriction (int)
- isEngineStarted (boolean, default false)
- currentSpeed (int, default 0)

Methods:
- startEngine(): sets isEngineStarted to true
- stopEngine(): sets isEngineStarted to false
- accelerate(): increases currentSpeed by acceleration (not exceeding maxSpeed); if engine is off, print "Car has not started yet"
- applyBrakes(): reduces currentSpeed by tyreFriction (not below 0)
- soundHorn(): prints "Beep Beep" if engine is on; otherwise, prints "Car has not started yet"

Example Input:
Red 150 10 5

Example Output:
Car has not started yet
Beep Beep
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
         System.out.println("Beep Beep");
     }
     else{
         System.out.println("Car has not started yet");
     }
    }
    
    void applyBrakes() {
        currentSpeed -= tyreFriction;
            if(currentSpeed > 0){
                currentSpeed = currentSpeed;
            }
            else{
                currentSpeed = 0;
            }
    }
}

class Base {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Car car =  new Car(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        car.soundHorn(); // Calling soundHorn() when the isEngineStarted is false
        car.startEngine(); // Starting the engine
        car.soundHorn(); // Calling the soundHorn() when isEngineStarted is True
    }
}