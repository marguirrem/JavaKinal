package org.marlonaguirre.bean;

public class Book extends Publicacion{
	
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isReaded() {
		return readed;
	}
	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	public int getTimeReaded() {
		return timeReaded;
	}
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	@Override
	public String toString() {
		String msg = "Id: "+this.id +" Title: "+this.getTitle() + "Readed "+timeReaded +" Autores "+this.getAutores();
		return msg;
	}
	
	
}
