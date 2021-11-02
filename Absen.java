/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Absen {

    ArrayList<Pengunjung> listPengunjung;

    public Absen() {
        Scanner in = new Scanner(System.in);
        this.listPengunjung = new ArrayList<>();

        while (true) {

            System.out.println("Nama Lengkap:");
            String namaLengkap = in.nextLine();
            if (namaLengkap.isEmpty()) {
                System.out.println("Error: Tidak boleh kosong!");
                continue;
            }

            System.out.println("Asal Kota:");
            String asalKota = in.nextLine();
            if (asalKota.isEmpty()) {
                System.out.println("Error: Tidak boleh kosong!");
                continue;
            }

            System.out.println("Nomor Ponsel:");
            String nomorPonsel = in.nextLine();
            if (!cekNomorPonsel(nomorPonsel)) {
                System.out.println("Error: Format salah!");
                continue;
            }

            this.listPengunjung.add(new Pengunjung(namaLengkap, asalKota, nomorPonsel));

            System.out.println("Terimakasih\n");

            cetakDaftarPengunjung();

            System.out.println("\n");
        }
    }

    // Fungsi untuk mengecek format nomor ponsel
    // Mengembalikan nilai true apabila format benar dan false apabila salah
    boolean cekNomorPonsel(String s) {
        return false;

    }

    // Fungsi untuk mencetak semua daftar pengunjung dalam bentuk tabel pada konsol
    // Contoh:
    // +------------------+---------------+-------------------+
    // | Nama Lengkap     | Asal Kota     | Nomor Ponsel      |
    // +------------------+---------------+-------------------+
    // | Budi Hartono     | Malang        | 1234512345        |
    // | Iwan Sutrisno    | Banyuwangi    | 23456723456       |
    // +------------------+---------------+-------------------+
    void cetakDaftarPengunjung() {

    }
}