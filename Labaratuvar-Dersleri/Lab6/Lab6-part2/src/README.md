# Task

![Alt text](<WhatsApp Görsel 2023-11-17 saat 11.24.37_daf15c79.jpg>)

## Diyagram Çizelim

Use Case Diagram:

```
+--------------+         +---------------+
|              |         |               |
|     Car      |         |    Klima      |
|              |         |               |
+--------------+         +---------------+
| - hiz        |         |               |
| - hizlanma   |         |               |
+--------------+         +---------------+
| + getHiz()   |         | + KlimaAc()   |
| + setHiz()   |         +---------------+
| + getHizlanma() |       |               |
| + setHizlanma() |       +---------------+
| + calistir()  |         +---------------+
+--------------+                 |
        |                       |
        | uses                  | uses
        |                       |
        v                       v
+--------------+         +---------------+
|   Turbo      |         |   Ferrari     |
|              |         |               |
+--------------+         +---------------+
|               |        |               |
| + TurboAc()   |        | - hizlanma    |
+---------------+        |               |
                        | + KlimaAc()   |
                        +---------------+
                        | + calistir()  |
                        +---------------+
                                |
                                | extends
                                |
                        +---------------+
                        |    BMW        |
                        |               |
                        +---------------+
                        | - hizlanma    |
                        | + KlimaAc()   |
                        +---------------+
                        | + calistir()  |
                        +---------------+
                                |
                                | extends
                                |
                        +---------------+
                        |  Mercedes     |
                        |               |
                        +---------------+
                        | - hizlanma    |
                        | + TurboAc()   |
                        +---------------+
                        | + calistir()  |
                        +---------------+
```

Class Diagram:

```
+--------------+
|              |
|     Car      |
|              |
+--------------+
| - hiz        |
| - hizlanma   |
+--------------+
| + getHiz()   |
| + setHiz()   |
| + getHizlanma()|
| + setHizlanma()|
| + calistir()  |
+--------------+
        |
        | uses
        |
        v
+---------------+
|    Klima      |
+---------------+
| + KlimaAc()   |
+---------------+
        |
        | uses
        |
        v
+---------------+
|   Turbo       |
+---------------+
| + TurboAc()   |
+---------------+
        |
        | extends
        |
        v
+---------------+
|   Ferrari     |
+---------------+
| - hizlanma    |
| + KlimaAc()   |
| + calistir()  |
+---------------+
        |
        | extends
        |
        v
+---------------+
|    BMW        |
+---------------+
| - hizlanma    |
| + KlimaAc()   |
| + calistir()  |
+---------------+
        |
        | extends
        |
        v
+---------------+
|  Mercedes     |
+---------------+
| - hizlanma    |
| + TurboAc()   |
| + calistir()  |
+---------------+
```

These diagrams represent the relationships between the classes in your Java code. The arrows indicate associations, and the "+" and "-" signs indicate public and private members, respectively.
