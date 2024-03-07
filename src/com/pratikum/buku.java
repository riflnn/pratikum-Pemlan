package com.pratikum;
public class buku {

    public String[][] teknologi = {
        {"Java Programming", "John Doe", "300"},
        {"Python for Data Science", "Jane Smith", "250"},
        {"Machine Learning Basics", "David Johnson", "200"},
        {"Web Development with HTML & CSS", "Emily Brown", "180"},
        {"Cybersecurity Fundamentals", "Michael Lee", "220"}
    };

    public String[][] filsafat = {
        {"Meditations", "Marcus Aurelius", "200"},
        {"Sophie's World", "Jostein Gaarder", "400"},
        {"The Republic", "Plato", "350"},
        {"Beyond Good and Evil", "Friedrich Nietzsche", "280"},
        {"Critique of Pure Reason", "Immanuel Kant", "500"}
    };

    public String[][] sejarah = {
        {"A People's History of the United States", "Howard Zinn", "700"},
        {"Guns, Germs, and Steel", "Jared Diamond", "550"},
        {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "400"},
        {"The Rise and Fall of the Third Reich", "William L. Shirer", "1000"},
        {"The Silk Roads: A New History of the World", "Peter Frankopan", "800"}
    };

    public String[][] agama = {
        {"The Life of the Prophet Muhammad", "Ibn Kathir", "300"},
        {"In the Footsteps of the Prophet", "Tariq Ramadan", "250"},
        {"The Road to Mecca", "Muhammad Asad", "400"},
        {"Islam: A Short History", "Karen Armstrong", "200"},
        {"Muhammad: His Life Based on the Earliest Sources", "Martin Lings", "380"}
    };

    public String[][] psikologi = {
        {"Man's Search for Meaning", "Viktor E. Frankl", "200"},
        {"Thinking, Fast and Slow", "Daniel Kahneman", "500"},
        {"The Power of Habit", "Charles Duhigg", "300"},
        {"The Psychology of Persuasion", "Robert B. Cialdini", "250"},
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "350"}
    };

    public String[][] politik = {
        {"Indonesia Etc.: Exploring the Improbable Nation", "Elizabeth Pisani", "400"},
        {"The Politics of Indonesia: Malaysia Relations", "Amitav Acharya", "250"},
        {"Raja dan Praja di Bumi Nusantara", "Taufik Abdullah", "300"},
        {"Political Islam and Violence in Indonesia", "Zachary Abuza", "280"},
        {"Indonesia: Law and Society", "Tim Lindsey", "350"}
    };

    public String[][] fiksi = {
        {"To Kill a Mockingbird", "Harper Lee", "336"},
        {"1984", "George Orwell", "328"},
        {"The Great Gatsby", "F. Scott Fitzgerald", "180"},
        {"Harry Potter and the Philosopher's Stone", "J.K. Rowling", "320"},
        {"The Lord of the Rings", "J.R.R. Tolkien", "1178"}
    };
    
public String getInformasiBuku(int kode) {
    String informasi = "";
    
    switch (kode) {
        case 1:
            informasi = "\n Kategori\t: Teknologi\n";
            informasi += "========================\n";
            for (String[] buku : teknologi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 2:
            informasi = "Kategori: Filsafat\n";
            informasi += "========================\n";
            for (String[] buku : filsafat) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 3:
            informasi = "Kategori\t: Sejarah\n";
            informasi += "========================\n";
            for (String[] buku : sejarah) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 4:
            informasi = "Kategori\t: Agama\n";
            informasi += "========================\n";
            for (String[] buku : agama) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 5:
            informasi = "Kategori\t: Psikologi\n";
            informasi += "========================\n";
            for (String[] buku : psikologi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 6:
            informasi = "Kategori: Politik\n";
            informasi += "========================\n";
            for (String[] buku : politik) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 7:
            informasi = "Kategori\t: Fiksi\n";
            informasi += "========================\n";
            for (String[] buku : fiksi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        default:
            informasi = "Kode buku tidak valid.";
            break;
    }  
    return informasi;
}
}
