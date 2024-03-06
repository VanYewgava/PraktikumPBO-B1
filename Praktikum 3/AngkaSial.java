/*Nama : Achmad Ivan Yugava
 *NIM  : 24060122140153
  Lab  : B1 Praktikum 3
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //methode getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/*
PERTANYAAN: 
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 

Baris 12 akan dieksekusi karena angka yang diprint terlebih dahulu adalah angka 10.
Pada kode tersebut, angka yang dianggap sebagai angka sial adalah 13. Ketika angka 13 dicoba, 
eksepsi akan dilemparkan sehingga output akan mencetak pesan eksepsi "Angka 13 adalah angka sial" 
dan kemudian masuk ke dalam blok catch yang mencetak pesan "hati-hati memasukkan angka!!!".

*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

Baris 21 juga akan dieksekusi karena pada percobaan kedua, yaitu saat angka 13 dicoba, 
angka 13 dianggap sebagai angka sial. Ketika kode masuk ke dalam blok try, 
eksepsi akan dilemparkan dan kemudian ditangkap oleh blok catch yang mencetak 
pesan "hati-hati memasukkan angka!!!". */
