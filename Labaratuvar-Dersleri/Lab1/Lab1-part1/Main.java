public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.sayi1 = 2 + t1.sayi1;  // t1.sayi1 = 2 + 1 = 3
        t1.sayi2= 3 + t1.sayi2;   //t1.sayi2 = 3 + 2 = 5

        t2.sayi1 = 3 + t2.sayi1;  //t2.sayi1 = 3 + 3 = 6  -> sayi1 static olduğu için t1.sayi1 ve t2.sayi1 aynı değeri alıyor.
        t2.sayi2 = 4 + t2.sayi2;  //t2.sayi2 = 4 + 2 = 6

        System.out.println(t1.sayi1); //6
        System.out.println(t1.sayi2); //5
        System.out.println(t2.sayi1); //6
        System.out.println(t2.sayi2); //6

        //static bellekte tuttuğu yer hep aynı olduğu için t1.sayi1 ve t2.sayi1 aynı değeri alıyor.
        //t1.sayi2 ve t2.sayi2 ise farklı değerler alıyor çünkü static olmayan değişkenler her nesne için ayrı ayrı tutuluyor.

    }
}