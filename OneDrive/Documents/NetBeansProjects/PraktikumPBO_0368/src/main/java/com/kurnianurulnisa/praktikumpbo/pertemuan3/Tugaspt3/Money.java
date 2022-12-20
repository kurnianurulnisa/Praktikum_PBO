package com.kurnianurulnisa.praktikumpbo.pertemuan3.Tugaspt3;

public class Money {
    //Attribute
    public int jumlah       ;
    public String pahlawan  ;
    public String warna     ;
    
    //Constructor 1
    public Money(){}
    
    public void showProfile(){
        System.out.println("Nominal : " + jumlah);
        System.out.println("Tokoh   : " + pahlawan);
        System.out.println("Warna   : " + warna);
        System.out.println();
    }
}
