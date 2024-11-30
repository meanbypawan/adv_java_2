package model;

public class Category {
	private int id;
	private String name;
	private String slug;
	private String url;

	public Category(int id, String name, String slug, String url) {
		super();
		this.id = id;
		this.name = name;
		this.slug = slug;
		this.url = url;
	}

	public Category(String name, String slug, String url) {
		super();
		this.name = name;
		this.slug = slug;
		this.url = url;
	}

	public Category() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
