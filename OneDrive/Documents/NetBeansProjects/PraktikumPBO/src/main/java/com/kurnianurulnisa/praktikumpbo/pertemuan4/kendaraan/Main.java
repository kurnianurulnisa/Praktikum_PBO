package com.kurnianurulnisa.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //Pembuatan object 
        //Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        
        //Memasukkan nilai attribute
        mb.nama = "Avanza";
        mb.jmlRoda = 4;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        //Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");//parameter yg didalam kurung
        mb.belok();
        
        kn.showInfo();
        kn.nyalakanMesin();
    }
}
