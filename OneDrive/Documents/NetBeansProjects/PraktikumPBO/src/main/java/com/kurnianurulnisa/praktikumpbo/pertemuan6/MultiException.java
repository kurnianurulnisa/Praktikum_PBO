package com.kurnianurulnisa.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Masukkan bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.print("Masukkan pembagi  : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            // Menampilkan output
            System.out.println("Hasil pembagian (dibulatkan) : "+ hasil);
        }
        //Jika ditemukan error, program akan lari kesini
        //exception penyebab error nya apa 
        catch(ArithmeticException e){
            System.out.println("Bilangan tidak bisa dibagi 0!");
        }
        catch(InputMismatchException e){
            System.out.println("Harap masukkan angka saja!");
        }
    }
}