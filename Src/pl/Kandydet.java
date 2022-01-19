package pl.piotrkepisty.punkt;

public class Kandydet {
    private String nazwa;
    private int wiek;
    private String wyksztalcony;
    private int latadoswiadczenia;

    public Kandydet(String nazwa, int wiek, String wyksztalcony, int latadoswiadczenia){
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public String getWyksztalcony() {
        return wyksztalcony;
    }

    public int getLatadoswiadczenia() {
        return latadoswiadczenia;
    }

    public int compareTo{Kandydet grupa){
        int compare_wyksztalcony = this.wyksztalcony.compareTo(grupa.wyksztalcony);
        if(compare_wyksztalcony==0) {
        }
    }

    public String toString(){
        return nazwa + ", " + wiek + ", "+ wyksztalcony + ", "+ latadoswiadczenia;
        }

}
}


