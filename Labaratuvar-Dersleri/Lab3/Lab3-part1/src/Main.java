public class Main {
    public static void main(String[] args) throws Exception {
        Musteri musteri = new Musteri();
        Satici satici = new Satici();

        musteri.giris();
        musteri.UrunGoruntule();

        satici.giris();
        satici.UrunListele();


        Kullanici m1 = new Musteri();
        Musteri m2 = new Musteri();
        // referansları farklı,  nesneleri aynı (Musteri())

        m1.giris(); //çalışır
        m2.giris(); //çalışır

        m1.UrunGoruntule(); //m1 Kullanici referansı ile oluşturulduğu için Kullanici sınıfında olmayan UrunGoruntule() methodunu kullanamaz, çalışmaz
        m2.UrunGoruntule(); //çalışır

        
        ((Musteri)m1).UrunGoruntule(); // Dump casting ile referansını değiştirdik

        ((Satici)m1).UrunGoruntule(); // Dump casting ile referansını değiştirdik
        // classCastException alınır. Burada referansı Satici olarak değiştiremeyiz. Çünkü nesnesi Musteri olarak tanımlandı.Burada nesnesi Musteri olduğu için referansı Satici olarak değiştirmeye izin vermez.  
    }
}
