package vorlage;

public class Kellner extends Person {
    private int mitarbeiterID;
	public Kellner(String name, int mitarbeiterID) {
		super();
		this.name = name;
		this.mitarbeiterID = mitarbeiterID;
	}

    // Konstruktor, Getter und Setter
	public int getmitarbeiterID() {
		return this.mitarbeiterID;
		
	}
	public String getName() {
		return this.name;
		
	}
	public void SetName(String name) {
		this.name=name;
	}
	public void SetName(String mitarbeiterID) {
		this.mitarbeiterID=mitarbeiterID;
	}
}