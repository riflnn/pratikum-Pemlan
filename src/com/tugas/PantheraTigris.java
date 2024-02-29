package com.tugas;

public class PantheraTigris {
    // class PantheraTigris {// jika public dihilangkan, maka tidak dapat diakses diluar package
    public String id; //fild, implementing atribut
    private String colour; // jika privat maka tidak bisa digunakan dan tidak akan terlihat di kelas beda dan satu package
    String name;
    int yearOfBirth;
    String jawab;
    
    //jika variabel turunan (umur / turunan dari yearOfBirth) lebih baik tidak menggunakan fild
    
    String eat(){
        return "Rau rau rau";
    }
    String roar() {
        return "Roaaaarrrr.....!";
    }
    int getAge(){
        int currentYear = 2024;
        return currentYear - yearOfBirth;
        // return 2024 - yearOfBirth;
    }
    int getAge(int year){
        return year - yearOfBirth;
    }
    public String getColour(){
        return colour;
    }
    void testColour(){
        System.out.println(colour); // masih bisa di akses walaupun privat
    }
}
