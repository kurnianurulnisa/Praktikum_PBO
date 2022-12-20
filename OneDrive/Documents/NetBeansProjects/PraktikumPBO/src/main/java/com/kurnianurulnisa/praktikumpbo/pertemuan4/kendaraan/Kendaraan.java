package com.kurnianurulnisa.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    //attribute (variable)
    String nama;
    int jmlRoda;
    String warna;
    int harga;
     
    //method (fungsi)
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + " telah dinyalakan!");
    }
    
    public void showInfo(){
        System.out.println("Nama            : " + nama);
        System.out.println("Jml roda        : " + jmlRoda);
        System.out.println("Warna kendaraan : " + warna);
        System.out.println("Harga kendaraan : " + harga);
        extraInfo();
    }
   
    public void extraInfo(){}
}
