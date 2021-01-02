package org.exadel.todos.model;

public class Message {
	private String id;
	private String author;
	private String content;

	public Message(String id, String author, String content) {
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Message{" +
				"id='" + id + '\'' +
				", author='" + author + '\'' +
				", content='" + content + '\'' +
				'}';
	}

}
