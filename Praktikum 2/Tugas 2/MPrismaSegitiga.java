/* Nama : Achmad Ivan Yugava
 * NIM : 24060122140153
 * Lab : B1 Praktikum 2
 */
public class MPrismaSegitiga {
    public static void main(String[] args){
        Segitiga S1 = new Segitiga(3,4);
        PrismaSegitiga P1 = new PrismaSegitiga(S1, 5);

        System.out.println("Alas: "+S1.getAlas());
        System.out.println("Tinggi: "+S1.getTinggi());
        System.out.println("Tinggi Prisma: "+P1.getTinggi());
        System.out.println("Volume: "+P1.hitungVolume());
        System.out.println("LuasPermukaan: "+P1.hitungLuasPermukaan());
    }
}
