package ch.stockmanager.types;

public class Supplier {
	public int id;
	public String name;
	public String email;
	public int orderFrequency;

	@SuppressWarnings("unused")
	public Supplier() {}

	public Supplier(int id, String name, String email, int orderFrequency) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.orderFrequency = orderFrequency;
	}
}