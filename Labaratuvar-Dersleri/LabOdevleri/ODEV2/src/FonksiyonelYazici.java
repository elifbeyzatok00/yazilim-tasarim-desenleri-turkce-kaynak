interface FonksiyonelYazici {
    void yazdir();
}

interface FonksiyonelTara {
    void tara();
}

class Yazici1 implements FonksiyonelYazici, FonksiyonelTara {
    @Override
    public void yazdir() {
        System.out.println("Yazici1 Yazdir");
    }

    @Override
    public void tara() {
        System.out.println("Yazici1 Tara");
    }
}

class Yazici2 implements FonksiyonelYazici {
    @Override
    public void yazdir() {
        System.out.println("Yazici2 Yazdir");
    }
}

class YaziciProcess {
    FonksiyonelYazici fy;
    FonksiyonelTara ft;

    public YaziciProcess(FonksiyonelYazici yazici, FonksiyonelTara tara) {
        fy = yazici;
        ft = tara;
    }

    public void yazdir() {
        fy.yazdir();
    }

    public void tara() {
        ft.tara();
    }
}
