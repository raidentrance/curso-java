package com.devs4j.curso.db.model;

public class Author {
	private Integer id;
	private String name;
	private String twitter;

	public Author() {
	}

	public Author(Integer id, String name, String twitter) {
		this.id = id;
		this.name = name;
		this.twitter = twitter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", twitter=" + twitter + "]";
	}

}
