package com.kurnianurulnisa.praktikumpbo.pertemuan3.animal;

public class Main {
    public static void main(String[] args) {
        // membuat class
        Animal cat = new Animal ("Miyu", 2, "White");
        Animal dog = new Animal ("Hoho", 3, "Black");
        Animal rabbit = new Animal ("Mina", 1, "Brown");
        
        // menjalankan method 'showProfile()' pada masing-masing object
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
    
        // demo getter & setter
        System.out.println("Dog's name (before): " + dog.getName());
        dog.setName("Blackly");
        System.out.println("Dog's name (after) " + dog.getName());
    }
}
 
