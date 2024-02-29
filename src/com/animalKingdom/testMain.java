package com.animalKingdom;
import com.tugas.PantheraTigris;//import kelas agar bisa digunakan walau beda package

public class testMain {
    public static void main(String[] args) {
        PantheraTigris testTiger; 
        testTiger = new PantheraTigris();

        testTiger.id = "a";// akan error jika id di kelas panthera tigris tidak public
        
    }
}
