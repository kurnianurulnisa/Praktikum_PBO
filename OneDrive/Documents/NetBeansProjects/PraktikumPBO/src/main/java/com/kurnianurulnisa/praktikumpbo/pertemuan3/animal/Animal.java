package com.kurnianurulnisa.praktikumpbo.pertemuan3.animal;

public class Animal {
    // attribute
    private String name;
    private int age;
    private String color;
    
    //constructor 1
    public Animal() {}
    
    // [Alt] + [insert] -> constructor
    public Animal(String name, int age, String color) {
        //this.name merujuk ke atribut sedangkan (this dipakek apabila untuk kesamaan aja)
        //name setelah samadengan untuk parameter
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    // method mencetak semua atribut
    public void showProfile() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age + " years old");
        System.out.println("Color : " + color);
    }
    
    // [Alt] + [insert] -> Getter & Setter -> Select All
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}