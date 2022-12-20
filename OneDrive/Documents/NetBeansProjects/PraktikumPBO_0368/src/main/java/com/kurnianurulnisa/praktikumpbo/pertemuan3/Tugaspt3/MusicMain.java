package com.kurnianurulnisa.praktikumpbo.pertemuan3.Tugaspt3;

public class MusicMain {
    public static void main(String[] args) {
        // PEMBUATAN CLASS
        Music vierra = new Music("Seandainya", "Pop Rock",2010); 
        Music Geisha = new Music("Pergi saja", "Pop",2011); 
        Music Tulus = new Music("Monokrom", "Pop Rock",2016); 
        
        // menjalankan method 'showProfile()'
        vierra.showProfile();
        Geisha.showProfile();
        Tulus.showProfile();
        
        //demo getter & setter
        System.out.println("2010 tahun rilis (before) : " + vierra.getTahunRilis());
        vierra.setTahunRilis(2011);
        System.out.println("2010 tahun rilis (after) : " + vierra.getTahunRilis());
    }
}
