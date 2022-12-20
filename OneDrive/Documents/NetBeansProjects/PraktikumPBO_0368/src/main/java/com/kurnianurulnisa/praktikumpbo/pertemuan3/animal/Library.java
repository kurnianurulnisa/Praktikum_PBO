package com.kurnianurulnisa.praktikumpbo.pertemuan3.animal;

public class Library {
    //attribute
    private String name;
    private int visitorsToday;
    private int yearBuilt;
    
    //constructor 1
    public Library(){} 
    
    //constructor 2
    public Library(String name, int visitorsToday, int yearBuilt){
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    
    //method untuk menampilkan semua isi attribute
    public void showProfile(){
        System.out.println("Nama           : " + name);
        System.out.println("Pengunjung     : " + visitorsToday);
        System.out.println("Tahun terbit   : " + yearBuilt);
        System.out.println();
    }
    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    } 
}
