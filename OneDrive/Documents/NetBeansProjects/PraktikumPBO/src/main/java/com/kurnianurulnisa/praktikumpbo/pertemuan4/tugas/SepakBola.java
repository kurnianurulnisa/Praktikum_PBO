package com.kurnianurulnisa.praktikumpbo.pertemuan4.tugas;

public class SepakBola extends Olahraga {
    public void gerakan(String jenis){
        System.out.println("Sepak bola " + nama + " menendang " + jenis + "Kick off");
    }
    public void extraInfo(){
        System.out.println("Jenis Tendangan : Kick off");
    }
    public void arah(){
        System.out.println("Tendangan melambung");
        System.out.println();
    }
}