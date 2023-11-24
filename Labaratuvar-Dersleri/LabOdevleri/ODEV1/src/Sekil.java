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

class Ucgen implements Alan, Cevre {
    private int kenar1;
    private int kenar2;
    private int kenar3;

    public double alanHesapla() {
        double u = (kenar1 + kenar2 + kenar3) / 2;
        return Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
    }

    public double cevreHesapla() {
        return kenar1 + kenar2 + kenar3;
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
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