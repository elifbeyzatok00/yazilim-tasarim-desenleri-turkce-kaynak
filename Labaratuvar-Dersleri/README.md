## Laboratuvar Derslerinde Aldığım Notlar

**Sınıf:** şablonlardır
Nesne: sınıflardan oluşur

Sınıf tipleri
1-interface: tamamen soyut özellikleri, metotları barındırır
2-class: tamamen  somut 
3-abstract: soyut+somut (abstract  class olması için en az 1 tane soyut sınıf olmalı)

Soyut somutlar neden var, temel sebebi?
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

Erişim belirteçleri
3 tane temel var.
Public: Aynı proje içerisinde erişilebilir
Private: Aynı sınıf içerisinde erişilebilir
Protected: Aynı sınıf, miras alan (o sınıftan türetilen) sınıflar ve aynı paket(klasör) içerisinden erişilebilir. Farklı bir paketten erişilecekse türetilmiş olması gerekiyor.
(ek bilgi  internal vb. belirteçler microsft dillerinde)

Soyut -çoklu kalıtım kullanımı var
Somut- yok

?-kalıtım ile değişkenlere ve metodlara erişilmesi
Kapsülleme-get ve set ile değişkenlere erişilmesi
Soyutlama – üst sınıfları soyut şekilde tanımlamamızı sağlıyor. Benzer veya aynı işleri, fonksiyonları farklı şekilde uyguluyorsa soyutlama yapıyordul
Çok biçimlilik – aynı fonksiyonu farklı sayıda/ farklı tipte parametrelerle kullanmak.
Sınıfların birbiri gibi davranabilmesi.
Fonksiyon düzeyinde, sınıf düzeyinde çok biçimlilik vardır

Referans neyi çağırıp çağıramayacağımı belirler

Dump casting
alt sınıflar üst sınıflar gibi davranabilir

get-set metodları – okuma yazma işlemlerini yaptırır

constructor içinde değil set get içinde sınır, koşul tanımlamalıyız. 


Hata Kodlarına 
