import java.util.Scanner; 
public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari Lingkaran : "); 
        double sisi = scan.nextDouble();
        Lingkaran l = new Lingkaran(sisi); 
        System.out.println("Luas lingkaran dengan"+"jejari 10.2 satuan adalah "+l.hitungLuas()); 
    } 
}
