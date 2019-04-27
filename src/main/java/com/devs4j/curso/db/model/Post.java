/**
 * 
 */
package com.devs4j.curso.db.model;

/**
 * @author raidentrance
 *
 */
public class Post {
	private Integer id;
	private String name;
	private String content;
	private String author;

	public Post() {
	}

	public Post(Integer id, String name, String content, String author) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.author = author;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", content=" + content + ", author=" + author + "]";
	}

}
