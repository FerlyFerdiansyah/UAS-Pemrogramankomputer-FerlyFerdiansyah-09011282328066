package com.coding;

import java.util.Scanner;

//Ferly ferdiansyah SK1C
public class soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca kata atau frase dari inputan pengguna
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Memanggil metode untuk mengecek palindrom
        if (isPalindrom(input)) {
            System.out.println("Ini adalah palindrom.");
        } else {
            System.out.println("Ini bukan palindrom.");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk mengecek palindrom
    public static boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah menjadi huruf kecil
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        // Membandingkan string dengan string yang dibalik
        StringBuilder reversedStr = new StringBuilder(cleanStr).reverse();
        return cleanStr.equals(reversedStr.toString());
    }
}
