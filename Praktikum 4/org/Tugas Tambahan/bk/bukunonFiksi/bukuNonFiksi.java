/**
 * File : bukuNonFiksi.java
 * Penulis : Achmad Ivan Yugava
 * Deskripsi: source code class buku non fiksi yang mewarisi objek buku
 */

package bk.bukunonFiksi;
import bk.buku.Buku;

public class bukuNonFiksi extends Buku{
    protected String subjek;
    protected int jumlahHalaman;
    protected double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }
    public String getSubjek(){
        return subjek;
    }
    public int getJumlahHalaman(){
        return jumlahHalaman;
    }
    public double getHarga(){
        return harga;
    }

    public void setSubjek(String subjek){
        this.subjek = subjek;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }

    @Override
    public void view() {
        System.out.println("INFORMASI BUKU NON FIKSI");
        System.out.println("-------------------------");
        super.view(); 
        System.out.println("Subjek: " + getSubjek());
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
        System.out.println("Harga: $" + getHarga());
    }
}
