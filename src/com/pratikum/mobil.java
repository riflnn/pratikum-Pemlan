package com.pratikum;

public class mobil {
    public String merk;
    public String platNomor;
    public int tahun;
    public String transmisi;

    //method maju
    //this = memberitahu bahwa variabel dibelakangnya mengacu ke instan variabel di dalam kelas tapi diluar method

    public void maju() {
        System.out.printf("mobil %s dengan plat nomor %s bergerak maju\n", merk, platNomor);
    }

    public void mundur(){
        System.out.printf("mobil %s dengan plat nomor %s bergerak mundur", merk, platNomor);
    }
}
