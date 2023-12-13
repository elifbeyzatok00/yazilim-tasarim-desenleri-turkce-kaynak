public abstract class CarFactory { // interface/abstract olabilir ama bu soruda somut ortak özellikler var bu nedenle abstract tanımladık
    private Motor motor;
    private Sanziman sanziman;
    private Renk renk;
    private Tekerlek tekerlek;

    public abstract void createMotor();
    public abstract void createSanziman();
    public abstract void createRenk();
    public abstract void createTekerlek();

    //bu şekilde de yapılabilir
    public void calistir(){
        getMotor().calistir();
    }

    private Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    private Sanziman getSanziman() {
        return sanziman;
    }
    public void setSanziman(Sanziman sanziman) {
        this.sanziman = sanziman;
    }
    private Renk getRenk() {
        return renk;
    }
    public void setRenk(Renk renk) {
        this.renk = renk;
    }
    private Tekerlek getTekerlek() {
        return tekerlek;
    }
    public void setTekerlek(Tekerlek tekerlek) {
        this.tekerlek = tekerlek;
    }
}

class AModel extends CarFactory {
    @Override
    public void createMotor() {
        setMotor(new DortSilindir());
        
    }
    @Override
    public void createSanziman() {
        setSanziman(new DuzVites());
        
    }
    @Override
    public void createRenk() {
        setRenk(new Beyaz());
        
    }
    @Override
    public void createTekerlek() {
        setTekerlek(new KisLastik());
        
    }
}

interface Motor{
    public void calistir();
}
interface Sanziman{
    public void degistir();
}
interface Renk{
    public void doldur();
}
interface Tekerlek{
    public void dondur();
}

class UcSilindir implements Motor{

    @Override
    public void calistir() {
        System.out.println("Üç silindirli motor çalıştırıldı.");
    }
    
}

class DortSilindir implements Motor{

    @Override
    public void calistir() {
        System.out.println("Dört silindirli motor çalıştırıldı.");
    }
    
}

class DuzVites implements Sanziman{

    @Override
    public void degistir() {
        System.out.println("Düz vites sanziman kullanıldı.");
    }
    
}

class OtomatikVites implements Sanziman{

    @Override
    public void degistir() {
        System.out.println("Otomatik vites sanziman kullanıldı.");
    }
    
}

class Beyaz implements Renk{

    @Override
    public void doldur() {
        System.out.println("Beyaz renk kullanıldı.");
    }
    
}

class Siyah implements Renk{

    @Override
    public void doldur() {
        System.out.println("Siyah renk kullanıldı.");
    }
    
}

class Kırmızı implements Renk{

    @Override
    public void doldur() {
        System.out.println("Kırmızı renk kullanıldı.");
    }
    
}

class KisLastik implements Tekerlek{

    @Override
    public void dondur() {
        System.out.println("Kış lastiği kullanıldı.");
    }
    
}

class YazLastik implements Tekerlek{

    @Override
    public void dondur() {
        System.out.println("Yaz lastiği kullanıldı.");
    }
    
}