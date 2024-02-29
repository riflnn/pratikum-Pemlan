package com.tugas;

public class animalPlay {
    public static void main(String[] args) {
        pantheraLab lion1;
        lion1 = new pantheraLab();
        System.out.println(lion1.eat());
        
        lion1.setId("L1");
        System.out.println(lion1.getId());

        String id = "007";
        lion1.playId(id);
        System.out.println(id);
        System.out.println(lion1.getId());
    }
}
