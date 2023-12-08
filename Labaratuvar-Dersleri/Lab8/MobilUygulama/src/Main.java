public class Main {
    public static void main(String[] args) throws Exception {
        
        Kanal k1 = new Kanal("Kanal 1", "kanal1");
        Kanal k2 = new Kanal("Kanal 2", "kanal2");
        Kanal k3 = new Kanal("Kanal 3", "kanal3");

        KanalActivity kanalActivity = new KanalActivity();
        MedyaActivity medyaActivity = new MedyaActivity();

        kanalActivity.onCreate();
        kanalActivity.kanalEkle(k1);
        kanalActivity.kanalEkle(k2);
        kanalActivity.kanalEkle(k3);

        medyaActivity.onCreate();
        medyaActivity.kanalSec(k1);

        sleep(5000);
        medyaActivity.onCreate();
        medyaActivity.kanalSec(k2);

        sleep(5000);
        medyaActivity.onCreate();
        medyaActivity.kanalSec(k3);

    }

    public static void sleep(int time) {
        try{
            Thread.sleep(time);
        }catch(Exception exception){
            System.out.println(exception.toString());
        }
    }
}
