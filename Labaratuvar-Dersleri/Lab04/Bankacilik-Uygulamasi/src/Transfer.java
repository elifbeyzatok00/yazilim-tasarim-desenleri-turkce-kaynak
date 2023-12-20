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
        double maliyet = Ozel.TL_MALIYET; // özel kullanıcı için 20 TL ücret alacak. Bunu diretk verdik
        //Standart kullanıcı için ise miktarın %5'i kadar ücret alacak. Bunu aşağıdaki is bloğunda hesaplayacağız
        if(gonderici instanceof Standart){
            double maliyetOran = miktar / Standart.ORAN; // standart kullanıcı için %5 ücret alacak
            // 5/100 = 1/20 Yani ORAN=20 => 1/ORAN = 1/20 = 0.05 ile
            // miktar / ORAN = miktar * 1/ORAN = miktar * 0.05 sağladık
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
    public void swift(Ozel gonderici, Ozel alici, double miktar){ // tipi Ozel verdik çünkü swift sadece Ozel kullanıcılar arasında olabilir

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
