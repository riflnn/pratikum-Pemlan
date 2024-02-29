package com.tugas;

import java.util.Scanner;

public class Vet_v_1_0 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.printf("=============================\n%s\nby Rifa\n=============================\n", "Vet v1.0");
      PantheraTigris tiger = new PantheraTigris();
      System.out.print("Apakah ID harimau anda? ");
      tiger.id = scanner.nextLine();
      System.out.print("Siapakah nama harimau anda? ");
      tiger.name = scanner.nextLine();
      System.out.print("Tahun berapa dia dilahirkan? ");
      tiger.yearOfBirth = scanner.nextInt();
      scanner.nextLine();
      System.out.println();
      System.out.println("Selamat datang " + tiger.name + " di Vet v1.0.");
      System.out.println("Tahun ini " + tiger.name + " telah berumur " + tiger.getAge() + " tahun.");
      System.out.print("Ingin mengaum (y/t) ");
      tiger.jawab = scanner.nextLine();
      if (tiger.jawab.equals("y")){
         System.out.println(tiger.roar());
      }
      else {
         System.out.println("Baik, tidak apa. Mungkin lain kali");
      }
      System.out.println("\nTerima kasih telah menggunakan sistem ini.");

    }
}
