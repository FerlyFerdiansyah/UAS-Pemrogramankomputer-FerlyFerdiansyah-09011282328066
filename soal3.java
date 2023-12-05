package com.coding;

import java.util.Scanner;

//Ferly ferdiansyah SK1C
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai n dari input pengguna
        System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
        int n = scanner.nextInt();

        // Menampilkan deret Fibonacci hingga suku ke-n
        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Menutup scanner
        scanner.close();
    }

    // Menghitung suku ke-n dalam deret Fibonacci menggunakan fungsi rekursif
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
