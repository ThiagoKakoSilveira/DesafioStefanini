package model;

public class Products {
	
	private int id, quantity;
	private double price;
	
	public Products(int id_product, int quant_product, double price_product) {
		id = id_product;
		quantity = quant_product;
		price = price_product;
	}
	public Products(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
