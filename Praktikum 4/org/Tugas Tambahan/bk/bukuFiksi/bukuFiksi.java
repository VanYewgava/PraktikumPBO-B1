/**
 * File : bukuFiksi.java
 * Penulis : Achmad Ivan Yugava
 * Deskripsi: source code class bukuFiksi yang mewarisi buku.java
 */
package bk.bukuFiksi;

import bk.buku.Buku;
 
public class bukuFiksi extends Buku {
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;
 
    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }
 
    public String getGenre() {
        return genre;
    }
 
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
 
    public double getHarga() {
        return harga;
    }
 
    public void setJumlahHalaman(int JumlahHalaman) {
         jumlahHalaman = JumlahHalaman;
    }

    @Override
    public void view() {
    System.out.println("INFORMASI BUKU FIKSI");
    System.out.println("--------------------");
    super.view(); 
    System.out.println("Genre: " + getGenre());
    System.out.println("Jumlah Halaman: " + getJumlahHalaman());
    System.out.println("Harga: $" + getHarga());
    }
}