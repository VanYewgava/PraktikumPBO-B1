/* Nama: Achmad Ivan Yugava
 * NIM : 24060122140153
 * Lab : B1 Praktikum 3
 */
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
/*Dalam kode di atas, kondisi yang diperiksa menggunakan asersi adalah bahwa jari-jari harus lebih dari 0. 
Namun, untuk mengaktifkan fitur asersi dalam Java, perlu menjalankan program dengan menambahkan 
opsi -enableassertions. Contohnya ketika menjalankan program melalui terminal dengan perintah 
java -enableassertions Asersi2, output yang diharapkan adalah "jari-jari tidak boleh nol", yang sesuai 
dengan kondisi asersi yang tidak terpenuhi karena jari-jari dideklarasikan sebagai 0. Oleh karena itu, 
perlu mengaktifkan asersi dan memeriksa output yang sesuai. */