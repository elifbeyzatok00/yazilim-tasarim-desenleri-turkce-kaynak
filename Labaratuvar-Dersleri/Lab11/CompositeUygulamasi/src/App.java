public class App {
    public static void main(String[] args) throws Exception {
        Yonetici yonetici1 = new Yonetici();
        yonetici1.setName("Yönetici 1");
        Gelistirici gelistirici1 = new Gelistirici();
        gelistirici1.setName("Gelistirici 1");
        Tasarimci tasarimci1 = new Tasarimci();
        tasarimci1.setName("Tasarimci 1");
        Tasarimci tasarimci2 = new Tasarimci();
        tasarimci2.setName("Tasarimci 2");

        Ekip ekip1 = new Ekip(yonetici1);
        Ekip ekip2 = new Ekip(tasarimci1);

        ekip1.ekle(ekip2);
        ekip1.ekle(tasarimci2);
        ekip2.ekle(gelistirici1);

        ekip1.bilgiGoster();

        /*
        Yönetici 1 isimli ekip bilgileri gösteriliyor.
        ---------------------------
        Tasarimci 1 isimli ekip bilgileri gösteriliyor.
        ---------------------------
        Gelistirici 1 isimli geliştiricinin bilgileri gösteriliyor.
        Tasarimci 2 isimli tasarımcının bilgileri gösteriliyor.
         */
    }
}
