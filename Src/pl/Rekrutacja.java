package pl.piotrkepisty.punkt;
import java.util.ArrayList;

public class Rekrutacja {
    static int doswiadczenie;
    private ArrayList<Kandydet> nowy = new ArrayList<Kandydet>();

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = 2;
    }

    public static int getDoswiadczenie() {
        return doswiadczenie;
    }
}
