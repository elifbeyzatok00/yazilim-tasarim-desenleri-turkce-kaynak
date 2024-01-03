public class App {
    public static void main(String[] args) throws Exception {
        Color red = new RedColor();
        Color blue = new BlueColor();
        Size a4 = new A4Size();
        Size a5 = new A5Size();

        Cover redA4Book = new Book(red, a4);
        Cover blueA5Magazine = new Magazine(blue, a5);

        redA4Book.createCover();       // Çıktı: Kitap Kapak Oluşturuldu - Renk: Kırmızı, Boyut: A4
        blueA5Magazine.createCover();  // Çıktı: Dergi Kapak Oluşturuldu - Renk: Mavi, Boyut: A5
    }
}
