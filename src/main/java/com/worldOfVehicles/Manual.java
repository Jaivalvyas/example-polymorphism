/*
 * Author Name: Jaival
 * Date: 30-08-2022
 * Createdd with IntelliJ IDEA Community Editiion
 */
package com.worldOfVehicles;

public class Manual extends Transmission {
    public Manual(int forward_gears, double first_gear_ratio, double second_gear_ratio, double third_gear_ratio, double fourth_gear_ratio, double fifth_gear_ratio, double sixth_gear_ratio, double seventh_gear_ratio, double eighth_gear_ratio) {
        super(forward_gears, first_gear_ratio, second_gear_ratio, third_gear_ratio, fourth_gear_ratio, fifth_gear_ratio, sixth_gear_ratio, seventh_gear_ratio, eighth_gear_ratio);
    }

    void showSpecs(String s, String s1, int forward_gears, double first_gear_ratio, double second_gear_ratio, double third_gear_ratio, double fourth_gear_ratio) {
        System.out.println("Transmission Type: " + s);
        System.out.println("Transmission Model: " + s1);
    }
}
