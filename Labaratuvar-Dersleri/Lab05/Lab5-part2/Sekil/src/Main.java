import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        Kare kare1 = new Kare();
        Kare kare2 = new Kare();
        kare1.setKenar(10);
        kare2.setKenar(20);
        ArrayList<Sekil> liste = new ArrayList<Sekil>();
        liste.add(kare1);
        liste.add(kare2);

        AlanPano alanPano = new AlanPano();
        CevrePano cevrePano = new CevrePano();

        System.out.println("Alan Pano: " + alanPano.hesapla(liste));
        System.out.println("Cevre Pano: " + cevrePano.hesapla(liste));
    }
}

//ödev1 : birkaç şekil ekleyerek gönderelim