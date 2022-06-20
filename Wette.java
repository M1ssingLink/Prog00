package uebung10;

public class Wette {
	// Attribute
	Schnecke schneckenName;
	double wetteinsatz;
	String spielername;

	// Konstruktor
	public Wette(Schnecke name, double einsatz, String spieler) {
		schneckenName = name;
		wetteinsatz = einsatz;
		spielername = spieler;
	}

	// Methoden
	Schnecke getSchnecke() {
		return schneckenName;
	}

	double getEinsatz() {
		return wetteinsatz;
	}

	StringBuilder getSpieler() {
		StringBuilder name = new StringBuilder();
		return name.append(spielername);
	}
	

}
