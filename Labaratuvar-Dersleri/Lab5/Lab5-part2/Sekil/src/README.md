# Pano

Bir Pano aracılığı ile şekilleri alıyoruz.
Bu şekillerin çevre ve alanlarını hesaplıyoruz.

> Single Responsiblty ve Open Closed anlamak için yaptığımız bir örnek

## Diyagram Çİzelim

Use Case Diagram:

```
+--------------+      +---------------+
|              |      |               |
|    Sekil     |      |    Pano       |
|              |      |               |
+--------------+      +---------------+
                    / |            \
                   /  |             \
                  /   |              \
                 /    |               \
+--------------+   +---------------+    \    +---------------+
|              |   |               |     \   |               |
|    Alan      |<--|    AlanPano   |      \--|   CevrePano  |
|              |   |               |         |               |
+--------------+   +---------------+         +---------------+
| + alanHesapla()| | + hesapla()    |        | + hesapla()    |
+--------------+   +---------------+        +---------------+
                    |                        |
                    v                        v
               +--------------+         +------------------+
               |              |         |                  |
               |    Cevre     |         |       Kare       |
               |              |         |                  |
               +--------------+         +------------------+
               | + cevreHesapla()|      | - kenar          |
               +--------------+         | + getKenar()     |
                                        | + setKenar()     |
                                        | + alanHesapla()  |
                                        | + cevreHesapla() |
                                        +------------------+
```

Class Diagram:

```
+--------------+
|              |
|    Sekil     |
|              |
+--------------+
|
|
|   +--------------+      +---------------+
|   |              |      |               |
|   |    Alan      |<--|--|    AlanPano   |
|   |              |      |               |
|   +--------------+      +---------------+
|   | + alanHesapla()|   | + hesapla()    |
+--------------+         +---------------+
        |
        |
        |   +--------------+
        |   |              |
        |   |    Cevre     |
        |   |              |
        |   +--------------+
        |   | + cevreHesapla()|
        |   +--------------+
        |
        |
        |
+------------------+
|                  |
|       Kare       |
|                  |
+------------------+
| - kenar          |
| + getKenar()     |
| + setKenar()     |
| + alanHesapla()  |
| + cevreHesapla() |
+------------------+
```

These diagrams represent the relationships between the classes in your Java code. The arrows indicate associations, and the "+" and "-" signs indicate public and private members, respectively.
