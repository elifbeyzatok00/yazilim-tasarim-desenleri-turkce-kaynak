import java.util.ArrayList;

public abstract class User {
    private Sepet sepet;
    public User(){
        sepet = new Sepet();
    }
    public Sepet getSepet() {
        return sepet;
    }
    public abstract double indirimHesapla(double tutar);
}

class Standart extends User {
    public double indirimHesapla(double tutar){
        return tutar;
    }
}

class Premium extends User {
    public double indirimHesapla(double tutar){
        return tutar * 0.9;
    }
}
class Urun {
    private String isim;
    private double fiyat;
    public Urun(String isim, double fiyat){
        setIsim(isim);
        setFiyat(fiyat);
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
class Sepet {
    private ArrayList<Urun> urunler;
    public Sepet(){
        urunler = new ArrayList<Urun>();
    }
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    public void urunCikar(Urun urun){
        urunler.remove(urun);
    }
    public ArrayList<Urun> getUrunler() {
        return urunler;
    }
    /* set yazmadık çünkü kullanıcı oluşurken sepet oluşuyor  */
}
class Odeme {
    public void odemeYap(User user){
        double toplam = 0;

        for(Urun urun : user.getSepet().getUrunler()){
            toplam += urun.getFiyat();
        }

        toplam = user.indirimHesapla(toplam);

        System.out.println("Ödeme yapıldı: " + toplam);
    }
}