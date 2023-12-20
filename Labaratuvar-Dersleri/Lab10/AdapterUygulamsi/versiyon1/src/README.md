# Task

> Adapter desenini anlamak için yaptığımız uygulama

## `UML Diagram`

![Alt text](<WhatsApp Image 2023-12-20 at 19.38.25_6d013d07.jpg>)

## Versiyon 1'de ne yaptık?

> - ilk olarak **Service sınıfı tipi ne istiyor** belirlemek gerek!
>   Versiyon 1 için tipi **DB** istiyor

```java
class Service {
    private DB db;

    public Service(DB db) {
        setDb(db);
    }
    public User getUser(int ID){
        return db.selectUserById(ID);
    }
    public void addUser(User user){
        db.insertUser(user);
    }
    public DB getDb() {
        return db;
    }
    public void setDb(DB db) {
        this.db = db;
    }
}
```

> - Versiyon 1'de MsSQL tip uyumsuzluğu nedeni ile eklenemiyor.
>   Yani Service sınıfı DB tipinden türetilmiş sınıf istemesine rağmen
>   Göndermek istediğim sınıfın tipi Mssql

`Bu sorunu nasıl çözdük?`

> DB'den class adapte ettik
> Oluşturduğumuz Adapter'ın içinde 1 tane Mssql nesnesi tanımladık

```java
public class Adapter implements DB{
    private Mssql mssql;
    public Adapter(){
        mssql = new Mssql();
    }
    @Override
    public User selectUserById(int id) {
        return mssql.userByID(id);
    }
    @Override
    public void insertUser(User user) {
        mssql.user(user);
    }
}
```
