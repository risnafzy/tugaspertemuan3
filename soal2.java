/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class soal2 {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan jumlah uang tabungan
        try ( // Membuat objek Scanner untuk mengambil input dari pengguna
                Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna memasukkan jumlah uang tabungan
            System.out.print("Masukkan jumlah uang tabungan (dalam rupiah): ");
            double tabungan = scanner.nextDouble();
            // Meminta pengguna memasukkan informasi tentang calon pasangan
            System.out.print("Apakah Anda sudah punya calon pasangan? (y/n): ");
            String inputCalonPasangan = scanner.next();
            // Konversi input pengguna menjadi boolean
            boolean calonPasangan = inputCalonPasangan.equalsIgnoreCase("y");
            // Penentuan apakah akan menikah
            if (tabungan > 100000000 && calonPasangan) {
                System.out.println("Anda akan menikah!");
            } else {
                System.out.println("Anda belum siap untuk menikah.");
            }
            // Menutup objek Scanner
        }
    }
}
