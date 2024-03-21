/**
 * File : bukuAkademik.java
 * Penulis : Achmad Ivan Yugava
 * Deskripsi: 
 */
package bk.bukunonFiksi;

public class bukuAkademik extends bukuNonFiksi {
    public bukuAkademik(String judul, String penulis, String tahunTerbit, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit, "Akademik", jumlahHalaman, harga);
    }
}