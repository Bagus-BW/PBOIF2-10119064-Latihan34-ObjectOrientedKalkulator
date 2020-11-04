/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan34.objectorientedkalkulator;

import data.Kalkulator;
import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program perhitungan kalkulator sederhana
 */
public class PBOIF210119064Latihan34ObjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisiasi objek kalkulator
        Kalkulator kal = new Kalkulator();
        
        //inisiasi inputan
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = keyboard.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = keyboard.nextDouble();
        
        //hasil dari operasi kalkulator
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan());
        
        System.out.println("Hasil Pengurangan : " + kal.kurangBilangan());
        
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        
        System.out.println("Hasil Pembagian : " + kal.bagiBilangan());
        
        System.out.println("Hasil Sisa : " + kal.sisaBilangan());
    }
    
}
