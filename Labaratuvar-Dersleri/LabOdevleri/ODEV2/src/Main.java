public class Main {
    public static void main(String[] args) throws Exception {
        YaziciProcess p = new YaziciProcess(new Yazici1(), new Yazici1());
        p.yazdir();
        p.tara();

        p = new YaziciProcess(new Yazici2(), null);
        p.yazdir();
    }
}

/*
 * Sonuc:
 * Bu örnekte, FonksiyonelTara arayüzü eklenmiş ve Yazici2 sınıfı bu arayüzü uygulamamıştır. YaziciProcess sınıfı artık hem yazdırma hem de tarama işlevselliğini desteklemek için iki ayrı arayüz üzerinden çalışmaktadır. Bu, SOLID prensiplerine daha uygun bir tasarım sağlar.
 */