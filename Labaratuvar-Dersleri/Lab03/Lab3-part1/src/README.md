Kullanıcı -> Mail, giriş
Satıcı -> vkn, ürün listele
Müşteri -> tc, ürün görüntüle

//vkn vergi kimlik numarası ile ürün görüntüle
// tc tc kimlik numarası ile ürün görüntüle

## Diyagram Yapalım

Tabii ki, mevcut kodları temel alarak bir şablon şeklinde Use Case (Kullanım Durumu) diyagramı ve Class (Sınıf) diyagramı tasarlayabilirim. Ancak, metin tabanlı bir platformda olduğumuz için görsel bir çizim yapamam. Ancak, basit bir açıklama ile size yardımcı olabilirim.

**Class Diagram (Sınıf Diyagramı):**

```
+---------------------+      +---------------------+      +---------------------+
|      Kullanici      |      |       Satici        |      |       Musteri       |
|---------------------|      |---------------------|      |---------------------|
| - mail: String      |      | - vkn: String        |      | - tc: String         |
|---------------------|      |---------------------|      |---------------------|
| + getMail(): String |      | + getVkn(): String   |      | + getTc(): String    |
| + setMail(String)    |      | + setVkn(String)     |      | + setTc(String)      |
| + giris()            |      | + UrunListele()      |      | + UrunGoruntule()    |
+---------------------+      +---------------------+      +---------------------+
             ^                          ^                           ^
             |                          |                           |
+---------------------+      +---------------------+      +---------------------+
|      Main           |      |       Musteri       |      |       Satici        |
|---------------------|      |---------------------|      |---------------------|
| + main(String[])    |      | - tc: String         |      | - vkn: String        |
+---------------------+      | + getTc(): String    |      | + getVkn(): String   |
                             | + setTc(String)      |      | + setVkn(String)     |
                             | + UrunGoruntule()    |      | + UrunListele()      |
                             +---------------------+      +---------------------+
```

**Use Case Diagram (Kullanım Durumu Diyagramı):**

```
+---------------------+
|      Kullanıcı      |
|---------------------|
| + giris()           |
| + UrunGoruntule()    |
+---------------------+
          |
          |
+---------------------+
|       Satici        |
|---------------------|
| + giris()           |
| + UrunListele()      |
+---------------------+
          |
          |
+---------------------+
|       Musteri       |
|---------------------|
| + UrunGoruntule()    |
+---------------------+
          |
          |
+---------------------+
|        Main         |
|---------------------|
| + main(String[])    |
+---------------------+
```

Bu şablonlar, sınıfları ve aralarındaki ilişkileri gösterir. `Kullanici` sınıfından türetilmiş `Satici` ve `Musteri` sınıfları, ilgili özelliklere ve metotlara sahiptir. `Main` sınıfı, örnek nesneleri oluşturarak bu sınıfları kullanır. Uygulamanın kullanım durumları ise "Giriş Yapma" ve "Ürün Görüntüleme/Listeleme" olarak özetlenebilir.
