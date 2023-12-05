package com.coding;

import java.util.Scanner;

//Ferly ferdiansyah SK1C
public class soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca bilangan bulat positif dari input pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Menampilkan faktorisasi bilangan
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        // Menutup scanner
        scanner.close();
    }

    // Fungsi untuk melakukan faktorisasi bilangan
    public static void faktorisasi(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
