public class Log{
    private String mesaj;

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}

interface Yazdir{
    public void logYazdir(Log log);
}

interface Baglanti{
    public void baglantiAc();
    public void baglantiKapat();
}   

class LogKonsol implements Yazdir{
    public void logYazdir(Log log){
        System.out.println(log.getMesaj());
    }
}

class LogVeritabani implements Yazdir, Baglanti{
    public void logYazdir(Log log){
        baglantiAc();

        System.out.println("Veritabanına yazıldı");

        baglantiKapat();
    }

    public void baglantiAc(){
        throw new UnsupportedOperationException("Unimplemented method 'baglantiAc'");
    }

    public void baglantiKapat(){
        throw new UnsupportedOperationException("Unimplemented method 'baglantiKapat'");
    }
}