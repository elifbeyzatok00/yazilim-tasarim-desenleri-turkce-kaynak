import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

public class Observer {}

interface Takipci{
    public void bilgiAl(Gonderi gonderi);
}
abstract class TakipEdilen{
    private List<Takipci> takipciler;
    public TakipEdilen(){
        takipciler = new ArrayList<>();
    }
    public void takipciEkle(Takipci takipci){
        takipciler.add(takipci);
    }
    public void takipcilerHaberVer(Gonderi gonderi){
        for(Takipci takipci : takipciler){
            takipci.bilgiAl(gonderi);
        }
    }
}
interface PaylasimYapan{
    public void paylas(Gonderi gonderi);
}

class Gonderi{
    private Icon resim;
    private String baslik;
    public Icon getResim() {
        return resim;
    }
    public void setResim(Icon resim) {
        this.resim = resim;
    }
    public String getBaslik() {
        return baslik;
    }
    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }
    
}


class Kullanici extends TakipEdilen implements PaylasimYapan, Takipci{
    @Override
    public void paylas(Gonderi gonderi) {
        System.out.println("Kullanıcı gönderi paylaştı: " + gonderi.getBaslik());
    }

    @Override
    public void bilgiAl(Gonderi gonderi) {
        System.out.println("Kullanıcı bilgi aldı: " + gonderi.getBaslik());
    }
}

class Sayfa extends TakipEdilen implements PaylasimYapan{
    @Override
    public void paylas(Gonderi gonderi) {
        System.out.println("Sayfa gönderi paylaştı: " + gonderi.getBaslik());
        takipcilerHaberVer(gonderi);
    }
}

class Grup implements Takipci{
    @Override
    public void bilgiAl(Gonderi gonderi){
        System.out.println("Grup bilgi aldı: " + gonderi.getBaslik());
    }
}