public abstract class Car{
    private double hiz;
    private double hizlanma;

    public Car(){
        setHiz(0);
    }

    public double getHiz() {
        return hiz;
    }
    public void setHiz(double hiz) {
        this.hiz = hiz;
    }
    public double getHizlanma() {
        return hizlanma;
    }
    public void setHizlanma(double hizlanma) {
        this.hizlanma = hizlanma;
    }

    public abstract void calistir();
}

interface Klima{
    public void KlimaAc();
}

interface Turbo{
    public void TurboAc();
}

class Ferrari extends Car implements Turbo, Klima{
    public Ferrari(){
        setHizlanma(20);
    }

    @Override
    public void KlimaAc() {
        setHizlanma(getHizlanma());
    }
    @Override
    public void TurboAc(){
        setHizlanma(getHizlanma()*2);
    }
    @Override
    public void calistir() {
        setHiz(getHiz()+getHizlanma());
    }

}

class BMW extends Car implements Klima{
    public BMW(){
        setHizlanma(20);
    }

    @Override
    public void KlimaAc() {
        setHizlanma(getHizlanma());
    }  
    @Override
    public void calistir() {
        setHiz(getHiz()+getHizlanma());
    }

}

class Mercedes extends Car implements Turbo{
    public Mercedes(){
        setHizlanma(51);
    }

    @Override
    public void TurboAc(){
        setHizlanma(getHizlanma()*2);
    }

    @Override
    public void calistir() {
        setHiz(getHiz()+getHizlanma());
    }

}
