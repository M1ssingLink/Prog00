package uebung10;

import java.util.ArrayList;

public class Rennen {
	// Attribute
	String title;
	ArrayList<Schnecke> teilnehmer;
	double raceDistance;
	int participantNumber;

	// Konstruktoren
	Rennen(String name, int anzahl, double raceDistance) {
		this.title = name;
		this.participantNumber = anzahl;
		this.raceDistance = raceDistance;
		this.teilnehmer = new ArrayList<Schnecke>();
	}

	// Methoden

	// Fügt Schnecke hinzu
	void addSchnecke(Schnecke neueSchnecke) {
		if (teilnehmer.size() < this.participantNumber) {
			this.teilnehmer.add(neueSchnecke);
		} else {
			System.out.println("Race is full, cant add: " + neueSchnecke.getName());
		}

	}

	// Gibt alle Renndaten aus
	public void alleRenndaten() {
		String weg = Double.toString(raceDistance);
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("Name: " + title + "\tTeilnehmer: " + teilnehmer.size() + "\tStrecke: " + weg
				+ "\n\nRennschnecken:\n"));
		for (Schnecke snail : teilnehmer) {
			StringBuilder sbSchnecken = new StringBuilder();
			System.out.println(sbSchnecken.append(snail.getName() + "\t\tTeam: " + snail.getRasse() + "\tSpeed: "
					+ snail.getGeschw() + "\tStrecke: " + snail.getStrecke() + "\n"));
		}
	}

	// Ermittelt Gewinner
	public Schnecke ermittleGewinner() {
		Schnecke sieger = null;
		for (Schnecke snail : teilnehmer) {
			if (snail.getStrecke() > raceDistance) {
				sieger = snail;
			}
		}
		return sieger;
	}

	// Lässt alle Schnecken kriechen
	public void lasseSchneckenKriechen() {
		for (Schnecke snail : teilnehmer) {
			snail.krieche();
		}
	}

	// Lässt Schnecken kriechen, bis eine im Ziel ist.
	public void starteRennen() {
		while (ermittleGewinner() == null) {
			lasseSchneckenKriechen();
		}
	}
}