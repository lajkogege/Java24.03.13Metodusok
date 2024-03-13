/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusgyakorlas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class MetodusGyakorlas {
    
    public static void main(String[] arg) {
        int ossze
        
        int [] szamok={3,5,12};
        int osszeg=osszegzes(szamok);
        double gyok =gyokvonas(osszeg);
        String kimenet ="";
        konzolraIr(kimenet);
    }
    
    private static int osszegzes(int [] tomb){
        int osszeg =0;
    }
    
    private static int osszegzes(int a, int b){
        return a+b;
    }

    private static double gyokvonas(int osszeg){
        return Math.sqrt(osszeg);
    }
    
     private static int konzolraIr(String kimenet){
         System.out.println(kimenet);
    }
      
}

