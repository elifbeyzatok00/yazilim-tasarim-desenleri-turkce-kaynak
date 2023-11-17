public class Main {
    public static void main(String[] args) throws Exception {
        Odeme odeme = new Odeme();

        Urun urun1 = new Urun("Telefon", 20000);
        Urun urun2 = new Urun("Bilgisayar", 30000);

        User user1 = new Standart();
        User user2 = new Premium();

        user1.getSepet().urunEkle(urun1);
        user1.getSepet().urunEkle(urun2);

        user2.getSepet().urunEkle(urun1);
        user2.getSepet().urunEkle(urun2);

        odeme.odemeYap(user1);
        odeme.odemeYap(user2);
        
    }
}
