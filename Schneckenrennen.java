package uebung10;

public class Schneckenrennen {

	public static void main(String[] args) {

		// Schnecken erstellen
		Schnecke gustaf = new Schnecke("Gustaf", "Weinbergschnecke", 7);
		Schnecke peter = new Schnecke("Peter", "Nacktschnecke", 8);
		Schnecke karla = new Schnecke("Karla", "Bananenschnecke", 9);

		// Rennen erstellen
		Rennen Kiel = new Rennen("Kieler Schneckenrennen", 3, 25);

		// Wettbuero erstellen
		Wettbuero tipico = new Wettbuero(Kiel, 3);

		// Wetten abgeben und annehmen
		Wette ben = new Wette(peter, 1000, "ben");
		Wette andi = new Wette(gustaf, 250, "andi");
		Wette klaus = new Wette(karla, 500, "klaus");
		tipico.wetteAnnehmen(ben);
		tipico.wetteAnnehmen(andi);
		tipico.wetteAnnehmen(klaus);
		

		// Schnecken dem Rennen hinzufügen
		Kiel.addSchnecke(gustaf);
		Kiel.addSchnecke(peter);
		Kiel.addSchnecke(karla);

		// Alle Renndaten ausgeben
		Kiel.alleRenndaten();
		// Starte Rennen
		Kiel.starteRennen();
		// Alle Renndaten nach Durchführung des Rennens
		Kiel.alleRenndaten();
		// Gewinner des Rennens
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
				+ "Der Gewinner des Rennens ist " + Kiel.ermittleGewinner().getName() + "!!!\n");
		// Wette gewonnen?
		
		tipico.wetteErgebnis();
	}

}