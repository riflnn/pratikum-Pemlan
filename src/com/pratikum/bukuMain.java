package com.pratikum;

import java.util.Scanner;

public class bukuMain {
    public static void main(String[] args) {
        buku perpus = new buku();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("========================PERPUSTAKAAN========================\n");
        System.out.printf(" SELAMAT DATANG DI PERPUSTAKAAN SI-C \nTerdapat beberapa kategori buku di perpustakaan ini, yaitu:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Psikologi\n 6. Politik\n 7. Fiksi\n \nsilahkan masukkan kode kategori buku yang ingin anda cari : ");

        int kode = sc.nextInt();

        String informasiBuku = perpus.getInformasiBuku(kode);
        System.out.println(informasiBuku);
    }
}
