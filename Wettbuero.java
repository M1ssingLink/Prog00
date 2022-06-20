package uebung10;

import java.util.ArrayList;

public class Wettbuero{
    //Attribute
    static Rennen schneckenRennen;
    static ArrayList<Wette> wettListe = new ArrayList<Wette>();
    static double wettFaktor;
   
    //Konstruktor
    Wettbuero(Rennen name, double faktor){
        schneckenRennen = name;
        wettFaktor = faktor;
    }
    //Methoden
     void wetteAnnehmen(Wette neueWette){                                        //Wette annehmen
        Wettbuero.wettListe.add(neueWette);       
    }
    void wetteErgebnis(){                                                        //Wurde Wette gewonnen?
        for(Wette bet : wettListe){
            if (bet.getSchnecke().equals(schneckenRennen.ermittleGewinner())){
                StringBuilder wette = new StringBuilder();
                wette = wette.append(bet.getSpieler());
                wette = wette.append(" hat die Wette gewonnen und erhält: ");
                wette = wette.append(bet.getEinsatz()*wettFaktor);
                wette = wette.append(" Euro.");
                System.out.println(wette);
            } else {
                StringBuilder wette = new StringBuilder();
                wette = wette.append(bet.getSpieler());
                wette = wette.append(" hat die Wette verloren und damit auch: " + bet.getEinsatz() + " Euro" );
                System.out.println(wette);
            }
           
        };
    }
   
}