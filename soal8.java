package com.coding;

//Ferly ferdiansyah SK1C
public class soal8 {
    // Atribut akun
    public String username;
    public String password;
    public boolean statusAktif;

    // Konstruktor
    public soal8(String username, String password) {
        this.username = username;
        this.password = password;
        this.statusAktif = false; // Default: akun nonaktif
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInformasi() {
        System.out.println("Username: " + username);
        System.out.println("Status: " + (statusAktif ? "Aktif" : "Nonaktif"));
        System.out.println();
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        if (!statusAktif) {
            statusAktif = true;
            System.out.println("Akun " + username + " berhasil diaktifkan.");
        } else {
            System.out.println("Akun " + username + " sudah aktif.");
        }
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        if (statusAktif) {
            statusAktif = false;
            System.out.println("Akun " + username + " berhasil dinonaktifkan.");
        } else {
            System.out.println("Akun " + username + " sudah nonaktif.");
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas AkunPengguna
        soal8 akun1 = new soal8("ferly1", "password123");
        soal8 akun2 = new soal8("ferly2", "securePass");

        // Menampilkan informasi akun
        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();

        // Mengaktifkan akun
        akun1.aktifkanAkun();
        akun2.aktifkanAkun();

        // Menampilkan informasi akun setelah diaktifkan
        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();

        // Menonaktifkan akun
        akun1.nonaktifkanAkun();

        // Menampilkan informasi akun setelah dinonaktifkan
        akun1.tampilkanInformasi();
    }
}
