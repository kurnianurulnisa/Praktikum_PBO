package com.kurnianurulnisa.praktikumpbo.pertemuan4.kendaraan;

public class Scooter extends Kendaraan {
    
    public void belok(String arah){
        System.out.println("Scooter " + nama + " belok ke " + arah + "!");
    }
    
    public void extraInfo(){
        System.out.println("Tipe kendaraan  : Scooter");
        System.out.println();
    }
}
