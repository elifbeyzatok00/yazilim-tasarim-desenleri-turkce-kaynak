import java.util.ArrayList;

public interface Sekil{
}

interface Alan extends Sekil{
    public double alanHesapla();
}

interface Cevre extends Sekil{
    public double cevreHesapla();
}

class Kare implements Alan, Cevre{
    private int kenar;

    public double alanHesapla() {
        return kenar * kenar;
    }

    public double cevreHesapla() {
        return 4 * kenar;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

}

interface Pano {
    public double hesapla(ArrayList<Sekil> sekils);
}

class AlanPano implements Pano{
    public double hesapla(ArrayList<Sekil> sekils){
        double toplam = 0;
        for(Sekil sekil : sekils){
            if(sekil instanceof Alan) {
                toplam += ((Alan) sekil).alanHesapla();
            }
        }
        return toplam;
    }
}

class CevrePano implements Pano{
    public double hesapla(ArrayList<Sekil> sekils){
        double toplam = 0;
        for(Sekil sekil : sekils){
            if(sekil instanceof Cevre)
                toplam += ((Cevre) sekil).cevreHesapla();
        }
        return toplam;
    }
}