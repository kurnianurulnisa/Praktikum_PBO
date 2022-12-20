package com.kurnianurulnisa.praktikumpbo.pertemuan6.tugas;

public class Barang {
   private String kode;
   private String nama;
   private double harga;
   
   public void setKode(String vKode){
       try{
           kode = vKode;
           if(kode==null){
               throw new NullPointerException();
           }
       }
       catch (NullPointerException npe){
           System.out.println("Error : " + "Kode barang tidak boleh null");
       }
   }
   public String getKode(){
       return kode;
   }
   public void setNama(String vNama){
       try{
           nama = vNama;
           if(nama==null){
               throw new NullPointerException();
           }
       }
       catch (NullPointerException npe){
           System.out.println("Error : " + "Nama barang tidak boleh null");
       }
   }
   public String getNama(){
       return nama;
   }
}
