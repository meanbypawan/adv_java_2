package model;

public class Review {
	private int id;
	private int rating;
	private String comment;
	private String date;
	private String reviewerName;
	private String reviewerEmail;
	private int productId;

	public Review(int id, int rating, String comment, String date, String reviewerName, String reviewerEmail,
			int productId) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.date = date;
		this.reviewerName = reviewerName;
		this.reviewerEmail = reviewerEmail;
		this.productId = productId;
	}

	public Review(int rating, String comment, String date, String reviewerName, String reviewerEmail, int productId) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.date = date;
		this.reviewerName = reviewerName;
		this.reviewerEmail = reviewerEmail;
		this.productId = productId;
	}

	public Review() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public String getReviewerEmail() {
		return reviewerEmail;
	}

	public void setReviewerEmail(String reviewerEmail) {
		this.reviewerEmail = reviewerEmail;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}
