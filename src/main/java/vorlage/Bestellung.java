package vorlage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bestellung {


	private int bestellnummer;
    private Date bestelldatum;
    private ArrayList<Gericht> gerichte;
    private Kunde kunde;
    private Kellner kellner;
    private double gesamtbetrag;

    public ArrayList<Gericht> getGerichte(){
    	return gerichte;
    }
    
    public int getBestellnummer() {
		return bestellnummer;
	}



	public void setBestellnummer(int bestellnummer) {
		this.bestellnummer = bestellnummer;
	}



	public Date getBestelldatum() {
		return bestelldatum;
	}



	public void setBestelldatum(Date bestelldatum) {
		this.bestelldatum = bestelldatum;
	}



	public Kunde getKunde() {
		return kunde;
	}



	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}



	public Kellner getKellner() {
		return kellner;
	}



	public void setKellner(Kellner kellner) {
		this.kellner = kellner;
	}



	public void setGerichte(ArrayList<Gericht> gerichte) {
		this.gerichte = gerichte;
	}



	public void setGesamtbetrag(double gesamtbetrag) {
		this.gesamtbetrag = gesamtbetrag;
	}

    

    public double getGesamtbetrag() {
    	gesamtbetragBerechnen();
		return gesamtbetrag;
	}

	public void gerichtHinzufuegen(Gericht gericht) {
		gerichte.add(gericht);
		
    }

    public void gesamtbetragBerechnen() {
    	for(Gericht i: gerichte) {
    		double preis=i.getPreis();
    		gesamtbetrag = gesamtbetrag+preis;
    	}
    }


	public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde, Kellner kellner) {
		super();
		this.bestellnummer = bestellnummer;
		this.bestelldatum = bestelldatum;
		this.gerichte = new ArrayList<Gericht>();
		this.kunde = kunde;
		this.kellner = kellner;
	}
}