
public class Cheese {

	protected String name;
	protected double price;
	protected int amount;

	public static int numCheese = 0;
	
	public Cheese() { // Constructor with no parameters
		name = "";
		price = 0;
		amount = 0;
		numCheese++;
	}

	public Cheese(String name) { // Constructor with name as paramter
		this.name = name;
		price = 0;
		amount = 0;
		numCheese++;
	}

	public Cheese(String name, double price) { // Constructor with 2 parameters
		this.name = name;
		this.price = price;
		amount = 0;
		numCheese++;

	}

	public String getName() { // Accessor
		return name;
	}

	public void setName(String newName) { // Mutator 
		name = newName;
	}

	public double getPrice() {
		// Fix Code
		return price;
	}

	public void setPrice(double newPrice) {
	    price = newPrice;
		// Fill-in Code
	}

	public int getAmount() {
		// Fix Code
		return amount;
	}

	public void setAmount(int newAmount) {
	    amount = newAmount;
		// Fill-in Code
	}
}
