package com.coding;

//Ferly ferdiansyah SK1C
public class soal7 {
    // Atribut buku
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public boolean dipinjam;

    // Konstruktor
    public soal7(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Default: buku belum dipinjam
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Sedang Dipinjam" : "Tersedia"));
        System.out.println();
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Buku " + judul + " sedang dipinjam.");
        }
    }

    public static void main(String[] args) {
        // Contoh Buku
        soal7 buku1 = new soal7("Harry Potter", "J.K. Rowling", 2001);
        soal7 buku2 = new soal7("To Kill a Mockingbird", "Harper Lee", 1960);

        // Menampilkan informasi buku
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        // Meminjam buku
        buku1.pinjamBuku();
        buku2.pinjamBuku();

        // Menampilkan informasi buku setelah dipinjam
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
    }
}
