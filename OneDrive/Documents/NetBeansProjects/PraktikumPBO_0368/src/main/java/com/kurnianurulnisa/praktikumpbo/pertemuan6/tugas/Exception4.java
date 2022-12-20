package com.kurnianurulnisa.praktikumpbo.pertemuan6.tugas;

public class Exception4 {
    static void demoproc(){
        try{
            throw new NullPointerException ("demo");
        }
        catch(NullPointerException e){
            System.out.println("Program didalam");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Program lempar ke sini");
        }
    }
}
