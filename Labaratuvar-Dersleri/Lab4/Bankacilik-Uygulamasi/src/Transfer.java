public class Transfer {
    public void havale(Kullanici gonderici, Kullanici alici, double miktar){
        if(gonderici.getTlBakiye() > miktar){
            gonderici.setTlBakiye(gonderici.getTlBakiye() - miktar);
            alici.setTlBakiye(alici.getTlBakiye() + miktar);
        }
        else{
            System.out.println("Yetersiz bakiye");
        }
    }
    public void eft(Kullanici gonderici, Kullanici alici, double miktar){
        double maliyet = Ozel.TL_MALIYET;
        if(gonderici instanceof Standart){
            double maliyetOran = miktar / Standart.ORAN;
            if(maliyetOran > Ozel.TL_MALIYET){
                maliyet = maliyetOran;
            }
        }

        if(gonderici.getTlBakiye() > (miktar + maliyet)){
            gonderici.setTlBakiye(gonderici.getTlBakiye() - miktar - maliyet);
            alici.setTlBakiye(alici.getTlBakiye() + miktar);
        }
        else{
            System.out.println("Yetersiz bakiye");
        }
    }
    public void swift(Ozel gonderici, Ozel alici, double miktar){

        if(gonderici.getDovizBakiye() > miktar && gonderici.getTlBakiye() > Ozel.DOVIZ_MALIYET){
            gonderici.setDovizBakiye(gonderici.getDovizBakiye() - miktar);
            gonderici.setTlBakiye(gonderici.getTlBakiye() - Ozel.DOVIZ_MALIYET);
            alici.setDovizBakiye(alici.getDovizBakiye() + miktar);
        }
        else{
            System.out.println("Yetersiz bakiye");
        }
    }
}
