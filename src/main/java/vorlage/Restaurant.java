package vorlage;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Gericht> speisekarte;
    private List<Bestellung> bestellungen;

    public Restaurant() {
    	this.speisekarte = new ArrayList<>(); // Initialize speisekarte
        this.bestellungen = new ArrayList<>(); // Initialize bestellungen
    }
    // Methoden zur Verwaltung von Gerichten und Bestellungen
    public void bestellungAufnehmen(Bestellung bestellung) {
        // Implementierung
    	bestellungen.add(bestellung);
    	
    }
    public void bestellungEntfernen(Bestellung bestellung) {
    	bestellungen.remove(bestellung);
    }
    public List<Bestellung> getBestellungen(){
    	return this.bestellungen;
    }

    public void gerichtHinzufuegen(Gericht gericht) {
        // Implementierung
    	speisekarte.add(gericht);
    }

}