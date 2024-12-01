package vorlage;

public abstract class Person {
	protected String name;



	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Person(String Name) throws Exception{
		if (Name.length() < 5) {
			throw new Exception("Der name ist zu kurz bitte langen namen verwenden");
			
		}else {
			this.name=Name;
		}
	}

}

