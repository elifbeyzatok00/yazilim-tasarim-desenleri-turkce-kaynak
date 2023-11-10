public class App {
    public static void main(String[] args) {
        Kullanici k1 = new Kullanici();
        k1.setIsim("sefa");
        k1.setMail("sefa@ktu.edu.tr");
        Adres adres = new Adres("Trabzon", "Of");
        k1.setFaturaAdres(adres);
        k1.setKargoAdres(adres);

        GirisIslemleri giris = new GirisIslemleri(k1);
        giris.girisYap();

    }
}
