package pl.piotrkepisty.punkt;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kandydet> grupa = new ArrayList<Kandydet>(6);

        Kandydet k1 = new Kandydet("Tomek", 20, "licencjat", 2);
        Kandydet k2 = new Kandydet("Adam", 20, "mistrzowie", 2);

        Kandydet k3 = new Kandydet("Ania", 23, "licencjat", 2);
        Kandydet k4 = new Kandydet("Ala", 20, "licencjat", 2);

        Kandydet k5 = new Kandydet("Sebastian", 20, "licencjat", 1);
        Kandydet k6 = new Kandydet("Piotr", 20, "licencjat", 3);

        grupa.add(k1);
        grupa.add(k2);
        grupa.add(k3);
        grupa.add(k4);
        grupa.add(k5);
        grupa.add(k6);

        System.out.println("Nieposortowana grupa: ");
        for(int i=0; i<6;i++){
            System.out.println(grupa.get(i));
        }

        Collections.sort(grupa);

        System.out.println("Posortowana grupa: ");
        for(int i=0; i<6;i++){
            System.out.println(grupa.get(i));
        }

        public static  boolean Qualified(Kandydet k){
            if (k1.getLatadoswiadczenia() >= Rekrutacja.getDoswiadczenie())
            {
                return true;
            }
            else return false;
        }

        


    }
}
