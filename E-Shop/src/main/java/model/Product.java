package model;

import java.util.ArrayList;

public class Product {
	private int id;
	private String title;
	private String description;
	private String category;
	private float price;
	private float discountPercentage;
	private float rating;
	private int stock;
	private String brand;
	private String warrantyInformation;
	private String shippingInformation;
	private String availabilityStatus;
	private ArrayList<String> images;
	private ArrayList<Review> reviews;
	private String thumbnail;

	public Product(int id, String title, String description, String category, float price, float discountPercentage,
			float rating, int stock, String brand, String warrantyInformation, String shippingInformation,
			String availabilityStatus, ArrayList<String> images, ArrayList<Review> reviews, String thumbnail) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.rating = rating;
		this.stock = stock;
		this.brand = brand;
		this.warrantyInformation = warrantyInformation;
		this.shippingInformation = shippingInformation;
		this.availabilityStatus = availabilityStatus;
		this.images = images;
		this.reviews = reviews;
		this.thumbnail = thumbnail;
	}

	public Product(String title, String description, String category, float price, float discountPercentage,
			float rating, int stock, String brand, String warrantyInformation, String shippingInformation,
			String availabilityStatus, ArrayList<String> images, ArrayList<Review> reviews, String thumbnail) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.rating = rating;
		this.stock = stock;
		this.brand = brand;
		this.warrantyInformation = warrantyInformation;
		this.shippingInformation = shippingInformation;
		this.availabilityStatus = availabilityStatus;
		this.images = images;
		this.reviews = reviews;
		this.thumbnail = thumbnail;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(float discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getWarrantyInformation() {
		return warrantyInformation;
	}

	public void setWarrantyInformation(String warrantyInformation) {
		this.warrantyInformation = warrantyInformation;
	}

	public String getShippingInformation() {
		return shippingInformation;
	}

	public void setShippingInformation(String shippingInformation) {
		this.shippingInformation = shippingInformation;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public ArrayList<String> getImages() {
		return images;
	}

	public void setImages(ArrayList<String> images) {
		this.images = images;
	}

	public ArrayList<Review> getReviews() {
		return reviews;
	}

	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
