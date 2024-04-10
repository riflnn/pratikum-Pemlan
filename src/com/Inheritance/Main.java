package Inheritance ;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============\n" + "Kelas Manusia" + "\n=============");
        Manusia manusia1 = new Manusia("agus", "456", true, true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("ani", "123", false, true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("siti", "789", false, false);
        System.out.println(manusia3);

        System.out.println("\n=====================\n" + "Kelas MahasiswaFILKOM" + "\n=====================");
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("235150401111033",2.90 , "Rifa Qonitah", "098", false, false);
        System.out.println(mahasiswaFILKOM1);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("235150401111033",3.45 , "Rifa Qonitah", "098", false, false);
        System.out.println(mahasiswaFILKOM2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("235150401111033",3.93 , "Rifa Qonitah", "098", false, false);
        System.out.println(mahasiswaFILKOM3);

        System.out.println("\n=============\n" + "Kelas Pekerja" + "\n=============");
        Pekerja pekerja1 = new Pekerja(100, 2022, 1, 1, 2, "Budi", "352", true, true);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja(500, 2015, 2, 2, 2, "Yanto", "765", true, true);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja(800, 2004, 3, 3, 10, "Hanum", "323", false, true);
        System.out.println(pekerja3);

        System.out.println("\n=============\n" + "Kelas Manager" + "\n=============");
        Manager manager = new Manager("HRD", 7500, 2009, 1, 1, 0, "Lucas", "888", true, false);
        System.out.println(manager);
    } 
}