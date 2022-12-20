package com.kurnianurulnisa.praktikumpbo.pertemuan3.Tugaspt3;

public class Music {
    //attribute
    private String nama;
    private String genre;
    private int tahunRilis;
    
    //Constructor 1
    public Music(){}
    
    //Constructor 2
    public Music(String nama, String genre, int tahunRilis){
        this.nama = nama;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }
    
    //method untuk menampilkan isi attribute
    public void showProfile(){
        System.out.println("Judul        : " + nama);
        System.out.println("Genre        : " + genre);
        System.out.println("Tahun Rilis  : " + tahunRilis);
        System.out.println();
    }
    
    //getter & setter
    public String getNama() {
        return nama;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
