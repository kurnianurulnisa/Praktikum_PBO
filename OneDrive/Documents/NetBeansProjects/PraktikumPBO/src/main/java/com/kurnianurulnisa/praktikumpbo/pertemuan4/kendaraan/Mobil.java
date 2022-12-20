package com.kurnianurulnisa.praktikumpbo.pertemuan4.kendaraan;

public class Mobil extends Kendaraan {
    
    public void belok(String arah){
        System.out.println("Mobil " + nama + " belok ke " + arah + "!");
    }
    
    public void extraInfo(){
        System.out.println("Tipe kendaraan : Mobil");
        System.out.println();
    }
    public void belok(){//kalo mau diisi tipe data tidak boleh sama 
        System.out.println("Error : Mohon masukkan arah!");
        System.out.println();
    }
}
    /*
    //
    public void extraInfo(){
        System.out.println("Max Gear : " + maxGear);
    }
}
*/