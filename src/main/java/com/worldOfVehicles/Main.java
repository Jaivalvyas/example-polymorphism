/*
 * Author Name: Jaival
 * Date: 30-08-2022
 * Createdd with IntelliJ IDEA Community Editiion
 */
package com.worldOfVehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of transmission: ");
        String type = sc.nextLine();

        if (type.equals("Manual")) {
            Manual mp = new Manual();
            System.out.println("Enter model number: ");
            String model = sc.nextLine();
            if (model.equals("mp4")) {
                mp.showSpecs(type, model, 4, 2.540, 1.920, 1.510, 1.000);
            } else if (model.equals("mp5")) {
                mp.showSpecs(type, model, 5, 3.545, 1.904, 1.280, 0.914, 0.757);
            } else if (model.equals("mp6")) {
                mp.showSpecs(type, model, 6, 3.010, 2.070, 1.430, 1.000, 0.710, 0.570);
            } else if (model.equals("md5")) {
                mp.showSpecs(type, model, 5, 3.545, 1.904, 1.233, 0.911, 0.725);
            } else if (model.equals("md6")) {
                mp.showSpecs(type, model, 6, 3.640, 2.150, 1.360, 1.000, 0.750, 0.630);
            } else
                System.out.println("Invalid");
        } else if (type.equals("AMT")) {
            AMT amt = new AMT();
            System.out.println("Enter model number: ");
            String model = sc.nextLine();
            if (model.equals("AMTP4")) {
                amt.showSpecs(type, model, 4, 2.540, 1.920, 1.510, 1.000);
            } else if (model.equals("AMTP5")) {
                amt.showSpecs(type, model, 5, 2.950, 1.940, 1.340, 1.000, 0.630);
            } else
                System.out.println("Invalid");
        } else if (type.equals("CVT")) {
            CVT cvt = new CVT();
            cvt.showSpecs(type, "CVT6", 6, 2.631, 1.940, 1.340, 1.000, 0.680, 0.499);
        } else if (type.equals("DCT")) {
            DCT dct = new DCT();
            dct.showSpecs(type, "DCT8", 8, 2.631, 1.940, 1.340, 1.000, 0.680, 0.499, 0.839, 0.667);
        } else
            System.out.println("Invalid");
    }
}
