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
