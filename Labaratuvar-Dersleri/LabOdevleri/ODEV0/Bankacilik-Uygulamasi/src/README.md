# Task

![Alt text](lab4_task.jpg)

# Odev

> Kullanici classında tek sınıf altında yazılan Kullanıcı, Ozel, Standart classlarını 3 farklı sınıfa çevirelim

> [!IMPORTANT]
> Bu ödev classroom a yüklenmedi. Fakat [Lab4](https://github.com/elifbeyzatok00/yazilim-tasarim-desenleri-turkce-kaynak/tree/main/Labaratuvar-Dersleri/Lab4/Bankacilik-Uygulamasi/src)'te verilmişti.

## Diyagram Çizelim

Use case diyagramında genellikle sistemdeki aktörleri ve bu aktörlerin gerçekleştirebileceği temel işlevselliği gösteren oval şekiller ve bu durumları birbirine bağlayan oklar bulunur. Ancak, bu örnekte aktör sayısı sınırlı olduğu ve karmaşıklığı az olduğu için basit bir use case diyagramı çizebiliriz.

### Use Case Diyagramı:

```
+---------------------+
|      Kullanıcı      |
+---------------------+
        |
        | <>----(1)------(2)----->
        |
+---------------------+
|      Standart       |
|---------------------|
| + bakiyeGöster()    |
+---------------------+
        |
        | <>----(3)------(4)----->
        |
+---------------------+
|        Özel         |
|---------------------|
| + bakiyeGöster()    |
+---------------------+
        |
        |      (5)------(6)
        |
+---------------------+
|      Transfer       |
|---------------------|
| + havale()          |
| + eft()             |
| + swift()           |
+---------------------+
```

Bu use case diyagramında:

1. Kullanıcı aktörü, sistemdeki temel işlevselliklere erişebilir.
2. Standart kullanıcı, bakiye gösterme işlemini gerçekleştirebilir.
3. Standart kullanıcı, EFT işlemini gerçekleştirebilir.
4. Standart kullanıcı, Swift işlemini gerçekleştirebilir.
5. Özel kullanıcı, bakiye gösterme işlemini gerçekleştirebilir.
6. Özel kullanıcı, Swift işlemini gerçekleştirebilir.

Oklar, kullanıcı ve sistem arasındaki etkileşimi gösterir. Bu diyagram, sistemin temel kullanım durumlarını ve bu durumlar arasındaki ilişkileri basit bir şekilde ifade eder.

Önce sınıfları ve arayüzleri analiz ederek bir class diagram (sınıf diyagramı) tasarlayalım. Bu sınıf diyagramında, her bir sınıfın özellikleri, metotları ve aralarındaki ilişkiler gösterilecektir.

### Class Diagram (Sınıf Diyagramı):

```
+---------------------+        +---------------------+
|      Kullanici      |        |       Doviz         |
|---------------------|        |---------------------|
| - isim: String      |        | + KUR: double       |
| - kimlik: String    |        +---------------------+
| - tlBakiye: double  |
|---------------------|
| + Kullanici(isim:  |
|   String, kimlik:   |
|   String, tlBakiye: |
|   double)           |
| + getIsim(): String |
| + setIsim(isim:     |
|   String): void     |
| + getKimlik():      |
|   String            |
| + setKimlik(kimlik: |
|   String): void     |
| + getTlBakiye():    |
|   double            |
| + setTlBakiye(tlBakiye: |
|   double): void         |
| + abstract          |
|   bakiyeGoster(miktar: |
|   double): double      |
+---------------------+        +---------------------+
         |                                |
         |                                |
         V                                V
+---------------------+        +---------------------+
|      Standart       |        |        Ozel         |
|---------------------|        |---------------------|
| + ORAN: int          |        | + TL_MALIYET: double|
|                     |        | + DOVIZ_MALIYET: double|
| + Standart(isim:    |        | - dovizBakiye: double|
|   String, kimlik:   |        |---------------------|
|   String, tlBakiye: |        | + Ozel(isim: String, |
|   double)           |        |   kimlik: String,     |
| + bakiyeGoster(miktar: |    |   tlBakiye: double,   |
|   double): double   |        |   dovizBakiye: double)|
+---------------------+        | + getDovizBakiye():  |
                               |   double              |
                               | + setDovizBakiye(     |
                               |   dovizBakiye: double)|
                               | + bakiyeGoster(miktar:|
                               |   double): double    |
                               +---------------------+
                                        |
                                        |
                                        V
+---------------------+
|      Transfer       |
|---------------------|
| + havale(gonderici:  |
|   Kullanici, alici:  |
|   Kullanici, miktar: |
|   double): void      |
| + eft(gonderici:     |
|   Kullanici, alici:  |
|   Kullanici, miktar: |
|   double): void      |
| + swift(Ozel         |
|   gonderici: Ozel,   |
|   alici: Ozel,        |
|   miktar: double): void|
+---------------------+
```

Bu sınıf diyagramında, `Kullanici` sınıfından türetilen `Standart` ve `Ozel` sınıfları yer almaktadır. Ayrıca, `Transfer` sınıfı da bulunmaktadır. İlgili metotlar ve özellikler sınıflar arasında doğru bir şekilde tanımlanmıştır.
