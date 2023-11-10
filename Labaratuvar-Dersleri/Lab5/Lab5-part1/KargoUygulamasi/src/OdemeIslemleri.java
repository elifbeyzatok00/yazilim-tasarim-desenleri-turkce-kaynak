public class OdemeIslemleri extends KullaniciIslemleri {

    public OdemeIslemleri(Kullanici kullanici) {
        super(kullanici);

    }

    public void odemeYap() {
        System.out.println(this.kullanici + "odeme yapti");
    }

}
