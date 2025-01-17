package ch.stockmanager.types;

public class ProductDateQuantity {
	public String name;
	public String date;
	public int quantity;

	public ProductDateQuantity(String name, java.sql.Date date, int quantity) {
		this.name = name;
		this.date = date.toString();
		this.quantity = quantity;
	}
}