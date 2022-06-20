package uebung10;

public class Schnecke{
    //Attribute
    String name;
    String race;
    double speed;
    double distance;
    //Konstruktoren
    Schnecke(String name, String race, double speed){
        this.name = name;
        this.race = race;
        this.speed = speed;
        this.distance = 0.0;
    }
    //Methoden
    
    //Lässt Schnecke kriechen
    double krieche(){                                               
        distance += Math.random()*speed;
        return distance;
    }
    String getName(){
        return name;
    }
    String getRasse(){
        return race;
    }
    double getGeschw(){
        return speed;
    }
    double getStrecke(){
        return distance;
    }
   
    //Gibt Daten der Schnecke aus
    String alleDaten(){
        String geschwindigkeitStr = Double.toString(speed);           
        String wegbisherStr = Double.toString(distance);
        String allesSchnecke = name+" " +race+" "
                +geschwindigkeitStr+" "+wegbisherStr;
        return allesSchnecke;
    }
}
