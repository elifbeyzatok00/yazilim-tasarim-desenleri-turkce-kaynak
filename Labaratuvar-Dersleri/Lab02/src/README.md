# Java'da tür dönüşümü (casting)

> Java'da tür dönüşümü (casting) işlemleri, iki tür arasında gerçekleştirilebilir: genişletme (upcasting) ve daraltma (downcasting). İşte bir örnek:

## 1. Daraltma (Downcasting):

Bu durumda, üst sınıf türünden alt sınıf türüne dönüştürme işlemi yapılır. Ancak, bu işlemi yapabilmek için explicit (açık) bir dönüşüm yapmanız gerekir ve bu durumda instanceof kontrolü kullanmanız önerilir.

`Örnek Kod Java`

```java
class AnaSinif {
    void anaSinifMetodu() {
        System.out.println("Ana sınıf metodu");
    }
}

class AltSinif extends AnaSinif {
    void altSinifMetodu() {
        System.out.println("Alt sınıf metodu");
    }
}

public class Test {
    public static void main(String[] args) {
        // Genişletme (Upcasting)
        AnaSinif anaSinifNesnesi = new AltSinif();

        // Downcasting
        if (anaSinifNesnesi instanceof AltSinif) {
            AltSinif altSinifNesnesi = (AltSinif) anaSinifNesnesi;

            // Alt sınıfa özgü metot çağrılabilir
            altSinifNesnesi.altSinifMetodu();
        }
    }
}

```

## 2. Genişletme (Upcasting):

Bu durumda, alt sınıf türü üst sınıf türüne dönüştürülür. Bu tür dönüşümde herhangi bir explicit (açık) dönüşüm yapmanıza gerek yoktur, Java otomatik olarak bu dönüşümü gerçekleştirir.

`Örnek Kod Java`

```java
class AnaSinif {
    void anaSinifMetodu() {
        System.out.println("Ana sınıf metodu");
    }
}

class AltSinif extends AnaSinif {
    void altSinifMetodu() {
        System.out.println("Alt sınıf metodu");
    }
}

public class Test {
    public static void main(String[] args) {
        // Genişletme (Upcasting)
        AnaSinif anaSinifNesnesi = new AltSinif();

        // Üst sınıf metodu çağrılabilir
        anaSinifNesnesi.anaSinifMetodu();

        // Alt sınıfa özgü metot çağrılamaz
        // anaSinifNesnesi.altSinifMetodu(); // Hata verir
    }
}
```

## Diyagram Çizelim

Metin tabanlı bir platformda şablonlarla çalıştığımız için görsel diyagram çizemem, ancak basit bir açıklama ile size yardımcı olabilirim.

**Class Diagram (Sınıf Diyagramı):**

```
+---------------------+      +---------------------+      +---------------------+
|      Kullanici      |      |       Musteri       |      |        Main         |
|---------------------|      |---------------------|      |---------------------|
| + selam()           |      | + merhaba()         |      | + main(String[])    |
+---------------------+      +---------------------+      +---------------------+
        ^                         ^
        |                         |
+---------------------+      +---------------------+
|        Main         |      |       Kullanici      |
|---------------------|      |---------------------|
| + main(String[])    |      | + selam()           |
+---------------------+      +---------------------+
```

**Use Case Diagram (Kullanım Durumu Diyagramı):**

```
+---------------------+
|      Kullanıcı      |
|---------------------|
| + selam()           |
+---------------------+
          |
          |
+---------------------+
|       Musteri       |
|---------------------|
| + merhaba()         |
+---------------------+
          |
          |
+---------------------+
|        Main         |
|---------------------|
| + main(String[])    |
+---------------------+
```

Bu şablonlar, `Kullanici` sınıfının `selam()` metodunu ve `Musteri` sınıfının buna ek olarak `merhaba()` metodunu içerdiğini gösterir. `Main` sınıfı ise `main()` metodunu içerir. Kullanım durumu diyagramında, "Kullanıcı" sınıfının `selam()` metodunu, "Musteri" sınıfının ise bu metodun yanı sıra `merhaba()` metodunu kullandığını görüyoruz.

Kodlarınızın bu şablona uygun olduğunu görebilirsiniz.
