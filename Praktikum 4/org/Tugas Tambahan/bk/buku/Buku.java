/**
 * File : buku.java
 * Penulis : Achmad Ivan Yugava
 * Deskripsi: representasi dasar dari objek buku
 */
package bk.buku;

public class Buku {
    protected String judul;
    protected String penulis;
    protected String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public String getTahunTerbit(){
        return tahunTerbit;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void view(){
        System.out.println("Berikut informasinya:");
        System.out.println("---------------");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
    }
    
}