/* Nama : Achmad Ivan Yugava
 * NIM : 24060122140153
 * Lab : B1 Praktikum 2
 */
public class PrismaSegitiga {
    private Segitiga Alas;
    private double Tinggi;
    
    PrismaSegitiga(Segitiga Alas, double Tinggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
    public double hitungVolume(){
        double x = Alas.hitungLuas();
        return x * Tinggi;
    }
    public double getTinggi(){
        return Tinggi;
    }
    public double hitungLuasPermukaan(){
        return (2*Alas.hitungLuas()) + ((Alas.getAlas() + Alas.getTinggi() + Alas.sisiMiring()) * Tinggi);
    }
}
