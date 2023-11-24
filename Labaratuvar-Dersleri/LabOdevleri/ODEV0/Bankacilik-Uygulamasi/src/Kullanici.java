public abstract class Kullanici {
    private String isim;
    private String kimlik;
    private double tlBakiye;

    public Kullanici(String isim, String kimlik, double tlBakiye) {
        setIsim(isim);
        setKimlik(kimlik);
        setTlBakiye(tlBakiye);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public double getTlBakiye() {
        return tlBakiye;
    }

    public void setTlBakiye(double tlBakiye) {
        this.tlBakiye = tlBakiye;
    }

    public abstract double bakiyeGoster(double miktar);
}
