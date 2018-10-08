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
public class PBO210117061Latihan39TerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner baca = new Scanner(System.in);
        TerbesarTerkecil oBaru = new TerbesarTerkecil();

        System.out.print("Masukkan nama petugas : ");
        oBaru.nama = baca.nextLine();

        System.out.print("\nMasukkan banyaknya mahasiswa : ");
        oBaru.banyakMahasiswa = baca.nextInt();
        oBaru.inputNilai();
        oBaru.tampil();
        oBaru.urut();
        
        System.out.println("\nnilai terbesar\t: " + oBaru.max);
        System.out.println("nilai terkecil\t: " + oBaru.min);
        System.out.println("nama petugas\t: "+oBaru.nama);
    }

}
