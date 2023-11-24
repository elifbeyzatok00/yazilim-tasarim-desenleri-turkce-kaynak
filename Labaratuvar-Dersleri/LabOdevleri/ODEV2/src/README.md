# Odev2

> Aşağıda verilen uygulamayı SOLID prensiplerine göre yeniden tasarlayınız.

> SOLID prensiplerinin uygulanması, kodun daha modüler, esnek ve bakımı daha kolay hale getirilmesini amaçlar, bu nedenle uygulama özelliklerine bağlı olarak daha fazla iyileştirme yapılabilir.
>
> **Single Responsibility Principle (SRP):**
>
> Her sınıfın yalnızca bir sorumluluğu olmalıdır. FonksiyonelYazici arayüzü ve sınıflar zaten tek bir sorumluluğa sahiptir, bu nedenle burada bir değişiklik yapmaya gerek yoktur.
> **Open/Closed Principle (OCP):**
>
> Kodu genişletilebilir hale getirin, ancak değişiklik yapılması gerektiğinde mevcut kodu değiştirmemeye çalışın.
> YaziciProcess sınıfını genişletilebilir hale getirebiliriz. Örneğin, yeni bir yazıcı türü eklediğimizde mevcut kodu değiştirmemize gerek kalmamalıdır.
> **Liskov Substitution Principle (LSP):**
>
> Alt sınıflar, üst sınıfların yerine geçebilmelidir.
> Yazici2 sınıfındaki istisna durumu, alt sınıfların beklenen davranışı değiştirmemesi gereken bir durumdur. Bu nedenle, bu durumu tekrar düşünmek gerekir.
> **Interface Segregation Principle (ISP):**
>
> İstemci, ihtiyaç duymadığı metotlara bağlı olmamalıdır.
> Yazici2 sınıfı, Tara metoduyla ilgili bir istisna fırlatıyor. Bu durumu daha iyi kontrol etmek için FonksiyonelTara adlı yeni bir arayüz ekleyebiliriz.
> **Dependency Inversion Principle (DIP):**
>
> Abstraksiyonlara (yüksek seviyeli modüllere) bağımlılıklar, detaylara (düşük seviyeli modüllere) değil, her ikisi de soyutlamalara (arayüzler veya soyut sınıflar) bağlı olmalıdır.
> YaziciProcess sınıfı, FonksiyonelYazici arayüzüne bağlıdır, bu SOLID prensiplerine uygundur.

##`C#`

```cs
interface FonksiyonelYazici
    {
        void Yazdir();
        void Tara();
    }

    class Yazici1 : FonksiyonelYazici
    {
        public void Yazdir()
        {
            Console.WriteLine("Yazici1 Yazdir");
        }

        public void Tara()
        {
            Console.WriteLine("Yazici1 Tara");
        }
    }

    class Yazici2 : FonksiyonelYazici
    {
        public void Yazdir()
        {
            Console.WriteLine("Yazici2 Yazdir");
        }

        public void Tara()
        {
            throw new Exception("Yazici2 sinifinin tarayici özelligi yoktur.");
        }
    }

    class YaziciProcess
    {
        FonksiyonelYazici FK;
        public YaziciProcess(FonksiyonelYazici yazici)
        {
            FK = yazici;
        }

        public void Yazdir()
        {
            FK.Yazdir();
        }

        public void Tara()
        {
            if (!(FK is Yazici2))
                FK.Tara();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            YaziciProcess p = new YaziciProcess(new Yazici1());
            p.Yazdir();
            p.Tara();

            p = new YaziciProcess(new Yazici2());
            p.Yazdir();
            p.Tara();

            Console.ReadKey();
        }
    }
```

`Ben Kodu Java'ya çevirip onun üzerinde SOLID uygulayacağım`

## `Kodun Java Versiyonu`

```java
interface FonksiyonelYazici {
    void yazdir();
    void tara();
}

class Yazici1 implements FonksiyonelYazici {
    @Override
    public void yazdir() {
        System.out.println("Yazici1 Yazdir");
    }

    @Override
    public void tara() {
        System.out.println("Yazici1 Tara");
    }
}

class Yazici2 implements FonksiyonelYazici {
    @Override
    public void yazdir() {
        System.out.println("Yazici2 Yazdir");
    }

    @Override
    public void tara() {
        throw new RuntimeException("Yazici2 sinifinin tarayici ozelligi yoktur.");
    }
}

class YaziciProcess {
    FonksiyonelYazici fy;

    public YaziciProcess(FonksiyonelYazici yazici) {
        fy = yazici;
    }

    public void yazdir() {
        fy.yazdir();
    }

    public void tara() {
        if (!(fy instanceof Yazici2)) {
            fy.tara();
        }
    }
}

public class Program {
    public static void main(String[] args) {
        YaziciProcess p = new YaziciProcess(new Yazici1());
        p.yazdir();
        p.tara();

        p = new YaziciProcess(new Yazici2());
        p.yazdir();
        try {
            p.tara();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

```
