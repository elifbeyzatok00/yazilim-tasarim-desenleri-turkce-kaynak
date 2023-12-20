public class Kullanici {
    private String isim;
    private String mail;
    private Adres faturaAdres;
    private Adres kargoAdres;

    public Kullanici() {

    }

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

    public Adres getFaturaAdres() {
        return faturaAdres;
    }

    public void setFaturaAdres(Adres faturaAdres) {
        this.faturaAdres = faturaAdres;
    }

    public Adres getKargoAdres() {
        return kargoAdres;
    }

    public void setKargoAdres(Adres kargoAdres) {
        this.kargoAdres = kargoAdres;
    }

    @Override
    public String toString() {
        return "Kullanici [isim=" + isim + ", mail=" + mail + ", faturaAdres=" + faturaAdres + ", kargoAdres="
                + kargoAdres + "]";
    }

}
