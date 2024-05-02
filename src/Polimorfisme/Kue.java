package Polimorfisme;

public abstract class Kue {
        private String nama;
        private double harga;
    
        abstract double hitungHarga();
        
        public Kue(String nama, double harga) {
            this.nama = nama;
            this.harga = harga;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
        public String getNama() {
            return nama;
        }
        public void setHarga(double harga) {
            this.harga = harga;
        }
        public double getHarga() {
            return harga;
        }
    
        public String toString() {
            String str = "Nama\t: " + nama + "\n";
            if(this instanceof KuePesanan) {
                str += "Harga\t: " + harga + "\nJenis\t: Kue Pesanan\nBerat\t: " + ((KuePesanan)this).getBerat() + " kg\n";
            } else if(this instanceof KueJadi) {
                str += "Harga\t: " + harga + "\nJenis\t: Kue Jadi\nJumlah\t: " + ((KueJadi)this).getJumlah() + " buah\n";
            }
            return str;
        }
    
    }

