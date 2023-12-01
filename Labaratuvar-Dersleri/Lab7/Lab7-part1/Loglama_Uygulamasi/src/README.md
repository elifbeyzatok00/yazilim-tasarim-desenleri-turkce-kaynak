# Task

![Alt text](<WhatsApp Görsel 2023-11-22 saat 15.19.40_3514933a.jpg>)

# Diyagram Çizelim

Use Case Diagram:

```
+--------------+      +---------------+
|              |      |               |
|    Log       |      |   Yazdir      |
|              |      |               |
+--------------+      +---------------+
| - mesaj      |<--|--| + logYazdir()  |
+--------------+      +---------------+
                                  / \
                                  |  \
+---------------------+         |   \
|                     |         |    \
|    Baglanti         |         |     \      +------------------------+
|                     |         |      \---->|                        |
+---------------------+         |            |   LogKonsol             |
| + baglantiAc()      |         |            |                        |
| + baglantiKapat()   |         |            +------------------------+
+---------------------+         |
                                |
                                |
+---------------------+         |
|                     |         |
| LogVeritabani       |<--------+
|                     |
+---------------------+
| + baglantiAc()      |
| + baglantiKapat()   |
| + logYazdir()       |
+---------------------+
```

Class Diagram:

```
+--------------+
|              |
|    Log       |
|              |
+--------------+
| - mesaj      |
+--------------+
| + getMesaj()  |
| + setMesaj()  |
+--------------+
        |
        | implements
        |
+------------------+
|                  |
|     Yazdir       |
|                  |
+------------------+
| + logYazdir()    |
+------------------+
        /|\
         |
         | implements
         |
+----------------------+
|                      |
|    Baglanti          |
|                      |
+----------------------+
| + baglantiAc()       |
| + baglantiKapat()    |
+----------------------+
        |
        | implements
        |
+----------------------+
|                      |
|   LogKonsol           |
|                      |
+----------------------+
| + logYazdir()        |
+----------------------+
        |
        | implements
        |
+----------------------+
|                      |
|   LogVeritabani       |
|                      |
+----------------------+
| + baglantiAc()       |
| + baglantiKapat()    |
| + logYazdir()        |
+----------------------+
```

These diagrams represent the relationships between the classes in your Java code. The arrows indicate associations, and the "+" and "-" signs indicate public and private members, respectively.
