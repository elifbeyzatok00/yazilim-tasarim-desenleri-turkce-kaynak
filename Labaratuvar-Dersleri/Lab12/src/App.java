public class App {
    public static void main(String[] args) throws Exception {
        Kullanici kullanici = new Kullanici();
        Gonderi gonderi = new Gonderi();
        gonderi.setBaslik("Test");

        kullanici.takipciEkle(new Kullanici());
        kullanici.takipciEkle(new Grup());

        kullanici.paylas(gonderi);
    }
}
