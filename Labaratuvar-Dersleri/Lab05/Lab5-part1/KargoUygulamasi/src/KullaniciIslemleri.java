public abstract class KullaniciIslemleri {
    public KullaniciIslemleri(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    protected Kullanici kullanici;

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
}
