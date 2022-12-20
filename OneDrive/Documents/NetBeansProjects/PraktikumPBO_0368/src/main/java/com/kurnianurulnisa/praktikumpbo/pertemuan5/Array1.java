package com.kurnianurulnisa.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        // pembuatan array
        String[] names = new String[5];
    
        // cek panjang array
        System.out.println("Panjang array: " + names.length);
        
        //m memasukkan nilai ke array
        names[0] = "Rain";
        names[1] = "Thunder";
        names[2] = "Storm";
        
        // menampilkan semua niai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + "; " + names[i]);
        }
    }
}
