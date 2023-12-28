//Alt sistemler
class Kapi {
    public void kilitAc() {
        System.out.println("Kapı açıldı");
    }

    public void kilitle() {
        System.out.println("Kapı kapatıldı");
    }
}

class Televizyon {
    private int sesSeviye;
    private int kanalNumara;
    
    public int getSesSeviye() {
        return sesSeviye;
    }

    public void setSesSeviye(int sesSeviye) {
        this.sesSeviye = sesSeviye;
    }

    public int getKanalNumara() {
        return kanalNumara;
    }

    public void setKanalNumara(int kanalNumara) {
        this.kanalNumara = kanalNumara;
    }
    
    public Televizyon(int sesSeviye, int kanalNumara) {
        this.sesSeviye = sesSeviye;
        this.kanalNumara = kanalNumara;
    }

    public void ac() {
        System.out.println("Televizyon açıldı");
    }
    public void kapat() {
        System.out.println("Televizyon kapatıldı");
    }
    public void sesAzalt() {
        sesSeviye--;
        System.out.println("Ses seviyesi " + sesSeviye + " olarak ayarlandı");
    }
    public void sesArtir() {
        sesSeviye++;
        System.out.println("Ses seviyesi " + sesSeviye + " olarak ayarlandı");
    }
    public void kanalAzalt() {
        kanalNumara--;
        System.out.println("Kanal numarası " + kanalNumara + " olarak ayarlandı");
    }
    public void kanalArtir() {
        kanalNumara++;
        System.out.println("Kanal numarası " + kanalNumara + " olarak ayarlandı");
    }
}

class Isik {
    private boolean durum;
    public void setDurum(boolean durum) {
        this.durum = durum;
    }
    public Isik(boolean durum) {
        this.durum = durum;
    }
    
    public void ac() {
        System.out.println("Işık açıldı");
    }

    public void kapat() {
        System.out.println("Işık kapatıldı");
    }
    public boolean isDurum() {
        return durum;
    }
}

class Klima {
    public void guncelle(int sicaklik) {
        System.out.println("Sıcaklık " + sicaklik + " dereceye ayarlandı");
    }
    public void ac() {
        System.out.println("Klima açıldı");
    }

    public void kapat() {
        System.out.println("Klima kapatıldı");
    }
}

class Firin {
    public void ac() {
        System.out.println("Fırın açıldı");
    }

    public void kapat() {
        System.out.println("Fırın kapatıldı");
    }
}

class AkilliEvsistemi {
    Kapi kapi = new Kapi();
    Televizyon televizyon = new Televizyon(0, 0);
    Isik isik = new Isik(false);
    Klima klima = new Klima();
    Firin firin = new Firin();

    public Kapi getKapi() {
        return kapi;
    }

    public void setKapi(Kapi kapi) {
        this.kapi = kapi;
    }

    public Televizyon getTelevizyon() {
        return televizyon;
    }

    public void setTelevizyon(Televizyon televizyon) {
        this.televizyon = televizyon;
    }

    public Isik getIsik() {
        return isik;
    }

    public void setIsik(Isik isik) {
        this.isik = isik;
    }

    public Klima getKlima() {
        return klima;
    }

    public void setKlima(Klima klima) {
        this.klima = klima;
    }

    public Firin getFirin() {
        return firin;
    }

    public void setFirin(Firin firin) {
        this.firin = firin;
    }
    
    public AkilliEvsistemi(Kapi kapi, Televizyon televizyon, Isik isik, Klima klima, Firin firin) {
        this.kapi = kapi;
        this.televizyon = televizyon;
        this.isik = isik;
        this.klima = klima;
        this.firin = firin;
        isik.ac();
        isik.kapat();
        televizyon.ac();
        televizyon.kapat();
        televizyon.sesAzalt();
        televizyon.sesArtir();
        televizyon.kanalAzalt();
        televizyon.kanalArtir();
        klima.guncelle(25);
        klima.ac();
        klima.kapat();
        kapi.kilitle();
        kapi.kilitAc();
        firin.ac();
        firin.kapat();
    }


    /* 
    public void evdenDisariCik() {
        System.out.println("Evden dışarı çıkılıyor");
        kapi.kilitle();
        isik.kapat();
        klima.kapat();
        televizyon.kapat();
        firin.kapat();
    }

    public void eveGir() {
        System.out.println("Eve giriliyor");
        kapi.kilitAc();
        isik.ac();
        klima.ac();
        televizyon.ac();
        firin.ac();
    }
    */
}