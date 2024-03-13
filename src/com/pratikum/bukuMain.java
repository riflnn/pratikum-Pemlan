package com.pratikum;
import java.util.Scanner;

public class bukuMain {
    public static void main(String[] args) {
        buku perpus = new buku("Judul Default", "Penulis Default", 0, "Sinopsis Default");

        Scanner sc = new Scanner(System.in);

        System.out.println("========================PERPUSTAKAAN========================\n");
        System.out.printf(" SELAMAT DATANG DI PERPUSTAKAAN SI-C \nTerdapat beberapa kategori buku di perpustakaan ini, yaitu:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Psikologi\n 6. Politik\n 7. Fiksi\n \nsilahkan masukkan kode kategori buku yang ingin anda cari : ");

        int kode = sc.nextInt();
        switch (kode) {
            case 1:
            buku buku1Teknologi = new buku("Java Programming", "John Doe", 300, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?,");
            buku buku2Teknologi = new buku("Python for Data Science", "Jane Smith", 250, " laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku3Teknologi = new buku("Machine Learning Basics", "David Johnson", 200, "Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku4Teknologi = new buku("Web Development with HTML & CSS", "Emily Brown", 180, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis");
            buku buku5Teknologi = new buku("Cybersecurity Fundamentals", "Michael Lee", 220, "Lorem ipsum dolor sit amet consectetur adipisicing elit.quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku[] bukuArrayTeknologi = {buku1Teknologi, buku2Teknologi, buku3Teknologi, buku4Teknologi, buku5Teknologi};
            perpus.kategori(bukuArrayTeknologi);
            break;

            case 2:
            buku buku1Politik = new buku("Meditations", "Marcus Aurelius", 200, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku2Politik = new buku("Sophie's World", "Jostein Gaarder", 400, " laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku3Politik = new buku("The Republic", "Plato", 350, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku4Politik = new buku("Beyond Good and Evil", "Friedrich Nietzsche", 280, "Lorem sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku5Politik = new buku("Critique of Pure Reason", "Immanuel Kant", 500, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku[] bukuArrayPolitik = {buku1Politik, buku2Politik, buku3Politik, buku4Politik, buku5Politik};
            perpus.kategori(bukuArrayPolitik);
            break;

            case 3:
            buku buku1Sejarah = new buku("A People's History of the United States", "Howard Zinn", 700, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku2Sejarah = new buku("Guns, Germs, and Steel", "Jared Diamond", 550, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku3Sejarah = new buku("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku4Sejarah = new buku("The Rise and Fall of the Third Reich", "William L. Shirer", 1000, " adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku5Sejarah = new buku("The Silk Roads: A New History of the World", "Peter Frankopan", 800, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku[] bukuArraySejarah = {buku1Sejarah, buku2Sejarah, buku3Sejarah, buku4Sejarah, buku5Sejarah};
            perpus.kategori(bukuArraySejarah);
            break;

            case 4:
            buku buku1Agama = new buku("The Life of the Prophet Muhammad", "Ibn Kathir", 300, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku2Agama = new buku("In the Footsteps of the Prophet", "Tariq Ramadan", 250, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku3Agama = new buku("The Road to Mecca", "Muhammad Asad", 200, " itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku4Agama = new buku("Islam: A Short History", "Karen Armstrong", 180, " laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            buku buku5Agama = new buku("Muhammad: His Life Based on the Earliest Sources", "Martin Lings", 220, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?,");
            buku[] bukuArrayAgama = {buku1Agama, buku2Agama, buku3Agama, buku4Agama, buku5Agama};
            perpus.kategori(bukuArrayAgama);
            break;

            case 5:
            buku buku1Psikologi = new buku("Man's Search for Meaning", "Viktor E. Frankl", 200, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorem quos p.");
            buku buku2Psikologi = new buku("Thinking, Fast and Slow", "Daniel Kahneman", 500, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku3Psikologi = new buku("The Power of Habit", "Charles Duhigg", 300, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorem quos perferendis maiores odit.");
            buku buku4Psikologi = new buku("The Psychology of Persuasion", "Robert B. Cialdini", 250, "Lorem ipsum dolor sit amet consectetur adipisicing elit.  labore amet aliquid, optio maiores odit.");
            buku buku5Psikologi = new buku("Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", 350, "7quos perferendis accusantium porro architecto est ratione nostrum laudantium placeat voluptatem qui dolorum libero ipsum labore amet aliquid, optio maiores odit.");
            buku[] bukuArrayPsikologi = {buku1Psikologi, buku2Psikologi, buku3Psikologi, buku4Psikologi, buku5Psikologi};
            perpus.kategori(bukuArrayPsikologi);
            break;

            case 6:
            buku buku1Filsafat = new buku("Indonesia Etc.: Exploring the Improbable Nation", "Elizabeth Pisani", 400, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum ");
            buku buku2Filsafat = new buku("The Politics of Indonesia: Malaysia Relations", "Amitav Acharya", 250, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku3Filsafat = new buku("Raja dan Praja di Bumi Nusantara", "Taufik Abdullah", 300, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            buku buku4Filsafat = new buku("Political Islam and Violence in Indonesia", "Zachary Abuza", 280, "as, repudiandae natus sint animi quaerat impedit.");
            buku buku5Filsafat = new buku("Indonesia: Law and Society", "Tim Lindsey", 350, "amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            buku[] bukuArrayFilsafat = {buku1Filsafat, buku2Filsafat, buku3Filsafat, buku4Filsafat, buku5Filsafat};
            perpus.kategori(bukuArrayFilsafat);
            break;

            case 7:
            buku buku1Fiks = new buku("To Kill a Mockingbird", "Harper Lee", 336, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            buku buku2Fiks = new buku("1984", "George Orwell", 328, " quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            buku buku3Fiks = new buku("The Great Gatsby", "F. Scott Fitzgerald", 180, "dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus sint animi quaerat impedit.");
            buku buku4Fiks = new buku("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 320, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            buku buku5Fiks = new buku("The Lord of the Rings", "J.R.R. Tolkien", 1178, "soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedita.");
            buku[] bukuArrayFiks = {buku1Fiks, buku2Fiks, buku3Fiks, buku4Fiks, buku5Fiks};
            perpus.kategori(bukuArrayFiks);
            break;

            default:
                System.out.println("Maaf, Nomor Kategori Tidak Tersedia");
        }
        
    }
}
