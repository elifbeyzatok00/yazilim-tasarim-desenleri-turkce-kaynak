**Soyutlama yapabilmek için nesneye yönelik programlamada iki yöntem mevcuttur; interface ve abstract.** Soyutlama kavram olarak sınıfın içindeki işleyişini dışarıya kapamaktır. Örneğin, atmde işlem yaparken kullanıcıların atmnin işleyişinden bilgisi olmaz.

**Burada interface kullanarak `soyutlama` yaptık.**

### `Sekil.java`

İlk olarak kare, üçgen ve dikdörtgen için birer sınıf oluşturduk.
Her şekil için kendi sınıfı içinde constructor, get-set metodlarını tanımladık.

Sekil adında interface oluşturduk.
Bu interface içinde AlanHesapla() metodunu oluşturduk.
Daha sonra AlanHesapla() metodunu kullanarak bir sınıf oluşturduk.
Bu sınıfın içinde de Yazdir() metodunu oluşturduk.
Bu metod parametre olarak aldığı şeklin alanını hesaplar ve yazdırır.

**Daha sonra kare, üçgen ve dikdörtgen sınıflarının her birine Sekil interface ini `implements` ettik**
**Ve her sınıfın içinde Sekil interface inden oluşturduğumuz AlanHesapla() metodunu çağırdık.**
Her şekil için alan hesaplama kodlarını burada yazdık.

**Bu interfaceten oluşturduğumuz metodlar ve sınıflar soyut olur.
Soyut sınıflar diğer kodlarla (somut kodlarla) ilgilenmez. Onların ne olduğunu bilmez. Onlardan bağımsız tanımlamalar yapmamızı sağlar.**

> - kod tekrarını azaltır.
> - kullanım kolaylığı sağlar
> - kodları geliştirebilmemizi sağlar. Kodlara esneklik sağlar.
> - örneğin soyutlama kullanmasaydık AlanHesaplaKare(), AlanHesaplaUcgen() şeklinde her şekil için alan hesaplama fonksiyonu yazardık. ve her şekil eklendiğinde AlanHesaplaX() şeklinde yeni metod tanımlayacaktık ve kodlarımız hiçbir zaman tamamlanmış olmayacaktı. Ama soyutlma kullanarak bir bütünlük sağlamış olduk.
>   class AlanHesapla() adlı tek bir metod yazdık ve bu kod parçasını her yerde çağırdık.

### `Main.java`

ilk olarak kare, üçgen ve dikdörtgen için Kare, Ucgen ve Dikdortgen sınıflarından birer nesne oluşturduk. Bu nesnelere ilgili parametreler atadık.(kenar uzunluğu vb.)

**AlanHesapla sınıfından alanHesapla adlı nesne ürettik.**

AlanHesapla metodu içinde tanımlanan Yazdir() metodunu kullanıp parametre olarak yukarıda tanımladığımız kare, üçgen ve dikdörtgen nesnelerini verdik.

> Böylelikle pratik bir şekilde her şekil için alan hesaplattık. Ve yeni şekiller eklendiğinde de gelişmeye açık, esnek bir kod elde ettik.

## Diyagram yapalım

Metin tabanlı bir platformda görsel diyagramları çıkarmak zor olduğu için şablonları anlatımlarla sunabilirim.

**Class Diagram (Sınıf Diyagramı):**

```
+---------------------+      +-----------------------+        +------------------------+
|        Sekil        |      |    AlanHesapla        |        |         Main           |
|---------------------|      |-----------------------|        |------------------------|
| + AlanHesapla()     |      | + Yazdir(Sekil)       |        | + main(String[])        |
+---------------------+      +-----------------------+        +------------------------+
        ^                                ^
        |                                |
        |                                |
+-------+---------+          +-----------+------------+          +---------------------+
|       Kare       |          |         Ucgen          |          |     Dikdortgen      |
|------------------|          |-----------------------|          |---------------------|
| - kenar: int      |          | - kenar: int           |          | - uzunKenar: int     |
|------------------|          | - yukseklik: int       |          | - kisaKenar: int     |
| + AlanHesapla()   |          | + AlanHesapla()        |          | + AlanHesapla()      |
+------------------+          +-----------------------+          +---------------------+
```

**Use Case Diagram (Kullanım Durumu Diyagramı):**

```
+---------------------+
|       Kullanıcı     |
|---------------------|
| + AlanHesapla()     |
+---------------------+
         |
         |
+---------------------+
|      AlanHesapla     |
|---------------------|
| + Yazdir(Sekil)     |
+---------------------+
         |
         |
+---------------------+
|        Main         |
|---------------------|
| + main(String[])    |
+---------------------+
```

Bu şablonlar, `Sekil` arayüzünü ve onu uygulayan `Kare`, `Ucgen`, `Dikdortgen` sınıflarını gösterir. `AlanHesapla` sınıfı ise `Sekil` nesnelerini alarak `Yazdir` metodunu içerir. `Main` sınıfı ise örnek nesneler oluşturarak `AlanHesapla` sınıfını kullanır.

Bu şablonları kullanarak kodunuzu daha iyi anlayabilir ve geliştirebilirsiniz.
