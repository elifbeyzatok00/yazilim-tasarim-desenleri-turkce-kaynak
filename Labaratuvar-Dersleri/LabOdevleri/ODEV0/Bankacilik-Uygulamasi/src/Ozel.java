public class Ozel extends Kullanici {
    public static final double TL_MALIYET = 20;
    public static final double DOVIZ_MALIYET = 500;
    private double dovizBakiye;

    public Ozel(String isim, String kimlik, double tlBakiye, double dovizBakiye) {
        super(isim, kimlik, tlBakiye);
        setDovizBakiye(dovizBakiye);
    }

    public double getDovizBakiye() {
        return dovizBakiye;
    }

    public void setDovizBakiye(double dovizBakiye) {
        this.dovizBakiye = dovizBakiye;
    }

    @Override
    public double bakiyeGoster(double miktar) {
        return getTlBakiye() + getDovizBakiye() * Doviz.KUR;
    }
}
