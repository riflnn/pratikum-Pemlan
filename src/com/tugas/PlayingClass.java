package com.tugas;

public class PlayingClass {
    public static void main(String[] args) {
        PantheraTigris tiger1, tiger2, tiger3;
        tiger1 = new PantheraTigris();
        tiger1.id = "t1";
        // tiger1.colour = "Coklat"; error karena colour bersifat privat.
        tiger1.yearOfBirth = 2019;
        tiger1.name = "Rifa";
    
        tiger2 = new PantheraTigris();
        tiger2.id = "t2";
        // tiger2.colour = "Putih"; error karena colour bersifat privat.
        tiger2.yearOfBirth = 2021;
        tiger2.name = "Budi";
    
        tiger3 = new PantheraTigris();
        tiger3.id = "t3";
        // tiger3.colour = "Putih"; error karena colour bersifat privat.
        tiger3.yearOfBirth = 2021;
        tiger3.name = "Ester";
    
        // System.out.println("Spesifikasi harimau 1\n" + "ID: " + tiger1.id + "\nWarna: " + tiger1.colour + "\nTahun error karena colour bersifat privat. lahir: " + tiger1.yearOfBirth + "\nSuara makan: " + tiger1.eat() + "\nSuara mengaum: " + tiger1.roar());
        System.out.println();
        // System.out.println("Spesifikasi harimau 2\n" + "ID: " + tiger2.id + "\nWarna: " + tiger2.colour + "\nTahun error karena colour bersifat privat. lahir: " + tiger2.yearOfBirth);
        System.out.println();
        // System.out.println("Spesifikasi harimau 3\n" + "ID: " + tiger3.id + "\nWarna: " + tiger3.colour + "\nTahun error karena colour bersifat privat. lahir: " + tiger3.yearOfBirth);
    }
}
