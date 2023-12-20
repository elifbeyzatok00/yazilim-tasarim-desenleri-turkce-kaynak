public class Main {
    public static void main(String[] args) {
        Oracle oracle = new Oracle();
        Mssql mssql = new Mssql();
        Adapter adapter = new Adapter();

        Service service1 = new Service(oracle);

        Service service3 = new Service(adapter);

        service1.addUser(new User("Test 1"));
        service1.addUser(new User("Test 2"));
        service1.addUser(new User("Test 3"));
        service1.addUser(new User("Test 4"));
        service1.addUser(new User("Test 5"));

        User user1 = service1.getUser(3); 

        System.out.println(user1.getName());

        service3.addUser(new User("Test 1"));
        service3.addUser(new User("Test 2"));
        service3.addUser(new User("Test 3"));
        service3.addUser(new User("Test 4"));
        service3.addUser(new User("Test 5"));

        User user2 = service1.getUser(3);

        System.out.println(user2.getName());
    }
}
