import java.util.ArrayList;

public interface Activity{
    public void onCreate();
}

class KanalActivity implements Activity {
    private ArrayList<Kanal> kanalListesi;
    @Override
    public void onCreate() {
       kanalListesi = new ArrayList<>();
    }
    public void kanalEkle(Kanal kanal) {
        kanalListesi.add(kanal);
    }
}

class MedyaActivity implements Activity {
    private MediaPlayer mediaPlayer;
    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.getMediaPlayer();
    }
    public void play() {
        mediaPlayer.oynat();
    }
    public void pause() {
        mediaPlayer.durdur();
    }
}

public void kanalSec(Kanal kanal) {
    mediaPlayer.kanalSec(kanal);
}

class Kanal {
    private String isim;
    private String link;
    public Kanal(String isim, String link) {
        this.isim = isim;
        this.link = link;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
}

class MediaPlayer implements Runnable{
    private Kanal kanal;
    private boolean kontrol;
    private static MediaPlayer mediaPlayer;

    public MediaPlayer() {
        kontrol = true;
    }

    public static MediaPlayer getMediaPlayer() {
        if(mediaPlayer == null) {
            mediaPlayer = new MediaPlayer();
        }
        return mediaPlayer;
    }
    
    public Kanal getKanal() {
        return kanal;
    }

    public void setKanal(Kanal kanal) {
        this.kanal = kanal;
    }

    public void durdur() {
        kontrol = false;
    }

    public void oynat() {
        kontrol = true;
        new Thread(this).start();
    }

    public void kanalSec(Kanal kanal) {
        setKanal(kanal);
    }   

    //run() methodu thread'in ana gövdesidir.
    //Thread'in çalışması için run() methodu çağrılmalıdır.
    //run() methodu olmasaydı kodumuz kilitlenirdi ve çalışmazdı.
    @Override
    public void run() {
        while(kontrol) {
            Main.sleep(1000);
            System.out.println("Kanal: " + kanal.getIsim() + "-" + "Link: " + kanal.getLink() + "playing.");
        }
    }
}