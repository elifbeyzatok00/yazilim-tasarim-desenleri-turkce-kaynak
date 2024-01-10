public class App {
    public static void main(String[] args) throws Exception {
        Bilgisayar bilgisayar = new Bilgisayar();
        Tablet tablet = new Tablet();

        HP hp = new HP();
        Canon canon = new Canon();

        /*
        hp.print(bilgisayar);
        hp.print(tablet);

        canon.print(bilgisayar);
        canon.print(tablet);
        */

        bilgisayar.visit(canon);
        bilgisayar.visit(hp);
        
        tablet.visit(canon);
        tablet.visit(hp);
        
    }
}
