# Ödev - 1 (Open-Closed)

> Yapılacak uygulamada çevre ve alanları hesaplayan paneller bulunmaktadır. Kullanıcı panel üzerinden çizdiği (istemcide nesne oluşturulacak) şekillerin alan ve çevrelerini hesaplayan uygulamayı geliştiriniz. Paneller birbirine dönüştürülebilir olmalıdır. Şekiller: Çember, Daire, Kare ve Dikdörtgen olarak belirlenmiştir.(Ben ek olarak üçgen için de bir class ekledim)

`Single Responsiblty ve Open Closed anlamak için yaptığımız bir ödev`

- Bir Pano aracılığı ile şekilleri alıyoruz.
- Bu şekillerin çevre ve alanlarını hesaplıyoruz.

## Diyagram Çizelim

### Use Case Diyagramı:

Use case diyagramında genellikle sistemin kullanıcıları ve bu kullanıcıların gerçekleştirebilecekleri temel işlevsellikler gösterilir. Ancak bu örnekte, bir GUI uygulaması veya farklı kullanıcı rolleri olmadığı için basit bir use case diyagramı oluşturmak mümkün değil.

### Class Diyagramı:

Class diyagramında, sınıfları, sınıflar arasındaki ilişkileri ve bu sınıfların özelliklerini gösteren kutular bulunur.

```
+----------------+          +------------------+
|      Main      |          |      Sekil       |
|----------------|          |------------------|
|                |          |                  |
| + main(): void |          |                  |
+----------------+          +------------------+
         |                            |     \
         |                            |      \
         |                            |       \
         V                            V        \
+------------------+        +------------------+\
|       Alan       |        |      Cevre       | \
|------------------|        |------------------|  \
| + alanHesapla(): |        | + cevreHesapla():|   \
|   double         |        |   double         |    \
+------------------+        +------------------+     \
         |                            |                \
         |                            |                 \
         V                            V                  \
+------------------+        +------------------+        \
|       Kare       |        |     Dikdortgen   |         \
|------------------|        |------------------|          \
| - kenar: int      |        | - uzunKenar: int  |           \
| + alanHesapla(): |        | + alanHesapla(): |            \
|   double         |        |   double         |             \
| + cevreHesapla():|        | + cevreHesapla():|              \
|   double         |        |   double         |               \
+------------------+        +------------------+                \
         |                            |                             \
         |                            |                              \
         V                            V                               \
+------------------+        +------------------+                     \
|     Cember       |        |      Daire       |                       \
|------------------|        |------------------|                        \
| - yaricap: double |        | - yaricap: double |                         \
| + alanHesapla(): |        | + alanHesapla(): |                          \
|   double         |        |   double         |                           \
| + cevreHesapla():|        | + cevreHesapla():|                            \
|   double         |        |   double         |                             \
+------------------+        +------------------+                              \
```

Bu diyagramda, temel sınıflar `Sekil`, `Kare`, `Dikdortgen`, `Cember`, ve `Daire` sınıflarını içerir. Alan ve Cevre interfaceleri, bu sınıfların alan ve çevre hesaplamalarını yapmasını sağlar. `AlanPano` ve `CevrePano` sınıfları, bu hesaplamaları liste üzerinde uygular. `Main` sınıfı ise örnek nesneler oluşturup işlemleri gerçekleştirir.

Bu sınıflar arasındaki ilişkiler, implementasyonları ve özellikleri gösterilmiştir.
