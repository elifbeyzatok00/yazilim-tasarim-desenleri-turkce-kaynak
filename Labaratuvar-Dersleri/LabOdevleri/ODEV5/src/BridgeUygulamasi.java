// Renk arayüzü
interface Color {
    String fill();
}

// Kırmızı renk sınıfı
class RedColor implements Color {
    @Override
    public String fill() {
        return "Kırmızı";
    }
}

// Mavi renk sınıfı
class BlueColor implements Color {
    @Override
    public String fill() {
        return "Mavi";
    }
}

// Boyut arayüzü
interface Size {
    String resize();
}

// A4 boyutu sınıfı
class A4Size implements Size {
    @Override
    public String resize() {
        return "A4";
    }
}

// A5 boyutu sınıfı
class A5Size implements Size {
    @Override
    public String resize() {
        return "A5";
    }
}

// Kapak arayüzü
interface Cover {
    void createCover();
}

// Kitap sınıfı
class Book implements Cover {
    private Color color;
    private Size size;

    public Book(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void createCover() {
        System.out.println("Kitap Kapak Oluşturuldu - Renk: " + color.fill() + ", Boyut: " + size.resize());
    }
}

// Dergi sınıfı
class Magazine implements Cover {
    private Color color;
    private Size size;

    public Magazine(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void createCover() {
        System.out.println("Dergi Kapak Oluşturuldu - Renk: " + color.fill() + ", Boyut: " + size.resize());
    }
}

