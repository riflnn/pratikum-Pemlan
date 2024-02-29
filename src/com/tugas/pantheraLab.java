package com.tugas;

public class pantheraLab {
    private String id;
    private String colour;
    private String gender;
    private int yearOfBirth;


    public void playId(String id){
        // String s = "test";
        id = "008";
    }
    public void setId(String inputId){ //method untuk mengisi field Id
        id = inputId; 
    }
    public String getId(){
        return id;
    }
    public String eat(){
        return "hau hau hauuuu...";
    }
    public String roar() {
        return "hoarrrrr......";
    }
    public int yearOfBirth(){
        return yearOfBirth;
    }
}
