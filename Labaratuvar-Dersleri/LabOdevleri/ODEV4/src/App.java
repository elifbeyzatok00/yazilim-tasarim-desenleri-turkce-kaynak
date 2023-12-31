public class App {
    public static void main(String[] args) throws Exception {
        //İstemci, Facade sınıfını kullanarak alt sistemlerle etkileşime geçer.
        // AkilliEvsistemi akilliEv = new AkilliEvsistemi(null, null, null, null, null);
        // AkilliEvsistemi nesnesini oluşturun
        AkilliEvsistemi akilliEv = new AkilliEvsistemi(new Kapi(), new Televizyon(0, 0), new Isik(false), new Klima(), new Firin());

        //Evden dışarı çıkılıyor
        akilliEv.kapi.kilitle();
        akilliEv.televizyon.kapat();
        akilliEv.isik.kapat();
        akilliEv.klima.kapat();
        akilliEv.firin.kapat();

        /* 
        //Evden dışarı çıkılıyor
        akilliEv.evdenDisariCik();

        //Eve giriliyor
        akilliEv.eveGir();
        */
    }
}
