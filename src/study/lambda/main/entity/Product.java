package study.lambda.main.entity;

public class Product {
	
	private final String name;
	private final Double price;
	private final Double discount;

	public Product(String name, Double price, Double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Double getDiscount() {
		return discount;
	}
	
}
