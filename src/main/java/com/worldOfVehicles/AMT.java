/*
 * Author Name: Jaival
 * Date: 30-08-2022
 * Createdd with IntelliJ IDEA Community Editiion
 */
package com.worldOfVehicles;

public class AMT extends Transmission {
    void showSpecs(String s, String s1, int forward_gears, double first_gear_ratio, double second_gear_ratio, double third_gear_ratio, double fourth_gear_ratio) {
        System.out.println("Transmission Type: " + s);
        System.out.println("Transmission Model: " + s1);

        System.out.println("Key Specifications: ");
        System.out.println("1. Forward Gears: " + forward_gears);
        System.out.println("2. 1st Gear ration: " + first_gear_ratio);
        System.out.println("3. 2st Gear ration: " + second_gear_ratio);
        System.out.println("4. 3st Gear ration: " + third_gear_ratio);
        System.out.println("5. 4st Gear ration: " + fourth_gear_ratio);
    }

    void showSpecs(String s, String s1, int forward_gears, double first_gear_ratio, double second_gear_ratio, double third_gear_ratio, double fourth_gear_ratio, double fifth_gear_ratio) {
        System.out.println("Transmission Type: " + s);
        System.out.println("Transmission Model: " + s1);

        System.out.println("Key Specifications: ");
        System.out.println("1. Forward Gears: " + forward_gears);
        System.out.println("2. 1st Gear ration: " + first_gear_ratio);
        System.out.println("3. 2nd Gear ration: " + second_gear_ratio);
        System.out.println("4. 3rd Gear ration: " + third_gear_ratio);
        System.out.println("5. 4th Gear ration: " + fourth_gear_ratio);
        System.out.println("6. 5th Gear ration: " + fifth_gear_ratio);
    }
}
