/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeStatis;

/**
 *
 * @author pc20
 */
public class lingkaran {
     float luas(float jarijari){
       return (float) (Math.PI * jarijari * jarijari);
     }
     double luas (double diameter){
         return (double) (Math.PI * diameter * 1/4);
     }
public static void main (String [] args){
    lingkaran L = new lingkaran();
    
    float jari2 = 10;
    double d = 20;
    
    System.out.println("Luas Lingkaran Dengan Jari - Jari = " + L.luas(jari2));
    System.out.println("Luas Lingkaran Dengan Diameter = " + L.luas(d));
    
}
}
