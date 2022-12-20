package com.kurnianurulnisa.praktikumpbo.pertemuan4.tugas;

public class Olahraga {
    String nama;
    String jenis;
    int jumlah;
    
    //method atau fungsi 
    public void memenangkan(){
        System.out.println("Olahraga " + nama + " banyak memenangkan perlombaan!");
    }
    
    //menampilkan attribute
    public void showInfo(){
        System.out.println("Nama Olahraga   : " + nama);
        System.out.println("Jenis Olahraga  : " + jenis);
        System.out.println("Jumlah regu     : " + jumlah);
    
        extraInfo();
    }
    public void extraInfo(){}
}
