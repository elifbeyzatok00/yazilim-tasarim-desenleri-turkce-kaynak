# Task

![Alt text](<WhatsApp Görsel 2023-12-13 saat 15.19.52_4a6ed155.jpg>)

> Abstract Factory anlamak için yaptığımız uygulama

## `UML Diagram`

![Alt text](<WhatsApp Görsel 2023-12-13 saat 15.59.46_a45cc429.jpg>)

![Alt text](<WhatsApp Görsel 2023-12-13 saat 20.37.55_9fef0cc1.jpg>)

> - Motor, Şanzıman, Renk, Tekerlek için birer interface tasarladık

    Bu interfacelerin içine her birinin yaptığı işi veren fonksiyonlar yazdık

> - CarFactory isimli abstract class oluşturduk

    Bu class içinde referanslarını Motor, Şanzıman, Renk, Tekerlek interfacelerinden alan yine aynı isimli private özellikleri var

    ayrıca yine bunlar için ismi createMotor, createSanziman, createRenk, createTekerlek olan abstract soyut fonksiyonlar yazdık içleri boş olan.

> - A Model adlı ilk model için somut bir class oluşturduk ve extends ile CarFactory sınıfından miras aldık.

    Bu sayede createMotor, createSanziman, createRenk, createTekerlek fonksiyonlarını A Model için kullanabilir hale geldik.
    Ve içleri boş olan createMotor, createSanziman, createRenk, createTekerlek isimli abstract soyut fonksiyonların içlerini set fonksiyonları ile A Model in özelliklerine göre doldurduk.

> - Son olarak Motor, Şanzıman, Renk, Tekerlek interfacelerini implements ederek interfaceler içinde yer alan fonksiyonlara eriştik ve bu fonksiyonları UcSilindir, DuzVites vb. isimli classlarda içlerini doldurduk
