class Calisan{
    private int saat, ucret;
    private String isim;

    public String getIsim(){
        return this.isim;
    }

    public int getSaat(){
        return this.saat;
    }

    public int getUcret(){
        return this.ucret;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    public void setUcret(int ucret){
        this.ucret = ucret;
    }

    public void setSaat(int saat){
        this.saat = saat;
    }
}

class Isci extends Calisan{
    public Isci(){
        setUcret(50);
    }
}

class Muhendis extends Calisan{
    public Muhendis(){
        setUcret(100);
    }
}

class MaasHesapla{
    public int hesapla(Calisan calisan){
        return calisan.getSaat() * calisan.getUcret();
    }
}

public class Example{
    public static void main(String args[]){
        MaasHesapla maasHesapla = new MaasHesapla();
        
        Calisan ahmet = new Muhendis();
        Calisan meltem = new Isci();

        ahmet.setIsim("Ahmet");
        ahmet.setSaat(50);

        meltem.setIsim("Meltem");
        meltem.setSaat(40);

        System.out.println("Ahmet'in Maasi: " + maasHesapla.hesapla(ahmet));

        System.out.println("Meltem'in Maasi: " + maasHesapla.hesapla(meltem));

    }
}