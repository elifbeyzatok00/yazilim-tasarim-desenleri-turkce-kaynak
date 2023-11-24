public class Standart extends Kullanici {
    public static final int ORAN = 20;

    public Standart(String isim, String kimlik, double tlBakiye) {
        super(isim, kimlik, tlBakiye);
    }

    @Override
    public double bakiyeGoster(double miktar) {
        return getTlBakiye();
    }
}
