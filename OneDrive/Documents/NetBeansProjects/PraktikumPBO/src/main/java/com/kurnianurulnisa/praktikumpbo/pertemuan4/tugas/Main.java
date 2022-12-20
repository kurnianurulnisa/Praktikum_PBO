package com.kurnianurulnisa.praktikumpbo.pertemuan4.tugas;

public class Main {
    public static void main(String[] args) {
        //pembuatan objek
        SepakBola sb = new SepakBola();
        Olahraga or = new Olahraga();
        
        //mengisi nilai attribute
        sb.nama   = "Sepak bola";
        sb.jenis  = "Tim";
        sb.jumlah = 21;
        
        or.nama = "Sepak takraw";
        or.jenis = "Tim";
        or.jumlah = 3;
        
        //pemanggilan method
        sb.showInfo();
        sb.memenangkan();
        sb.arah();
        
        or.showInfo();
        or.memenangkan();
    }
}
