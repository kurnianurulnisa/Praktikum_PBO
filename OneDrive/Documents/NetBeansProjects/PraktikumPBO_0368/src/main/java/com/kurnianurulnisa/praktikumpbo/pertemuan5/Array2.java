package com.kurnianurulnisa.praktikumpbo.pertemuan5;

public class Array2 {
        public static void main(String[] args) {
        // pembuatan array
        String[] names = {
            "Rain",
            "Thunder",
            "Storm",
            "Inferno",
            "Embers",
        };
        // cek panjang array
        System.out.println("Panjang array: " + names.length);
        
        // menampilkan semua niai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + "; " + names[i]);
        }
    }
}
