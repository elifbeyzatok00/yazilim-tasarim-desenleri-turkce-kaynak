# Task

> Adapter desenini anlamak için yaptığımız uygulama

## Versiyon 2'de ne yaptık?

> - ilk olarak **Service sınıfı tipi ne istiyor** belirlemek gerek!
>   Versiyon 2 için tipi **Oracle** istiyor

```java
class Service {
    private Oracle db;

    public Service(Oracle db) {
        setDb(db);
    }
    public User getUser(int ID){
        return db.selectUserById(ID);
    }
    public void addUser(User user){
        db.insertUser(user);
    }
    public Oracle getDb() {
        return db;
    }
    public void setDb(Oracle db) {
        this.db = db;
    }
}
```

> - Versiyon 2'de MsSQL tip uyumsuzluğu nedeni ile eklenemiyor.
>   Yani Service sınıfı Oracle tipinden türetilmiş sınıf istemesine rağmen
>   Göndermek istediğim sınıfın tipi Mssql

`Bu sorunu nasıl çözdük?`

> **Aşama1:** Adapter sınıfı oluşturduk ve Oracle'dan extends alıyor

```java
public class Adapter extends Oracle{
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

> **Aşama2:** Service sınıfını kullanacağım için Mssql metodlarını, Oracle içinde Override etmem gerek bunu sağlamak için de öncesinde Adapter sınıfına extends Oracle yapmak gerek. Bunu aşama 1'de yapmıştık.

```java
class Oracle {
    private final List<User> userList;
    private int idCounter; //db primary key tasarlamak için

    public Oracle() {
        idCounter = 0;
        userList = new ArrayList<>();
    }
    @Override
    public User selectUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    @Override
    public void insertUser(User user) {
        count();
        user.setId(idCounter);
        userList.add(user);
    }

    private void count() {
        idCounter = idCounter + 1;
    }
}
```
