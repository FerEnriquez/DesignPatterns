public abstract class Beverage{
	String description = "Whatever beverage";

	public String getDescription(){
		return description;
	}

	public abstract double cost();
}