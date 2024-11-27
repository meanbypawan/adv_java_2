package model;

public class Product {
	private int id;
	private String title;
	private float price;
	private String brand;

	public Product(int id, String title, float price, String brand) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.brand = brand;
	}

	public Product(String title, float price, String brand) {
		super();
		this.title = title;
		this.price = price;
		this.brand = brand;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
