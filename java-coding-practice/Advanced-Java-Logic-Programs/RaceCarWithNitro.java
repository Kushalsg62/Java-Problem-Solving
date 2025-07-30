/*
 * Problem: RaceCar Simulation with Nitro Boost
 *
 * Description:
 * Implement two classes — Car and RaceCar. RaceCar inherits from Car and adds extra features:
 * - Nitro boost when accelerating
 * - Overridden accelerate and soundHorn methods
 *
 * Input:
 * color (String)
 * maxSpeed (int)
 * acceleration (int)
 * tyreFriction (int)
 * nitro (int)
 *
 * Output:
 * Print currentSpeed and nitro values after multiple operations.
 *
 * Sample Input:
 * Red 300 50 30 4
 *
 * Sample Output:
 * 70
 * 3
 * 140
 * 2
 * 210
 * 1
 * 180
 * 1
 * 250
 * 0
 * Peep Peep
 * Beep Beep
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
         if (isEngineStarted) {
             if (currentSpeed >= maxSpeed) {
                 currentSpeed = maxSpeed;
             } else {
                 currentSpeed += acceleration;
             }
         } else {
             System.out.println("Car has not started yet");
         }
     }
 
     void soundHorn() {
         if (isEngineStarted) {
             System.out.println("Peep Peep\nBeep Beep");
         } else {
             System.out.println("Car has not started yet");
         }
     }
 
     void applyBrakes() {
         currentSpeed -= tyreFriction;
         if (currentSpeed < 0) {
             currentSpeed = 0;
         }
     }
 }
 
 class RaceCar extends Car {
     int nitro;
 
     RaceCar(String carColor, int carMaxSpeed, int carAcceleration, int carTyrefriction, int carNitro) {
         super(carColor, carMaxSpeed, carAcceleration, carTyrefriction);
         nitro = carNitro;
     }
 
     void accelerate() {
         if (isEngineStarted) {
             if (nitro > 0) {
                 currentSpeed += 20;
                 nitro -= 1;
             }
             currentSpeed += acceleration;
             if (currentSpeed > maxSpeed) {
                 currentSpeed = maxSpeed;
             }
         } else {
             System.out.println("Car has not started yet");
         }
     }
 
     void soundHorn() {
         if (isEngineStarted) {
             System.out.println("Peep Peep\nBeep Beep");
         } else {
             System.out.println("Car has not started yet");
         }
     }
 }
 
 class Base {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         RaceCar raceCar = new RaceCar(input.next(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
         raceCar.startEngine();
         raceCar.accelerate();
         System.out.println(raceCar.currentSpeed);
         System.out.println(raceCar.nitro);
         raceCar.accelerate();
         System.out.println(raceCar.currentSpeed);
         System.out.println(raceCar.nitro);
         raceCar.accelerate();
         System.out.println(raceCar.currentSpeed);
         System.out.println(raceCar.nitro);
         raceCar.applyBrakes();
         System.out.println(raceCar.currentSpeed);
         System.out.println(raceCar.nitro);
         raceCar.accelerate();
         System.out.println(raceCar.currentSpeed);
         System.out.println(raceCar.nitro);
         raceCar.soundHorn();
         input.close();
     }
 }
 