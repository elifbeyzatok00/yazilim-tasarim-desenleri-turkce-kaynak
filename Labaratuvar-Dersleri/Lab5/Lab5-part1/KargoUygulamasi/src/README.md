# Lab6-part1

Kargo Uygulaması

Fatura, Kargo işlemlerini il ve ilçe için ayrı ayrı yapabilen kodları yazdık.

Daha sonra giriş ve ödeme işlemleri yapabilmek için kodlar ekledik.

> Single Responsiblty ve Open Closed anlamak için yaptığımız bir örnek

## Diyagram Çizelim

Tabii ki, işte temel bir taslak:

**Use Case Diagram:**

```
+---------------------+        +------------------------+
|      Kullanıcı      |        |   Ödeme İşlemleri      |
|                     |        |                        |
|   - Giriş yapma     |        |   - Ödeme yapma         |
|   - Bilgileri görüntüle|        +------------------------+
+---------------------+
           |
           |
           v
+----------------------+
|                      |
| Kullanıcı İşlemleri  |
|                      |
|   - getKullanıcı     |
|   - setKullanıcı     |
+----------------------+
          / \
         /   \
        /     \
       v       v
+------------+  +------------+
|   Giriş    |  |   Odeme    |
|İşlemleri   |  |İşlemleri   |
+------------+  +------------+
```

**Class Diagram:**

```
+---------------------+        +------------------------+
|      Kullanici      |        |   OdemeIslemleri       |
|---------------------|        |------------------------|
| - isim: String       |        |                        |
| - mail: String       |        |                        |
| - faturaAdres: Adres |        |                        |
| - kargoAdres: Adres  |        |                        |
|---------------------|        |                        |
| + getIsim(): String  |        |                        |
| + setIsim(String)    |        | + odemeYap()            |
| + getMail(): String  |        |                        |
| + setMail(String)    |        |                        |
| + getFaturaAdres(): Adres |  |                        |
| + setFaturaAdres(Adres)   |  |                        |
| + getKargoAdres(): Adres  |  |                        |
| + setKargoAdres(Adres)    |  |                        |
| + toString(): String      |  +------------------------+
+---------------------+
           |
           |
           v
+----------------------+
|                      |
| KullaniciIslemleri   |
|----------------------|
| - kullanici: Kullanici|
|----------------------|
| + getKullanici(): Kullanici |
| + setKullanici(Kullanici)   |
+----------------------+
          / \
         /   \
        /     \
       v       v
+------------+  +------------+
| GirisIslemleri|  | OdemeIslemleri |
|----------------|-----------------|
|                |                 |
| + girisYap()    | + odemeYap()    |
|                |                 |
+----------------+-----------------+
|                |
v                v
+------------+  +------------+
|   Adres    |  |   App      |
|------------|  |------------|
| - il: String|  | + main()    |
| - ilce: String|  |            |
|------------|  |            |
| + getIl(): String  |        |
| + setIl(String)    |        |
| + getIlce(): String|        |
| + setIlce(String)  |        |
| + toString(): String      |
+-------------------------+
```

Bu tasarım, sınıflar arasındaki temel ilişkileri gösterir. Umarım bu taslaklar, mevcut kodunuzla daha iyi uyum içinde olacak şekilde kullanılabilir.
