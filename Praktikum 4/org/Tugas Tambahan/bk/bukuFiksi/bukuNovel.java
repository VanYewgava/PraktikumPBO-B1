/**
 * File : bukuNovel.java
 * Penulis : Achmad Ivan Yugava
 * Deskripsi: source code class bukuNovel yang mewarisi bukuFiksi
 */
package bk.bukuFiksi;

import bk.bukuFiksi.bukuFiksi;

public class bukuNovel extends bukuFiksi{
    public bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }
}
