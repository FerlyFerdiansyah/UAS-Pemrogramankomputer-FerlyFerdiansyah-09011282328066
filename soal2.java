package com.coding;

import java.util.Scanner;

//Ferly ferdiansyah SK1C
public class soal2 {
    public static void main(String[] args) {
        // data yang ditentukan
        String username = "Ferly";
        String password = "LastRider05";

        // Membaca input dari data pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // Melakukan autentikasi
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        // Menutup scanner
        scanner.close();
    }
}
