package com.coding;

import java.util.Scanner;

//Ferly ferdiansyah SK1C
public class soal1 {
    public static void main(String[] args) {
        // membaca harga dan jumlah barang
        Scanner scanner = new Scanner(System.in);
        // input harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();
        // input jumlah yang dibeli
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlahPembelian = scanner.nextInt();

        double totalHarga = hitungTotalHarga(hargaBarang, jumlahPembelian);
        // tampilkan total harga
        System.out.println("Total harga setelah diskon: " + totalHarga);

        // Menutup Scanner
        scanner.close();
    }

    public static double hitungTotalHarga(double hargaBarang, int jumlahPembelian) {
        double diskon = 0.0;
        // menginput diskon
        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = 0.05;
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = 0.1;
        } else if (jumlahPembelian > 20) {
            diskon = 0.2;
        }
        // menghitung total harga dan jumlah diskon
        double totalHarga = hargaBarang * jumlahPembelian;
        double jumlahDiskon = totalHarga * diskon;

        return totalHarga - jumlahDiskon;
    }
}
