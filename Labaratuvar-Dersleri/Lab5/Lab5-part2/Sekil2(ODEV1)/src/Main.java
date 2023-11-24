import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        Kare kare1 = new Kare();
        Kare kare2 = new Kare();
        kare1.setKenar(10);
        kare2.setKenar(20);

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.setUzunKenar(5);
        dikdortgen.setKisaKenar(8);

        Cember cember = new Cember();
        cember.setYaricap(7.5);

        Daire daire = new Daire();
        daire.setYaricap(4.0);

        ArrayList<Sekil> liste = new ArrayList<Sekil>();
        liste.add(kare1);
        liste.add(kare2);
        liste.add(dikdortgen);
        liste.add(cember);
        liste.add(daire);

        AlanPano alanPano = new AlanPano();
        CevrePano cevrePano = new CevrePano();

        System.out.println("Alan Pano: " + alanPano.hesapla(liste));
        System.out.println("Cevre Pano: " + cevrePano.hesapla(liste));
    }
}