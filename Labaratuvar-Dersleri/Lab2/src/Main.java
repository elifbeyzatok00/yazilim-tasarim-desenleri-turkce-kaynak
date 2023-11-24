public class Main {
    public static void main(String[] args) {

        Musteri m0 = new Kullanici(); // Kullanici üst sınıf Musteri alt sınıf. Alt sınıflar daha fazla özelliğe sahip bu nedenle
        // Üst sınıfın referansı alt sınıfa atanabilir. Ama üst sınıfın referansı alt sınıfın özelliklerini kullanamaz. Yani alt sınıfın referansı üst sınıfa atanamaz.
        // Burada Kullanici nesne, Musteri referans

        Kullanici m1 = new Musteri();
        Musteri m2 = new Musteri();

        m1.selam();
        m2.selam();

        m1.merhaba();  // Musteri sınıfından üretilmiş ama referansı Kullanici ve Kullanici içinde merhaba yok bu yüzden çalışmaz
        m2.merhaba();

    
        Musteri m3 = (Musteri) m1;  
        // down casting(üst sınıf türünden alt sınıf türüne çevirme) ile m1 nesnesi Kullanici tipinden Musteri tipine donusturuldu (referans değiştirdik) ve m3 adı verildi.
        m3.merhaba(); //artık alt sınıfın özelliklerini kullanabiliriz.
        
        m1.merhaba(); // m1 hala Kullanici tipinde olduğu için merhaba() çalışmaz.
    }
}