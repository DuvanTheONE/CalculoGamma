/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculogamma;

/**
 *
 * @author Duvan
 */
import java.util.Scanner;

public class CalculoGamma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número real positivo: ");
        double x = sc.nextDouble();
        double resultado = gamma(x);
        
            System.out.println("Gamma(" + x + ") = " + resultado);
        
        sc.close();
    }
    
    public static double gamma(double x) {
       
            double z = x - 1;
            double p = 0.99999999999980993;
            p += 676.5203681218851 / (z + 1);
            p -= 1259.1392167224028 / (z + 2);
            p += 771.32342877765313 / (z + 3);
            p -= 176.61502916214059 / (z + 4);
            p += 12.507343278686905 / (z + 5);
            p -= 0.13857109526572012 / (z + 6);
            p += 9.9843695780195716e-6 / (z + 7);
            p += 1.5056327351493116e-7 / (z + 8);
            double t = z + 7.5;
            return Math.sqrt(2 * Math.PI) * Math.pow(t, z + 0.5) * Math.exp(-t) * p;
        
    }
}