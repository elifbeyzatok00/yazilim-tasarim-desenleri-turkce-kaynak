public interface Sekil {
    public double AlanHesapla();
}

class AlanHesapla {
    public void Yazdir(Sekil sekil){
        System.out.println(sekil.AlanHesapla());
    }
}

class Kare implements Sekil{
    private int kenar;

    public Kare(int kenar){
        setKenar(kenar);
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    public double AlanHesapla(){
        return getKenar() * getKenar();
    }
    

}
class Ucgen implements Sekil{
    private int kenar;
    private int yukseklik;

    public Ucgen(int kenar, int yukseklik){
        setKenar(kenar);
        setYukseklik(yukseklik);
    }

    public int getKenar() {
        return kenar;
    }
    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
    public int getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double AlanHesapla(){
        return (getKenar() * getYukseklik()) / 2;
    }
    
}
class Dikdortgen implements Sekil{
    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar){
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public int getUzunKenar() {
        return uzunKenar;
    }
    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
    public int getKisaKenar() {
        return kisaKenar;
    }
    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double AlanHesapla(){
        return getKisaKenar() * getUzunKenar();
    }
}



