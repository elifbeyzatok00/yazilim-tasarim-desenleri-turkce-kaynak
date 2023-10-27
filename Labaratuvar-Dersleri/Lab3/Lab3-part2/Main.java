public class Main {
    
    public static void main(String[] args) {
        Kare kare = new Kare(5);
        Ucgen ucgen = new Ucgen(5,6);
        Dikdortgen dikdortgen = new Dikdortgen(7, 6);
        AlanHesapla alanHesapla = new AlanHesapla();

        alanHesapla.Yazdir(kare);
        alanHesapla.Yazdir(dikdortgen);
        alanHesapla.Yazdir(ucgen);
    }

    
}
