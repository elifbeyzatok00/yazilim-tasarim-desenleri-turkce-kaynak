public interface Visitor{
    public void visit(HP hp); //visit fonk içine somut bir şey almalı bu nedenle device ı değil hp ve canonn u almalı
    public void visit(Canon canon);
}

interface Device extends Visitor{
    public String belge();
}

class Bilgisayar implements Device{
    @Override
    public String belge() {
        return "Bilgisayar";
    }

    @Override
    public void visit(HP hp) {
        hp.print(this);
    }

    @Override
    public void visit(Canon canon) {
        canon.print(this);
    }

}
class Tablet implements Device{
    @Override
    public String belge() {
        return "Tablet";
    }
    public void visit(HP hp) {
        hp.print(this);
    }
    public void visit(Canon canon) {
        canon.print(this);
    }
}

interface BilgisayarPrinter{
    public void print(Bilgisayar bilgisayar);
}

interface TabletPrinter{
    public void print(Tablet tablet);
}

class HP  implements BilgisayarPrinter, TabletPrinter{
    @Override
    public void print(Bilgisayar bilgisayar) {
         
        System.out.println("HP yazıcıdan bilgisayar çıktısı alındı:" + bilgisayar.belge());
    }
    @Override
    public void print(Tablet tablet) {
         
        System.out.println("HP yazıcıdan tablet çıktısı alındı:" + tablet.belge());
    }
}

class Canon implements BilgisayarPrinter, TabletPrinter{
    @Override
    public void print(Bilgisayar bilgisayar) {
         
        System.out.println("Canon yazıcıdan bilgisayar çıktısı alındı:" + bilgisayar.belge());
    }
    @Override
    public void print(Tablet tablet) {
         
        System.out.println("Canon yazıcıdan tablet çıktısı alındı:" + tablet.belge());
    }
}