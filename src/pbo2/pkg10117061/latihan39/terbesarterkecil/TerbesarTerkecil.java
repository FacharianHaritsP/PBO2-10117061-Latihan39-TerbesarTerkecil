/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan39.terbesarterkecil;

import java.util.Scanner;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan nilai terbesar dan terkecil 
 *                    berdasarkan objek orientasi
 * 
 */
public class TerbesarTerkecil {

    public int banyakMahasiswa;
    public int[] nilai = new int[20];
    public int min;
    public int max;
    public String nama;

    Scanner baca = new Scanner(System.in);

    public void inputNilai() {

        for (int j = 1; j <= banyakMahasiswa; j++) {
            System.out.print("Masukan nilai mahasiswa ke-" + j + ":");
            nilai[j] = baca.nextInt();
        }

    }

    public void tampil() {
         for (int j = 1; j <= banyakMahasiswa; j++) {
            System.out.println("Nilai mahasiswa ke-" + j + ":"
                    + nilai[j]);
        }

    }

    public void urut() {

        min = nilai[1];
        max = nilai[1];
        for (int a = 1; a <= banyakMahasiswa; a++) {

            if (nilai[a] > max) {
                max = nilai[a];
            } else if (nilai[a] < min) {
                min = nilai[a];
            }
        }
    }
}
