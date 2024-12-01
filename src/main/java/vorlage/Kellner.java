package vorlage;

public class Kellner extends Person {
    private int mitarbeiterID;
	public Kellner(String name, int mitarbeiterID) throws Exception {
		super(name);
		
		this.mitarbeiterID = mitarbeiterID;
	}

    // Konstruktor, Getter und Setter
	public int getmitarbeiterID() {
		return this.mitarbeiterID;
		
	}
	public String getName() {
		return this.name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setID(int mitarbeiterID) {
		this.mitarbeiterID=mitarbeiterID;
	}
}