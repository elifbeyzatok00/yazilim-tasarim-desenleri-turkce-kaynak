# Task

![Alt text](<WhatsApp Görsel 2023-11-17 saat 10.14.14_556a75eb.jpg>)

## Diyagram Çizelim

Use Case Diagram:

```
+--------------+         +-------------+
|              |         |             |
|    User      |         |   Odeme     |
|              |         |             |
+--------------+         +-------------+
| - sepet      |         |             |
+--------------+         |             |
| + getSepet() |         |             |
| + indirimHesapla()|    |             |
+--------------+         | + odemeYap()|
        |                +-------------+
        | uses
        |
        v
+-------------+
|   Standart  |
+-------------+
| + indirimHesapla()|
+-------------+
        |
        | extends
        |
        v
+-------------+
|   Premium   |
+-------------+
| + indirimHesapla()|
+-------------+
        |
        | uses
        |
        v
+-------------+
|   Urun      |
+-------------+
| - isim      |
| - fiyat     |
+-------------+
| + getIsim() |
| + setIsim() |
| + getFiyat()|
| + setFiyat()|
+-------------+
        |
        | uses
        |
        v
+-------------+
|   Sepet     |
+-------------+
| - urunler   |
+-------------+
| + urunEkle()|
| + urunCikar()|
| + getUrunler()|
+-------------+
```

Class Diagram:

```
+--------------+
|              |
|    User      |
|              |
+--------------+
| - sepet      |
+--------------+
| + getSepet() |
| + indirimHesapla()|
+--------------+
        |
        | uses
        |
        v
+-------------+
|   Standart  |
+-------------+
| + indirimHesapla()|
+-------------+
        |
        | extends
        |
        v
+-------------+
|   Premium   |
+-------------+
| + indirimHesapla()|
+-------------+
        |
        | uses
        |
        v
+-------------+
|   Urun      |
+-------------+
| - isim      |
| - fiyat     |
+-------------+
| + getIsim() |
| + setIsim() |
| + getFiyat()|
| + setFiyat()|
+-------------+
        |
        | uses
        |
        v
+-------------+
|   Sepet     |
+-------------+
| - urunler   |
+-------------+
| + urunEkle()|
| + urunCikar()|
| + getUrunler()|
+-------------+
        |
        | uses
        |
        v
+-------------+
|   Odeme     |
+-------------+
| + odemeYap()|
+-------------+
```

These diagrams represent the relationships between the classes in your Java code. The arrows indicate associations, and the "+" and "-" signs indicate public and private members, respectively.
