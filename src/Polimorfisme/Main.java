package Polimorfisme;

public class Main {
    public static void main(String[] args) {
     
        Kue[] kue = {
            new KuePesanan("Kue Kering", 10000, 2),
            new KueJadi("Kue Basah", 5000, 5),
            new KuePesanan("Kue Manis", 8000, 3),
            new KueJadi("Kue Asin", 6000, 4),
            new KuePesanan("Kue Tart", 12000, 1),
            new KueJadi("Kue Gulung", 7000, 6),
            new KuePesanan("Kue Coklat", 15000, 2),
            new KueJadi("Kue Sus", 9000, 7),
            new KuePesanan("Kue Lapis", 11000, 2),
            new KueJadi("Kue Lemper", 7500, 5),
            new KuePesanan("Kue Pandan", 9500, 4),
            new KueJadi("Kue Keju", 8500, 3),
            new KuePesanan("Kue Jagung", 13000, 2),
            new KueJadi("Kue Bakar", 10000, 4),
            new KuePesanan("Kue Roti", 16000, 1),
            new KueJadi("Kue Sagu", 7000, 8),
            new KuePesanan("Kue Red Velvet", 17000, 2),
            new KueJadi("Kue Lumpur", 8500, 6),
            new KuePesanan("Kue Strawberry", 14000, 3),
            new KueJadi("Kue Ubi", 8000, 5)
        };
    
        System.out.println("=============Daftar Kue=============");
        for (int i = 0; i < kue.length; i++) {
            System.out.println(kue[i] + "\n");
        }

        double total = 0;
        double totalHargaKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalBerat = 0;
        double totalJumlah = 0;

        for (int i = 0; i < kue.length; i++) {
            total += kue[i].hitungHarga();
            if(kue[i] instanceof KuePesanan) {
                totalHargaKuePesanan += kue[i].hitungHarga();
                totalBerat += ((KuePesanan)kue[i]).getBerat();
            } else if(kue[i] instanceof KueJadi) {
                totalHargaKueJadi += kue[i].hitungHarga();
                totalJumlah += ((KueJadi)kue[i]).getJumlah();
            }
        }

        System.out.println("=============STATS=============");
        System.out.println("Total Harga Semua Kue\t: Rp " + total);
        System.out.println("\nTotal Harga Kue Pesanan\t: Rp " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan\t: " + totalBerat + " kg");
        System.out.println("\nTotal Harga Kue Jadi\t: Rp " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi\t: " + totalJumlah + " buah");

        double hargaTertinggi = 0;
        String namaKueTertinggi = "";
        String jenisKueTertinggi = "";

        for (int i = 0; i < kue.length; i++) {
            if(kue[i].hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kue[i].hitungHarga();
                namaKueTertinggi = kue[i].getNama();
                jenisKueTertinggi = (kue[i] instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }
        System.out.println("\n=============Kue Tertinggi=============");
        System.out.println("Jenis\t\t\t: " + jenisKueTertinggi);
        System.out.println("Nama\t\t\t: " + namaKueTertinggi);
        System.out.println("Harga\t\t\t: Rp " + hargaTertinggi);
    }
}
