class Titik{
    //dekalarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //dekalrasi konstruktor
    Titik(){
        absis =0;
        ordinat =0;
        counterTitik++;
    }

    //dekalrasi konstruktor
    Titik(double a, double b){
        absis =a;
        ordinat =b;
        counterTitik++;
    }

    //deklarasi metode
    void setAbsis(double a){
        absis =a;
    }
    void setOrdinat(double o){
        ordinat =o;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    int getCounterTitik(){
        return counterTitik;
    }

}