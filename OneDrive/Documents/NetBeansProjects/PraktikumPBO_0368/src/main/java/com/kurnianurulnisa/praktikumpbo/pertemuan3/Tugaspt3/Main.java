package com.kurnianurulnisa.praktikumpbo.pertemuan3.Tugaspt3;

public class Main {
    public static void main(String[] args) {
        //Pembuatan Class
        Money Rupiah = new Money();
        Money Yen    = new Money();
        Money Dollar  = new Money();
        
        //mengisi nilai attribute object 'Rupiah'
        Rupiah.jumlah   = 10000;
        Rupiah.pahlawan = "Frans Kaisiepo";
        Rupiah.warna    = "Purple";
        
        //mengisi nilai attribute object 'Yen'
        Yen.jumlah      = 1000;
        Yen.pahlawan    = "Hideyo Noguchi";
        Yen.warna       = "Green";
        
        //mengisi nilai attribute object 'Dolar;
        Dollar.jumlah    = 100;
        Dollar.pahlawan  = "Benjamin Franklin";
        Dollar.warna     = "Grey";
        
        //menjalankan method 'showProfile()' masing-masing object
        Rupiah.showProfile();
        Yen.showProfile();
        Dollar.showProfile();
    }
}
