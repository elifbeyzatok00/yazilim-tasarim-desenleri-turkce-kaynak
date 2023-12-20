import java.util.ArrayList;
import java.util.List;

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

class User {
    private int id;
    private String name;
    public User(String name) {
        setName(name);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

interface DB {
    public User selectUserById(int id);

    public void insertUser(User user);
}

class Oracle implements DB {
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

class Mssql {
    private final List<User> userList;
    private int idCounter;

    public Mssql() {
        idCounter = 0;
        userList = new ArrayList<>();
    }

    public User userByID(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void user(User user) {
        user.setId(idCounter++);
        userList.add(user);
    }
}

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