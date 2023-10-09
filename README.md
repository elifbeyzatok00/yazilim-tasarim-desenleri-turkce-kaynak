# yazilim-tasarim-desenleri-turkce-kaynak

## OOP

### Nedir?

Nesne yönelimli programlama paradigması, gerçek hayatta olan varlıkları yazılım dünyasında modellemekte kullandığımız, her işlevin nesneler olarak soyutlandığı bir programlama yaklaşımıdır. Tıpkı gerçek hayatta olduğu gibi yazılımda da bu sayede nesnelerimizin öznitelikleri, davranışları olacaktır.
Ortaya çıkış nedenlerinden bazıları da yazılımda; karmaşıklığı azaltmaya, bakım maliyetini düşürmeye, modülariteyi artırmaya, nesneler arası hiyerarşiyi kurmaya yaramasıdır.

## Nesne

### Nedir?

![Alt text](image.png)
Yukarıda Developer adında bir sınıf görülmektedir. Sınıf alanlar (fields) ve davranışlarımızın (methods) tanımlandığı yerdir. Nesne ise bu sınıftan bir örnek alınmış halidir.

### Nesne Yönelimli Programlama İlkeleri

Nesne yönelimli programlama 4 temel ilke üzerine kuruludur ve bir dilin, nesne yönelimli programlamayı uyguluyor denebilmesi için 4 koşulu da sağlıyor olması gerekiyor. Bunlar; Encapsulation, Abstraction, Inheritance, Polymorphism
![Alt text](image-1.png)

## Sınıf

### Nedir?

Yukarıdaki örnekte bir adet sınıf kullanıldı ama gerçek uygulamalarda bildiğimiz gibi bir sınıftan daha fazlası mevcut. Bunlar arasında bir hiyerarşi, düzen mevcut. Tıpkı gerçek hayatta olduğu gibi.
Hiyerarşi düzeninde; genel, kapsayıcı sınıfa superclass (üst sınıf). Bunlardan türeyen sınıflara da subclasses (alt sınıflar) denir. Bu hiyerarşi ile birlikte alt sınıflar, üst sınıfların özelliklerini ve davranışlarını almaktadır.

Örnek Kod C#

```cs
using System;

class Ogrenci
{
public string Adi;
public int Yas;

    public void BilgileriGoster()
    {
        Console.WriteLine("Adı: " + Adi);
        Console.WriteLine("Yaşı: " + Yas);
    }

}

class Program
{
static void Main()
{
Ogrenci ogrenci = new Ogrenci();
ogrenci.Adi = "Ahmet";
ogrenci.Yas = 20;

        ogrenci.BilgileriGoster();

        Console.ReadLine();
    }

}
```

Örnek Kod Java

```java
class Ogrenci {
    String adi;
    int yas;

    void bilgileriGoster() {
        System.out.println("Adı: " + adi);
        System.out.println("Yaşı: " + yas);
    }
}

public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.adi = "Ahmet";
        ogrenci.yas = 20;

        ogrenci.bilgileriGoster();
    }
}

```

Örnek Kod Python

```python
class Ogrenci:
    def __init__(self, adi, yas):
        self.adi = adi
        self.yas = yas

    def bilgileri_goster(self):
        print("Adı:", self.adi)
        print("Yaşı:", self.yas)

ogrenci = Ogrenci("Ahmet", 20)
ogrenci.bilgileri_goster()

```

Bu örneklerde, "Ogrenci" adında bir sınıf oluşturuldu. Bu sınıf içinde "Adi" ve "Yas" adında iki özellik (property) bulunuyor. C# ve Java örneklerinde bu özelliklere doğrudan erişim sağlanabiliyor. Python örneğinde ise "init" metodunu kullanarak sınıfın yapıcı metodunu tanımlayıp, özelliklere erişim sağlanıyor. Ayrıca, her üç dilde de "bilgileriGoster" veya "bilgileri_goster" adında bir metod ile sınıfın özelliklerini ekrana yazdırmak için bir fonksiyon oluşturuldu.

## Encapsulation (Kapsülleme)

### Nedir?

Gereksiz detayların kullanıcıdan gizlenmesidir.

Herhangi bir nesnenin metotlarını, verilerini veya değişkenlerini diğer nesnelerden saklayarak ve bunlara erişimini sınırlandırarak yanlış kullanımlardan koruyan bir konsepttir. Bir nesne üzerinde hem veri soyutlama hem de kontrol soyutlaması yapılıyor ise buna sarma adı verilir. Çoğu programlama dilleri kapsüllemeyi aşağıda sıraladığımız erişim belirteçleri ile desteklerler.

public: Erişimin her yerden yapılabileceği anlamı taşıyor.

private: Erişimin tanımlandığı sınıf içerisinden yapılabileceği anlamı taşıyor.

protected: Sadece tanımlandığı sınıfın içinden veya o sınıftan türetilmiş diğer sınıfların içinden erişilebilir.

Örnek Kod C#

```cs
using System;

class Kisi
{
    private string ad;
    private int yas;

    public void SetAd(string yeniAd)
    {
        ad = yeniAd;
    }

    public string GetAd()
    {
        return ad;
    }

    public void SetYas(int yeniYas)
    {
        if (yeniYas >= 0)
        {
            yas = yeniYas;
        }
        else
        {
            Console.WriteLine("Hatalı yaş değeri.");
        }
    }

    public int GetYas()
    {
        return yas;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Kisi kisi = new Kisi();
        kisi.SetAd("Ahmet");
        kisi.SetYas(30);

        Console.WriteLine("Ad: " + kisi.GetAd());
        Console.WriteLine("Yaş: " + kisi.GetYas());
    }
}

```

Örnek Kod Java

```java
public class Kisi {
    private String ad;
    private int yas;

    public void setAd(String yeniAd) {
        ad = yeniAd;
    }

    public String getAd() {
        return ad;
    }

    public void setYas(int yeniYas) {
        if (yeniYas >= 0) {
            yas = yeniYas;
        } else {
            System.out.println("Hatalı yaş değeri.");
        }
    }

    public int getYas() {
        return yas;
    }
}

public class Main {
    public static void main(String[] args) {
        Kisi kisi = new Kisi();
        kisi.setAd("Ayşe");
        kisi.setYas(25);

        System.out.println("Ad: " + kisi.getAd());
        System.out.println("Yaş: " + kisi.getYas());
    }
}

```

Örnek Kod Python

```python
class Kisi:
    def __init__(self):
        self.__ad = ""
        self.__yas = 0

    def set_ad(self, yeni_ad):
        self.__ad = yeni_ad

    def get_ad(self):
        return self.__ad

    def set_yas(self, yeni_yas):
        if yeni_yas >= 0:
            self.__yas = yeni_yas
        else:
            print("Hatalı yaş değeri.")

    def get_yas(self):
        return self.__yas

kisi = Kisi()
kisi.set_ad("Mehmet")
kisi.set_yas(35)

print("Ad: " + kisi.get_ad())
print("Yaş: " + str(kisi.get_yas()))

```

Bu örneklerde, Kisi sınıfı içinde ad ve yas adında private (private C#, Java; private ve başına çift alt çizgi eklenerek private yapılır - Python) değişkenler kullanılarak encapsulation uygulanmıştır. Bu değişkenlere erişim için set ve get metotları kullanılmıştır. Bu şekilde, değişkenlere doğrudan erişim yerine metodlar aracılığıyla erişim sağlanmış olur ve veri gizliliği ve güvenliği artırılmış olur.

## Inheritance (Kalıtım)

### Nedir?

Bir sınıftan başka sınıfların türetilmesidir.

Kalıtım, mevcut sınıfların üzerine yeni sınıflar oluşturma yeteneğidir. Bu sayede türetilen sınıf, türediği sınıfın özelliklerini devralır. Kalıtımın en büyük yararı kodun yeniden kullanılmasıdır. Mevcut sınıftan biraz farklı bir sınıf oluşturmak istiyorsak, kodu kopyalamamıza gerek yoktur. Bunun yerine, varolan sınıfı genişletir ve ekstra işlevselliği alt sınıfa koyarız.  
![Alt text](image-2.png)
Çoğu programlama dilinde yalnızca bir sınıftan türetme işlemi gerçekleştirilmektedir ama birden fazla interface'den (ara birimden) türetilme işlemi de gerçekleştirilebilmektedir.

Örnek Kod C#

```cs
using System;

class Person
{
    protected string ad;
    protected int yas;

    public void BilgileriGoster()
    {
        Console.WriteLine("Ad: " + ad);
        Console.WriteLine("Yaş: " + yas);
    }
}

class Ogrenci : Person
{
    private int ogrenciNo;

    public Ogrenci(string ad, int yas, int ogrenciNo)
    {
        this.ad = ad;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
    }

    public void OgrenciBilgileriGoster()
    {
        BilgileriGoster();
        Console.WriteLine("Öğrenci No: " + ogrenciNo);
    }
}

class Program
{
    static void Main(string[] args)
    {
        Ogrenci ogrenci = new Ogrenci("Ayşe", 20, 12345);
        ogrenci.OgrenciBilgileriGoster();
    }
}

```

Örnek Kod Java

```java
class Person {
    protected String ad;
    protected int yas;

    public void bilgileriGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
    }
}

class Ogrenci extends Person {
    private int ogrenciNo;

    public Ogrenci(String ad, int yas, int ogrenciNo) {
        this.ad = ad;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
    }

    public void ogrenciBilgileriGoster() {
        bilgileriGoster();
        System.out.println("Öğrenci No: " + ogrenciNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Mehmet", 22, 67890);
        ogrenci.ogrenciBilgileriGoster();
    }
}

```

Örnek Kod Python

```python
class Person:
    def __init__(self, ad, yas):
        self.ad = ad
        self.yas = yas

    def bilgileri_goster(self):
        print("Ad:", self.ad)
        print("Yaş:", self.yas)

class Ogrenci(Person):
    def __init__(self, ad, yas, ogrenci_no):
        super().__init__(ad, yas)
        self.ogrenci_no = ogrenci_no

    def ogrenci_bilgileri_goster(self):
        self.bilgileri_goster()
        print("Öğrenci No:", self.ogrenci_no)

ogrenci = Ogrenci("Ali", 21, 54321)
ogrenci.ogrenci_bilgileri_goster()

```

Bu örneklerde, Person sınıfı bir kişinin adını ve yaşını temsil ederken, Ogrenci sınıfı Person sınıfından kalıtım alarak öğrenci numarasını ekler. Böylece Ogrenci sınıfı, Person sınıfının özelliklerini ve metotlarını miras alır ve aynı zamanda kendi özel özelliklerini (öğrenci numarası) ve metotlarını da ekleyebilir. Bu, kalıtımın temel mantığıdır.

## Polymorphism (Çok biçimlilik)

### Nedir?

- Nesnelerin türüne bakılmaksızın koşturulmasıdır.
- Robot koş, kuş koş, at koş gibi

Bir nesnenin başka bir nesne gibi davranabilmesi, kullanılabilmesi. Biraz daha açık bir ifade ile: alt sınıfların, üst sınıflara ait olan davranışlarını başka bir biçimde gerçekleştiriyor olması olayıdır.

![Alt text](image-3.png)

Nesnenin davranışı çalışma anında belirlendiği için, çok biçimlilik özelliği sayesinde nesnelerin türünü önceden bilmek zorunda kalmayız.

Örnek Kod C#

```cs
using System;

class Sekil
{
    public virtual void Ciz()
    {
        Console.WriteLine("Bir şekil çizildi.");
    }
}

class Dikdortgen : Sekil
{
    public override void Ciz()
    {
        Console.WriteLine("Dikdörtgen çizildi.");
    }
}

class Ucgen : Sekil
{
    public override void Ciz()
    {
        Console.WriteLine("Üçgen çizildi.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        Sekil sekil = new Sekil();
        sekil.Ciz();

        Sekil dikdortgen = new Dikdortgen();
        dikdortgen.Ciz();

        Sekil ucgen = new Ucgen();
        ucgen.Ciz();
    }
}

```

Örnek Kod Java

```java
class Sekil {
    public void ciz() {
        System.out.println("Bir şekil çizildi.");
    }
}

class Dikdortgen extends Sekil {
    public void ciz() {
        System.out.println("Dikdörtgen çizildi.");
    }
}

class Ucgen extends Sekil {
    public void ciz() {
        System.out.println("Üçgen çizildi.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sekil sekil = new Sekil();
        sekil.ciz();

        Sekil dikdortgen = new Dikdortgen();
        dikdortgen.ciz();

        Sekil ucgen = new Ucgen();
        ucgen.ciz();
    }
}

```

Örnek Kod Python

```python
class Sekil:
    def ciz(self):
        print("Bir şekil çizildi.")

class Dikdortgen(Sekil):
    def ciz(self):
        print("Dikdörtgen çizildi.")

class Ucgen(Sekil):
    def ciz(self):
        print("Üçgen çizildi.")

sekil = Sekil()
sekil.ciz()

dikdortgen = Dikdortgen()
dikdortgen.ciz()

ucgen = Ucgen()
ucgen.ciz()

```

Bu örneklerde, Sekil sınıfı bir şekli temsil ederken, Dikdortgen ve Ucgen sınıfları Sekil sınıfından kalıtım alarak kendi ciz metotlarını (metod override) uygularlar. Bu durumda, Sekil türündeki bir nesneyle Dikdortgen veya Ucgen nesnesi aynı metodu çağırabilir ve farklı davranışlar sergileyebilir. Bu, polimorfizmin temel özelliğidir.

## Abstraction (Soyutlama)

### Nedir?

- Ortak özellikteki nesnelerin aynı çatıda toplanmasıdır.
- **Interface** ve **abstract class**'lar aracılığıyla sağlanır.

Farklı kod parçalarının kompleks kısımlarını, sahip oldukları ortak davranışlar, amaçlar, karakteristik özellikler arkasında saklamak sayesinde daha anlaşılır ve kolay kullanılabilir kod yazmaktır abstraction.
Örnek Kod C#

```cs
using System;

abstract class Sekil
{
    public abstract void Ciz();
}

class Dikdortgen : Sekil
{
    public override void Ciz()
    {
        Console.WriteLine("Dikdörtgen çizildi.");
    }
}

class Ucgen : Sekil
{
    public override void Ciz()
    {
        Console.WriteLine("Üçgen çizildi.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        Sekil dikdortgen = new Dikdortgen();
        dikdortgen.Ciz();

        Sekil ucgen = new Ucgen();
        ucgen.Ciz();
    }
}

```

Örnek Kod Java

```java
abstract class Sekil {
    public abstract void ciz();
}

class Dikdortgen extends Sekil {
    public void ciz() {
        System.out.println("Dikdörtgen çizildi.");
    }
}

class Ucgen extends Sekil {
    public void ciz() {
        System.out.println("Üçgen çizildi.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sekil dikdortgen = new Dikdortgen();
        dikdortgen.ciz();

        Sekil ucgen = new Ucgen();
        ucgen.ciz();
    }
}

```

Örnek Kod Python

```python
from abc import ABC, abstractmethod

class Sekil(ABC):
    @abstractmethod
    def ciz(self):
        pass

class Dikdortgen(Sekil):
    def ciz(self):
        print("Dikdörtgen çizildi.")

class Ucgen(Sekil):
    def ciz(self):
        print("Üçgen çizildi.")

dikdortgen = Dikdortgen()
dikdortgen.ciz()

ucgen = Ucgen()
ucgen.ciz()

```

Bu örneklerde, Sekil soyut sınıf (abstract class) olarak tanımlanmıştır. Soyut sınıflar soyut metotlar (abstract methods) içerebilir. Soyut metotlar sadece imza (signature) olarak tanımlanır, yani metotun gövdesi soyut sınıf içinde yer almaz. Soyut metotları olan bir sınıf, bu metotları miras alan alt sınıflar tarafından zorunlu olarak implemente edilmelidir. Bu, soyutlamayı (abstraction) sağlayan bir özelliktir.

## UML 5+1 Diyagramı

### Nedir?

## Çevik Yazılım Geliştirme Süreci (Agile Scrum)
