public class Main {
    public static void main(String[] args) {
        // Builder tasarım deseni ile nesne oluşturma
        ShapeBuilder builder = new ConcreteShapeBuilder();
        ShapeDirector director = new ShapeDirector();
        Shape shape = director.constructShape(builder);

        // Oluşturulan nesneyi kullanma
        System.out.println(shape);
    }
}

/*
 Bu örnekte, Shape sınıfı oluşturulacak şekli temsil eder. 
 ShapeBuilder arayüzü, nesneyi adım adım oluşturmak için gerekli yöntemleri içerir.
 ConcreteShapeBuilder sınıfı, bu arayüzü uygular ve nesneyi adım adım oluşturur. 
 Main sınıfında ise builder tasarım deseninin nasıl kullanılacağına dair bir örnek bulunmaktadır.
 */