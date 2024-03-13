package com.pratikum;
public class buku {

    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private String sinopsis;

    public buku(String judul, String penulis, int jumlahHalaman, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.sinopsis = sinopsis;
    }

    public int hitungJumlahKataSinopsis() {
        String[] kataKata = sinopsis.split(" ");
        return kataKata.length;
    }

    public void output(){
        System.out.println("1. Judul buku               : " +judul);
        System.out.println("2. Penulis                  : " + penulis);
        System.out.println("3. Jumlah Halaman           : " + jumlahHalaman);
        System.out.println("4.  Sinopsis                : " + sinopsis);
        System.out.println("5.  Jumlah kata di sinopsis : " + hitungJumlahKataSinopsis());
    }

    public void kategori(buku[] bukuArray){
        int i = 0;
        for (buku buku : bukuArray) {
            i++;
            if (i <= bukuArray.length) 
                System.out.println("buku ke-" + i);
            buku.output();
        }
    }

    
}
