import java.util.ArrayList;

public interface Sekil {
}

interface Alan extends Sekil {
    double alanHesapla();
}

interface Cevre extends Sekil {
    double cevreHesapla();
}

class Kare implements Alan, Cevre {
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

class Dikdortgen implements Alan, Cevre {
    private int uzunKenar;
    private int kisaKenar;

    public double alanHesapla() {
        return uzunKenar * kisaKenar;
    }

    public double cevreHesapla() {
        return 2 * (uzunKenar + kisaKenar);
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
}

class Cember implements Alan, Cevre {
    private double yaricap;

    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}

class Daire implements Alan, Cevre {
    private double yaricap;

    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}

interface Pano {
    double hesapla(ArrayList<Sekil> sekils);
}

class AlanPano implements Pano {
    public double hesapla(ArrayList<Sekil> sekils) {
        double toplam = 0;
        for (Sekil sekil : sekils) {
            if (sekil instanceof Alan) {
                toplam += ((Alan) sekil).alanHesapla();
            }
        }
        return toplam;
    }
}

class CevrePano implements Pano {
    public double hesapla(ArrayList<Sekil> sekils) {
        double toplam = 0;
        for (Sekil sekil : sekils) {
            if (sekil instanceof Cevre)
                toplam += ((Cevre) sekil).cevreHesapla();
        }
        return toplam;
    }
}