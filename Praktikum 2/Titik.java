public class Titik{
    //dekalarasi atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;

    //dekalrasi konstruktor
    public Titik(){
        absis =0;
        ordinat =0;
        counterTitik++;
    }

    //dekalrasi konstruktor
    public Titik(double a, double b){
        absis =a;
        ordinat =b;
        counterTitik++;
    }

    //deklarasi metode
    public void setAbsis(double a){
        absis =a;
    }
    public void setOrdinat(double o){
        ordinat =o;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public int getCounterTitik(){
        return counterTitik;
    }
}