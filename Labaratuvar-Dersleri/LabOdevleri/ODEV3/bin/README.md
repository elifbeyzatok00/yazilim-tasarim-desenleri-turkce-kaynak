# ODEV3 (Builder)

> Bir şekil çizme uygulaması yazdığınızı varsayınız. Bu uygulamaya verdiğiniz parametrelere göre size şekli oluşturup döndüren bir uygulama tasarlayınız.
> Şekil Nesnesini oluşturmak için gerekli parametreler:
> Şeklin kaç kenardan oluşacağı (short veya int)
> Şeklin başlangıç konumu
> Kenar uzunlukları (short veya int) (Tüm kenarlar eşit uzunlukta olsun)
> Kenar kalınlıkları (short veya int) (Tüm kenarlar eşit uzunlukta olsun)
> Kenar rengi (string)
> İç renk (string)
> Kolaylık olması açısından ürün olarak şeklin görüntüsünü değil; şeklin özelliklerini bir metin ya da listede tutup, bunları döndürebilirsiniz.
> Bu uygulamayı builder deseni ile yapmanın avantajı nedir? Sizce böyle bir uygulamada abstract factory deseni mi tercih edilmelidir yoksa builder deseni mi, neden?

## `Cevap:`

> Builder deseni, bir nesnenin karmaşık yapısını adım adım oluşturmak ve farklı varyasyonlara sahip nesneleri aynı oluşturma süreci içinde yönetmek için kullanılır. Builder deseni, nesne oluşturmanın karmaşıklığını gizler ve aynı oluşturma sürecini kullanarak farklı özelliklere sahip nesnelerin üretilmesini sağlar.

Bu uygulamada builder deseni kullanmanın avantajları şunlar olabilir:

1. **Esneklik:** Builder deseni, nesne oluşturma sürecini adım adım yönetir ve farklı özelliklere sahip nesneleri kolayca oluşturmanıza olanak tanır. Bu, uygulamanın gelecekteki gereksinimlere uyum sağlamasını kolaylaştırır.

2. **Okunabilirlik:** Builder deseni, nesnenin özelliklerini belirlemek için açık ve okunabilir bir arayüz sağlar. Bu sayede, kullanıcılar hangi özellikleri belirlediklerini açıkça görebilir ve yönetebilir.

3. **Zorunlu/Opsiyonel Parametreler:** Builder deseni, bir nesneyi oluşturmak için zorunlu ve isteğe bağlı parametreleri içerebilen bir yapı sağlar. Bu, belirli durumları veya gereksinimleri karşılamak için esneklik sağlar.

Abstract Factory deseni ise ilgili nesne ailelerini oluşturmayı amaçlar ve bir aile içindeki nesnelerin birbiriyle uyumlu olmasını sağlar. Bu desen, ürün ailelerini değiştirmeyi ve birbiriyle uyumlu nesneleri bir araya getirmeyi kolaylaştırır. Ancak, bu durumda Abstract Factory deseni kullanmanın gereksiz bir karmaşıklığa neden olabileceğini söyleyebiliriz.

Builder deseni, özellikle farklı kombinasyonlarda nesne oluşturmanın sıkça değiştiği durumlarda daha uygundur. Eğer sadece tek bir aile içindeki nesneleri oluşturmanız gerekiyorsa ve bu aile sık sık değişmiyorsa, Abstract Factory deseni kullanmak yerine Builder deseni daha uygun olabilir.

> Sonuç olarak, bu uygulamada Builder deseni, esneklik ve okunabilirlik avantajları nedeniyle tercih edilebilir.
