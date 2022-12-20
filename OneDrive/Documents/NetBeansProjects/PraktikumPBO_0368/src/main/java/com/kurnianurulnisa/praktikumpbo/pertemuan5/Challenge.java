package com.kurnianurulnisa.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        // Deklarasi scanner untuk user input nanti
        Scanner input = new Scanner(System.in);
        
        // Membuat agar panjang array ditentukan input user
        System.out.println("-- Program Input Nilai --");
        System.out.print("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println();
             
        // Membuat array baru dengan panjang sesuai input user
        int[] nilai = new int[jml];
        float total, rata;
        
        //memasukkan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println(); 
        
        // Menampilkan semua nilai array
        System.out.println("-- Nilai Array --");
        for(int i=0; i<jml; i++){
            System.out.println(i+1 + ":" + nilai[i]);
        }
        
        // Menghitung total nilai array
        total = 0;
        for(int i = 0; i < jml; i++){
            total = total + nilai[i];
        }
        
        // Menghitung nilai rata-rata array
        rata = (total/jml);
        System.out.println("Nilai rata rata dari " + jml+ " inputan adalah : " + rata);
    }
}
