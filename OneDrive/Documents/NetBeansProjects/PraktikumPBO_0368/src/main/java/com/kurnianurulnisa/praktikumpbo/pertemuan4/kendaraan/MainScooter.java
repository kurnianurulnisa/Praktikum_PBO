package com.kurnianurulnisa.praktikumpbo.pertemuan4.kendaraan;

public class MainScooter {
    public static void main(String[] args) {
        
        //Pembuatan object
        Scooter sc = new Scooter();
        
        //mengisi nilai attribute
        sc.nama = "Jira";
        sc.jmlRoda = 2;
        sc.warna = "Grey";
        sc.harga = 3000000;
        
        //uji coba pemanggilan method
        sc.showInfo();
        sc.nyalakanMesin();
        sc.belok("Kiri");
    }
}





























