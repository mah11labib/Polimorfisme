/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeDinamis;

import InheritanceBangunDatar.*;

/**
 *
 * @author pc20
 */
public class MainUtama {
    public static void main (String [] args){
        BangunDatar bangund= new BangunDatar();
        
        Persegi persegi = new Persegi(5);
        Segitiga segitiga = new Segitiga(10,10);
        Lingkaran lingkaran = new Lingkaran (10);
        
        //panggil method luas dan keliling
        bangund.luas();
        bangund.keliling();
        
        System.out.println("Luas Persegi = " + persegi.luas());
        System.out.println("Keliling Persegi = " + persegi.keliling());
        System.out.println("Luas Segitiga = " + segitiga.luas());
        System.out.println("Luas Lingkaran = " + lingkaran.luas());
        System.out.println("Keliling Lingkaran = " + lingkaran.keliling());
        
        
       
    }
}