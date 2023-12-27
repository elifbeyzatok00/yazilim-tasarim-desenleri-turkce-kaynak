import java.util.ArrayList;
import java.util.List;

public abstract class Personel {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void bilgiGoster();
    
}

class Yonetici extends Personel{
    @Override
    public void bilgiGoster() {
        System.out.println(getName() + " isimli yöneticinin bilgileri gösteriliyor.");
    }
}

class Gelistirici extends Personel{
    @Override
    public void bilgiGoster() {
        System.out.println(getName() + " isimli geliştiricinin bilgileri gösteriliyor.");
    }
}

class Tasarimci extends Personel{
    @Override
    public void bilgiGoster() {
        System.out.println(getName() + " isimli tasarımcının bilgileri gösteriliyor.");
    }
}

class Ekip extends Personel{
    Personel personel;
    List<Personel> personelListe;
    public Ekip() {
        
    }
    public Ekip(Personel personel) {
        setPersonel(personel);
        personelListe = new ArrayList<>();
    }
    public void ekle(Personel personel){
        personelListe.add(personel);
    }
    public void cikar(Personel personel){
        personelListe.remove(personel);
    }

    @Override
    public void bilgiGoster() {
        System.out.println(personel.getName() + " isimli ekip bilgileri gösteriliyor.");
        System.out.println("---------------------------");
        for (Personel personel : personelListe) {
            personel.bilgiGoster();
        }
    }

    public Personel getPersonel() {
        return personel;
    }
    public void setPersonel(Personel personel) {
        this.personel = personel;
    }
    public List<Personel> getPersonelListe() {
        return personelListe;
    }
    public void setPersonelListe(List<Personel> personelListe) {
        this.personelListe = personelListe;
    }
    
}