package com.kurnianurulnisa.praktikumpbo.pertemuan6.tugas;

public class MainBarang {
    public static void main(String[] args) {
        Barang obj = new Barang();
        
        obj.setKode(null);
        obj.setNama("Buku tulis");
        
        System.out.println("\nKode : " + obj.getKode());
        System.out.println("Nama : " + obj.getNama());
    }
}
