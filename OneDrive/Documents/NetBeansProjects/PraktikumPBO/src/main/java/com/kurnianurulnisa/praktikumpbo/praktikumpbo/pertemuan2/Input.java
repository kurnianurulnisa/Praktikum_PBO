package com.kurnianurulnisa.praktikumpbo.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //constructor
        
        //kalo int pakai nextInt, klo float pakai nextFloat
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
                
        System.out.print("Masukkan usia : ");
        int usia = input.nextInt();
        System.out.println("");
        
        System.out.println("Selamat pagi, " + nama + "!");
        System.out.println("Nama saya : " + nama);
        System.out.println("Usia saya : "+ usia + " tahun");
    } 
}
