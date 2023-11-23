import java.util.ArrayList;

public class Kullanici {
    private String isim;
    private String mail;
    private String ip;
    private String telefon;
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }   
}

class Bilgi {
    String mesaj;
    public String getMesaj() {
        return mesaj;
    }
    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}

interface Bildirim {
    public void gonder(Kullanici kullanici, Bilgi bilgi);
}

class Mail implements Bildirim {
    @Override
    public void gonder(Kullanici kullanici, Bilgi bilgi) {
        System.out.println(kullanici.getIsim() + "-mail-" + bilgi.getMesaj());
    }
}

class Sms implements Bildirim {
    @Override
    public void gonder(Kullanici kullanici, Bilgi bilgi) {
        System.out.println(kullanici.getIsim() + "-sms-" + bilgi.getMesaj());
    }
}

class Ip implements Bildirim {
    @Override
    public void gonder(Kullanici kullanici, Bilgi bilgi) {
        System.out.println(kullanici.getIsim() + "-ip-" + bilgi.getMesaj());
        
    }   
}

class BildirimYonetim {
    ArrayList<Bildirim> liste;
    public BildirimYonetim() {
        liste = new ArrayList<>();
    }
    public void ekle(Bildirim bildirim) {
        liste.add(bildirim);
    }
    public ArrayList<Bildirim> getListe() {
        return liste;
    }
}

class BildirimGonder {
    public void bildirimGonder(Kullanici kullanici, Bilgi bilgi) {
        for (Bildirim bildirim : kullanici.getListe()) {
            bildirim.gonder(kullanici, bilgi);
        }
    }
}