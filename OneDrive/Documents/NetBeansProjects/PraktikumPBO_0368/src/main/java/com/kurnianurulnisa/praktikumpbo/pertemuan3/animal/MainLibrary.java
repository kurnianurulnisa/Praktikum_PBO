package com.kurnianurulnisa.praktikumpbo.pertemuan3.animal;

public class MainLibrary {
    public static void main(String[] args) {
        // membuat class
        Library Lola = new Library("sejarah", 2, 2017);
        Library Mila = new Library("ekonomi", 1, 2018);
        Library Carista  = new Library("kimia", 3, 2020);
        
        // menjalankan method 'showProfile()' pada masing-masing object
        Lola.showProfile();
        Mila.showProfile();
        Carista.showProfile();
    
        // demo getter & setter
        System.out.println("sejarah name (before): " + Lola.getName());
        Lola.setName("kimia");
        System.out.println("sejarah name (after) " + Lola.getName());
    }
}
