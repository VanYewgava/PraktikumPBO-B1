
package bk.main;

import bk.bukuFiksi.bukuFiksi;
import bk.bukunonFiksi.bukuNonFiksi;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
    bukuFiksi novel = new bukuFiksi("Exhuma", "Ching Chong", "2000", "Horror and Thriller", 7000, 400.000);
    novel.view();

    System.out.println();
 
    bukuNonFiksi nonFiksi = new bukuNonFiksi("Crypto Analysis", "Timothy Ronald", "2022", "Finance", 1000, 200.000);
    nonFiksi.view();
 
    System.out.println();
 
    bukuAkademik akademik = new bukuAkademik("Judul Awal", "Penulis Awal", "2024", 400, 200.0);
    akademik.setJudul("Artificial Intelligent");
    akademik.setPenulis("Marc Zuckerberg");
    akademik.setHarga(500.000);
    akademik.setJumlahHalaman(4000);
    akademik.view();
 
    System.out.println();
    }
 }