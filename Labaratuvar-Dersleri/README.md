# Laboratuvar Derslerinde Aldığım Notlar

**Sınıf:** şablonlardır
**Nesne:** sınıflardan oluşur

### Sınıf tipleri

1-interface: tamamen soyut özellikleri, metotları barındırır
2-class: tamamen somut
3-abstract: soyut+somut (abstract class olması için en az 1 tane soyut sınıf olmalı)

### Soyut somut sınıflar neden var, temel sebebi?

Aynı işleyişi alt sınıflarda farklı kullanmak için.
Tüm sınıflarda mevcut fakat farklı şekilde kullanılıyorsa bu soyut sınıf oluyor.

`Interface Örneği | Java`

```java
// Bir arabayı temsil eden Interface
interface Araba {
    void calis();
    void dur();
}

// Araba Interface'ini uygulayan bir sınıf
class Otomobil implements Araba {
    public void calis() {
        System.out.println("Otomobil çalışıyor.");
    }
    public void dur() {
        System.out.println("Otomobil durdu.");
    }
}
```

> Burada, `Araba` interface'i bir arabayı temsil eden metotları içerir. `Otomobil` sınıfı bu interface'i implement eder.

`Class Örneği | Java`

```java
// Hayvan sınıfı
class Hayvan {
    String isim;
    int yas;

    public void bilgileriYazdir() {
        System.out.println("İsim: " + isim + ", Yaş: " + yas);
    }
}

// Hayvan sınıfını miras alan bir alt sınıf
class Kedi extends Hayvan {
    public Kedi(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }
}
```

> `Hayvan` class'ı somut bir class'tır ve `Kedi` sınıfı bu class'ı miras alır.

`Abstract Örneği | Java`

```java
// Soyut bir sınıf
abstract class Sekil {
    abstract void alanHesapla();
}

// Soyut sınıfı genişleten somut bir sınıf
class Dikdortgen extends Sekil {
    int uzunluk;
    int genislik;

    public Dikdortgen(int uzunluk, int genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    void alanHesapla() {
        int alan = uzunluk * genislik;
        System.out.println("Dikdörtgenin Alanı: " + alan);
    }
}
```

> `Sekil` abstract class'ı soyut bir metodu içerir. `Dikdortgen` sınıfı, bu abstract sınıfı genişletir ve soyut metodu implement eder.

### Erişim belirteçleri

3 tane temel var.
**Public:** Aynı proje içerisinde erişilebilir
**Private:** Aynı sınıf içerisinde erişilebilir
**Protected:** Aynı sınıf, miras alan (o sınıftan türetilen) sınıflar ve aynı paket(klasör) içerisinden erişilebilir. Farklı bir paketten erişilecekse türetilmiş olması gerekiyor.
(ek bilgi: internal vb. belirteçler microsft dillerinde)

**Soyut** -çoklu kalıtım kullanımı var
**Somut**- yok

**inheritance**-kalıtım ile değişkenlere ve metodlara erişilmesi
**Kapsülleme**-get ve set ile değişkenlere erişilmesi
**Soyutlama** – üst sınıfları soyut şekilde tanımlamamızı sağlıyor. Benzer veya aynı işleri, fonksiyonları farklı şekilde uyguluyorsa soyutlama yapıyorduk.
**Çok biçimlilik** – aynı fonksiyonu farklı sayıda/ farklı tipte parametrelerle kullanmak.
Sınıfların birbiri gibi davranabilmesi.
Fonksiyon düzeyinde, sınıf düzeyinde çok biçimlilik vardır.

**Referans** neyi çağırıp çağıramayacağımı belirler

**Down casting**- nesnenin referansını değiştirme işlemi.
Bu sayede alt sınıflar üst sınıflar gibi davranabilir

**get-set metodları **– okuma yazma işlemlerini yaptırır

> constructor içinde değil set get içinde sınır, koşul tanımlamalıyız.

### **`Inheritance(Miras Alma) Örneği | Java`**

> Java'da kalıtım ile bir sınıfın değişkenlerine ve metotlarına erişilmesine "miras alma" denir (inheritance). Miras alma, bir sınıfın özelliklerini (değişkenler ve metotlar) başka bir sınıfa aktarmak için kullanılır.
>
> Bir sınıfın başka bir sınıftan miras alabilmesi için **extends** anahtar kelimesi kullanılır. **Miras alınan sınıf, superclass (üst sınıf)** olarak adlandırılırken, **miras alan sınıf ise subclass (alt sınıf)** olarak adlandırılır.

Örneğin, aşağıdaki örnekte Araba sınıfı Renault sınıfına miras vermektedir. Bu durumda Renault sınıfı, Araba sınıfının değişkenlerine ve metotlarına erişebilir.

`Örnek Kod Java`

```java
// Üst sınıf (Superclass)
class Araba {
    String marka;

    void calis() {
        System.out.println("Araba çalışıyor.");
    }
}

// Alt sınıf (Subclass)
class Renault extends Araba {
    void ozellikleriGoster() {
        System.out.println("Marka: " + marka);
    }
}

public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault();
        renault.marka = "Renault";
        renault.calis(); // Araba çalışıyor.
        renault.ozellikleriGoster(); // Marka: Renault
    }
}
```

Yukarıdaki örnekte, Renault sınıfı, Araba sınıfının marka değişkenine ve calis() metotuna erişebiliyor. Bu, kalıtım sayesinde sağlanır ve nesne yönelimli programlamada önemli bir kavramdır.

`Örnek Kod C#`

```cs
using System;

// Üst sınıf (Superclass)
class Araba {
    public string Marka { get; set; }

    public void Calis() {
        Console.WriteLine("Araba çalışıyor.");
    }
}

// Alt sınıf (Subclass)
class Renault : Araba {
    public void OzellikleriGoster() {
        Console.WriteLine("Marka: " + Marka);
    }
}

class Program {
    static void Main(string[] args) {
        Renault renault = new Renault();
        renault.Marka = "Renault";
        renault.Calis(); // Araba çalışıyor.
        renault.OzellikleriGoster(); // Marka: Renault
    }
}

```

`Örnek Kod Python`

```python
# Üst sınıf (Superclass)
class Araba:
    def __init__(self):
        self.marka = ""

    def calis(self):
        print("Araba çalışıyor.")

# Alt sınıf (Subclass)
class Renault(Araba):
    def ozellikleri_goster(self):
        print("Marka: " + self.marka)

# Ana program
renault = Renault()
renault.marka = "Renault"
renault.calis() # Araba çalışıyor.
renault.ozellikleri_goster() # Marka: Renault

```

### Java'da Karşılaşabileceğiniz Bazı Yaygın Hata Kodları

1. ClassCastException
   Bu hata, bir nesneyi beklenen türde bir nesneye dönüştürmeye çalıştığınızda ortaya çıkar.
   > **Üst sınıfın referansı alt sınıfa atanabilir.** Ama alt sınıflar daha fazla özelliğe sahip bu nedenle üst sınıfın referansı alt sınıfın özelliklerini kullanamaz.
   > Yani **alt sınıfın referansı üst sınıfa atanamaz.**
   > Bu nedenle ClassCastException alırız.

`Örnek Kod Java`

```java
class Sekil { }
class Dikdortgen extends Sekil { }

public class Main {
    public static void main(String[] args) {
        Sekil sekil = new Dikdortgen();
        // Burada Dikdortgen tipindeki nesneyi Sekil tipine dönüştürmeye çalışıyoruz.
        // Dikdortgen, Sekil'in alt sınıfı
        // üst sınıfın referansı alt sınıfa atanabilir. ama alt sınıflar daha fazla özelliğe sahip bu nedenle üst sınıfın referansı alt sınıfın özelliklerini kullanamaz. Yani alt sınıfın referansı üst sınıfa atanamaz.
        // Bu nedenle ClassCastException alırız.
        Dikdortgen dikdortgen = (Dikdortgen) sekil; // Hata: ClassCastException
    }
}

```

2. NullPointerException
   Bu hata, bir nesnenin değeri null iken bu nesneye erişmeye çalıştığınızda ortaya çıkar.

`Örnek Kod Java`

```java
public class Main {
    public static void main(String[] args) {
        String str = null;
        // null değere sahip bir nesneye erişmeye çalışıyoruz, bu yüzden NullPointerException alırız.
        int uzunluk = str.length(); // Hata: NullPointerException
    }
}
```

3. ArrayIndexOutOfBoundsException
   Bu hata, bir dizi içinde geçerli olmayan bir indeksi kullanmaya çalıştığınızda ortaya çıkar.

`Örnek Kod Java`

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        // Dizi sadece 0, 1 ve 2 indislerine sahiptir.
        // 3. indis geçerli değil, bu yüzden ArrayIndexOutOfBoundsException alırız.
        int number = numbers[3]; // Hata: ArrayIndexOutOfBoundsException
    }
}
```

4. ArithmeticException
   Bu hata, matematiksel bir işlem sonucunda geçerli olmayan bir değeri kullanmaya çalıştığınızda ortaya çıkar.

`Örnek Kod Java`

```java
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // Bir sayıyı sıfıra bölmeye çalıştığımızda ArithmeticException alırız.
        int sonuc = a / b; // Hata: ArithmeticException
    }
}

```

Bu hatalar, kodunuzda oluşabilecek yaygın hata senaryolarını temsil eder. Uygulamanızda bu hatalarla başa çıkmak için uygun hata yönetimi (exception handling) tekniklerini kullanmanız önemlidir.

### Hata Yönetimi (Exception Handling) Teknikleri

> Hata yönetimi (exception handling), bir programın çalışma sırasında ortaya çıkan hataları kontrol etmek, işlemek ve programın beklenmeyen durumlarla başa çıkmasını sağlamak için kullanılan bir yazılım tekniktir. Hata yönetimi, programın güvenilirliğini artırır ve uygulamanın düzgün bir şekilde çalışmasını sağlar. Java, C#, Python ve birçok modern programlama dilinde hata yönetimini yönetmek için benzer teknikler kullanılır.

İşte hata yönetimi için kullanılan bazı temel teknikler:

**1. Try-Catch Blokları:**
Try-catch blokları, belirli bir kod bloğunu denemeye (try) alır ve bu blok içinde oluşabilecek hataları ele almak için bir catch bloğu ile eşleştirir. Eğer try bloğu içinde bir hata oluşursa, ilgili catch bloğu çalışır.

`Örnek Kod Java`

```java
try {
    // Riskli kod bloğu
    // ...
} catch (Exception e) {
    // Hata durumunda çalışacak kod
    // ...
}

```

`Örnek Kod C#`

```cs
try {
    // Riskli kod bloğu
    // ...
} catch (Exception ex) {
    // Hata durumunda çalışacak kod
    // ...
}


```

`Örnek Kod Python`

```python
try:
    # Riskli kod bloğu
    # ...
except Exception as e:
    # Hata durumunda çalışacak kod
    # ...

```

**2. Finally Bloğu:**

> Finally bloğu, try-catch bloklarının ardından yer alabilir. Bu blok, try bloğu çalıştırıldığında veya bir hata oluştuğunda çalıştırılacak kodları içerir. Finally bloğu, kodun temizlenmesi, kaynakların serbest bırakılması gibi işlemler için kullanılır.

`Örnek Kod Java`

```java
try {
    // Riskli kod bloğu
    // ...
} catch (Exception e) {
    // Hata durumunda çalışacak kod
    // ...
} finally {
    // Her durumda çalışacak kod
    // ...
}

```

`Örnek Kod C#`

```cs
try:
    # Riskli kod bloğu
    # ...
except Exception as e:
    # Hata durumunda çalışacak kod
    # ...
finally:
    # Her durumda çalışacak kod
    # ...


```

`Örnek Kod Python`

```python
try {
    // Riskli kod bloğu
    // ...
} catch (Exception ex) {
    // Hata durumunda çalışacak kod
    // ...
} finally {
    // Her durumda çalışacak kod
    // ...
}


```

**3. Throw İfadesi:**

> Throw ifadesi, belirli bir durumda bir hata oluşturmak için kullanılır. Bu, programcının özel bir hata durumunu belirtmesine ve bunu programın dışında ele almasına olanak tanır.

`Örnek Kod Java`

```java
if (hataDurumu) {
    throw new Exception("Bir hata oluştu.");
}

```

`Örnek Kod C#`

```cs
if (hataDurumu) {
    throw new Exception("Bir hata oluştu.");
}


```

`Örnek Kod Python`

```python
if hata_durumu:
    raise Exception("Bir hata oluştu.")


```

### `Bağımlılıkları tersine çevirme nedir?`

> **D — DIP (Dependency Inversion Principle)Bağımlılığı tersine çevirme ilkesi** somut sınıflar yerine soyut sınıfların kullanılmasını önermektedir. Çünkü yüksek seviyeli sınıflar düşük seviyeli sınıflara bağımlı olurlarsa yapılacak geliştirmeler ana sınıfı etkileyeceği için birden fazla sınıfta değişiklik gerektirebilir.

### `Yüksek seviyeli sınıf nedir?`

> Yüksek seviye sınıflarda bir davranış değiştiğinde, alt seviye davranışların bu değişime uyum sağlaması gerekir. Ancak, düşük seviye sınıflarda bir davranış değiştiğinde, üst seviye sınıfların davranışında bir bozulma meydana gelmemelidir.

> **Düşük seviyeli sınıflar** projelerde temel işleri gerçekleştirir
> Örn: veri tabanına yazdır, veri alışverişi

> **Üst seviyeli sınıflar** temel işleri yapan düşük seviyeli sınıfları kullanır.

> [!IMPORTANT]
> Yüksek seviyeli sınıf, düşük seviyeli sınıfları kullanmayacak.
> Düşük seviyeli sınfa erişimini sağlayan sınıflar tasarlıycaz. Aracı olarak.
> Yüksek seviyeli sııfın düşük seviyeli sınıfa olan bağımlılığını tersine çevirme yapmış olacağız
