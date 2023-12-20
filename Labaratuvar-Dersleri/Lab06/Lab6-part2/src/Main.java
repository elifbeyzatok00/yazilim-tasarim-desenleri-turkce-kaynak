public class Main {
    public static void main(String[] args) throws Exception {
        Mercedes mercedes = new Mercedes();
        mercedes.calistir();
        mercedes.TurboAc();
        System.out.println("Mercedes hızı: "+mercedes.getHiz());

        Ferrari ferrari = new Ferrari();
        ferrari.calistir();
        System.out.println("Ferrari hızı: "+ferrari.getHiz());

        BMW bmw = new BMW();
        bmw.calistir();
        System.out.println("BMW hızı: "+bmw.getHiz());
    }
}
