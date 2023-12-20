public class Kullanici {
    protected String mail;

    public String getMail(){
        return this.mail;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
 
    public void giris(){
        System.out.println("Giriş yapıldı.");
    }
}
class Satici extends Kullanici{
    private String vkn;

    public String getVkn(){
        return this.vkn;
    }
    public void setVkn(String vkn){
        this.vkn = vkn;
    }

    public void UrunListele(){
        System.out.println("Ürün listelendi.");
    }
}
class Musteri extends Kullanici{
   private String tc;

    public String getTc(){
        return this.tc;
    }
    public void setTc(String tc){
        this.tc = tc;
    }

    public void UrunGoruntule(){
        System.out.println("Ürün görüntülendi.");
    }
}