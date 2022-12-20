package com.kurnianurulnisa.praktikumpbo.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        System.out.println("Silahkan login..");
        k=1;
    
        do{
           System.out.println("Loading... (" + k + "/3");
           k++;
           
           System.out.print("Masukkan username: ");
           String username = input.nextLine();
           
           System.out.print("Masukkan password: ");
           int password = input.nextInt();
           System.out.println(""); 
        }while (k<=3);
        System.out.println("Login berhasil!");
    }
}