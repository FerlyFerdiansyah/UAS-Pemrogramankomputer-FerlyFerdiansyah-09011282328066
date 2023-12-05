package com.coding;

import java.util.Scanner;

//Ferly ferdiansyah SK1C
public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca dua angka dari input pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Menampilkan menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        // Membaca pilihan operasi dari input pengguna
        System.out.print("Masukkan nomor operasi: ");
        int pilihan = scanner.nextInt();

        // Memanggil metode sesuai dengan pilihan
        switch (pilihan) {
            case 1:
                tambah(angka1, angka2);
                break;
            case 2:
                kurang(angka1, angka2);
                break;
            case 3:
                kali(angka1, angka2);
                break;
            case 4:
                bagi(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk penjumlahan
    public static void tambah(double a, double b) {
        System.out.println("Hasil penjumlahan: " + (a + b));
    }

    // Metode untuk pengurangan
    public static void kurang(double a, double b) {
        System.out.println("Hasil pengurangan: " + (a - b));
    }

    // Metode untuk perkalian
    public static void kali(double a, double b) {
        System.out.println("Hasil perkalian: " + (a * b));
    }

    // Metode untuk pembagian
    public static void bagi(double a, double b) {
        if (b != 0) {
            System.out.println("Hasil pembagian: " + (a / b));
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol.");
        }
    }
}
