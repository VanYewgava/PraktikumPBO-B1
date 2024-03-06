/* Nama : Achmad Ivan Yugava
 * NIM : 24060122140153
 * Lab : B1 Praktikum 2
 */
public class Segitiga {
    private double Alas;
    private double Tinggi;

    Segitiga(double Alas, double Tinggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
    public double getAlas(){
        return Alas;
    }
    public double getTinggi(){
        return Tinggi;
    }
    public double hitungLuas(){
        return 0.5 * Alas * Tinggi;
    }
    public double sisiMiring(){
        return Math.sqrt(Math.pow(getAlas()/2,2) + Math.pow(getTinggi(), 2));
    }
}