public class Main {
    public static void main(String[] args) {

        Musteri m0 = new Kullanici(); // Kullanici üst sınıf Musteri alt sınıf. alt sınıflar daha fazla özelliğe sahip bu nedenle
        // üst sınıfın referansı alt sınıfa atanabilir. ama üst sınıfın referansı alt sınıfın özelliklerini kullanamaz. Yani alt sınıfın referansı üst sınıfa atanamaz.
        // burada Kullanici nesne, Musteri referans

        Kullanici m1 = new Musteri();
        Musteri m2 = new Musteri();

        m1.selam();
        m2.selam();

        m1.merhaba();  // Musteri sınıfından üretilmiş ama referansı Kullanici ve Kullanici içinde merhaba yok bu yüzden çalışmaz
        m2.merhaba();

        Musteri m3 = new Musteri();  // dump casting ile Kullanici tipinden Musteri tipine donusturuldu (referans değiştirdik)
        m3.merhaba();
    }
}