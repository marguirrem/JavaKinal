package org.marlonaguirre.bean;

public class Magazine extends Publicacion {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String msg = "ID "+ id + " Title: "+ this.getTitle() +" Autores "+this.getAutores();
		return msg;
	}
	
	
	
}
