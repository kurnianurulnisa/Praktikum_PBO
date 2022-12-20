package com.kurnianurulnisa.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamicArray {
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
        
        //memasukkan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println(); 
        
        // Menampilkan semua nilai array
        System.out.println("-- Daftar Nilai--");
        for(int i=0; i<jml; i++){
            System.out.println(i + ":" + nilai[i]);
        }
    }
}
