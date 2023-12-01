# Ödev - 1 (Open-Closed)

> Yapılacak uygulamada çevre ve alanları hesaplayan paneller bulunmaktadır. Kullanıcı panel üzerinden çizdiği (istemcide nesne oluşturulacak) şekillerin alan ve çevrelerini hesaplayan uygulamayı geliştiriniz. Paneller birbirine dönüştürülebilir olmalıdır. Şekiller: Çember, Daire, Kare ve Dikdörtgen olarak belirlenmiştir.(Ben ek olarak üçgen için de bir class ekledim)

`Single Responsiblty ve Open Closed anlamak için yaptığımız bir ödev`

- Bir Pano aracılığı ile şekilleri alıyoruz.
- Bu şekillerin çevre ve alanlarını hesaplıyoruz.

## Diyagram Çizelim

### Use Case Diyagramı:

Use case diyagramında genellikle sistemin kullanıcıları ve bu kullanıcıların gerçekleştirebilecekleri temel işlevsellikler gösterilir. Ancak bu örnekte, bir GUI uygulaması veya farklı kullanıcı rolleri olmadığı için basit bir use case diyagramı oluşturmak mümkün değil.

### Class Diyagramı:

```plaintext
+---------------------------+
|        Shape              |
+---------------------------+
|                           |
+---------------------------+
        ^
        |
+---------------------------+
|          Alan             |
+---------------------------+
| + alanHesapla(): double   |
+---------------------------+
        ^
        |
+---------------------------+
|          Cevre            |
+---------------------------+
| + cevreHesapla(): double  |
+---------------------------+
        ^
        |
+---------------------------+
|           Square          |
+---------------------------+
| - kenar: int              |
| + alanHesapla(): double   |
| + cevreHesapla(): double  |
| + getKenar(): int         |
| + setKenar(kenar: int): void |
+---------------------------+
        ^
        |
+---------------------------+
|       Rectangle           |
+---------------------------+
| - uzunKenar: int          |
| - kisaKenar: int          |
| + alanHesapla(): double   |
| + cevreHesapla(): double  |
| + getUzunKenar(): int     |
| + setUzunKenar(uzunKenar: int): void |
| + getKisaKenar(): int     |
| + setKisaKenar(kisaKenar: int): void |
+---------------------------+
        ^
        |
+---------------------------+
|           Circle          |
+---------------------------+
| - yaricap: double         |
| + alanHesapla(): double   |
| + cevreHesapla(): double  |
| + getYaricap(): double    |
| + setYaricap(yaricap: double): void |
+---------------------------+
        ^
        |
+---------------------------+
|    EquilateralTriangle    |
+---------------------------+
| - kenar: int              |
| + alanHesapla(): double   |
| + cevreHesapla(): double  |
| + getKenar(): int         |
| + setKenar(kenar: int): void |
+---------------------------+
        ^
        |
+---------------------------+
|      CalculationPanel     |
+---------------------------+
| + calculate(shapes: ArrayList<Shape>): double |
+---------------------------+
        ^
        |
+---------------------------+
|        AreaPanel           |
+---------------------------+
| + calculate(shapes: ArrayList<Shape>): double |
+---------------------------+
        ^
        |
+---------------------------+
|      PerimeterPanel       |
+---------------------------+
| + calculate(shapes: ArrayList<Shape>): double |
+---------------------------+
```

In this class diagram:

- `Shape` is the base interface.
- `Alan` and `Cevre` are interfaces representing shapes that can calculate area and perimeter, respectively.
- `Square`, `Rectangle`, `Circle`, and `EquilateralTriangle` are classes implementing both `Alan` and `Cevre` interfaces.
- `CalculationPanel` is an interface representing a generic calculation panel.
- `AreaPanel` and `PerimeterPanel` are specific panels that implement the `CalculationPanel` interface, each focusing on calculating area or perimeter.
- Relationships between interfaces and classes are shown using generalization (inheritance).
- The `calculate` method in each panel takes an `ArrayList` of shapes and performs the relevant calculations.

Note: The `AreaPanel` and `PerimeterPanel` classes are not explicitly shown in your provided code, so I assumed their existence based on the context. If they don't exist, you can modify the diagram accordingly.
