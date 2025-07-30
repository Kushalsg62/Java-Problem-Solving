/*
Problem:
Calculate electricity bill based on units consumed with tiered rates:

- First 50 units: 2 per unit
- Next 100 units (51-150): 3 per unit
- Next 100 units (151-250): 5 per unit
- Above 250 units: 8 per unit

A surcharge of 20% is added on total charges.

Input:
280

Output:
1296.0
*/

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int units = input.nextInt();
        int charges = 0;

        if (units <= 50){
            charges = units * 2;
        }
        else if (units <= 150){
            charges = 50 * 2 + (units - 50) * 3;
        }
        else if (units <= 250){
            charges = 50 * 2 + 100 * 3 + (units - 150) * 5;
        }
        else {
            charges = 50 * 2 + 100 * 3 + 100 * 5 + (units - 250) * 8;
        }

        float bill = charges + charges * 0.2f;
        System.out.println(bill);
    }
}
