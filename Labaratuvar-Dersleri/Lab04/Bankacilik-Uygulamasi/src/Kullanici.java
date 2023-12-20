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

class Standart extends Kullanici{
   public static final int ORAN = 20;
   public Standart (String isim, String kimlik, double tlBakiye){
       super(isim, kimlik, tlBakiye);
   }
    public double bakiyeGoster(double miktar){
        return getTlBakiye();
    }
}

class Ozel extends Kullanici{
    public static final double TL_MALIYET = 20;
    public static final double DOVIZ_MALIYET = 500;
    private double dovizBakiye;
    public Ozel (String isim, String kimlik, double tlBakiye, double dovizBakiye){
        super(isim, kimlik, tlBakiye);
        setDovizBakiye(dovizBakiye);
    }
    public double getDovizBakiye() {
        return dovizBakiye;
    }
    public void setDovizBakiye(double dovizBakiye) {
        this.dovizBakiye = dovizBakiye;
    }
    public double bakiyeGoster(double miktar){
        return getTlBakiye() + getDovizBakiye() * Doviz.KUR;
    }
    
}