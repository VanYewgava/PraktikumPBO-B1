import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : "); 
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangker dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi)); 
    } 
}
/* Jika kelas BujurSangkar tidak memberikan implementasi untuk metode abstrak yang dideklarasikan dalam kelas BangunDatar, 
ini akan mengakibatkan kesalahan kompilasi yang memaksa pengguna untuk menyediakan implementasi yang tepat.*/ 