package org.marlonaguirre.bean;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publicacion {

	private int id;
	
	public Magazine() {
		
	}
	
	public Magazine(String title,Date editionDate,String editorial) {
		this.setTitle(title);
		this.setEditionDate(editionDate);
		this.setEditorial(editorial);
	}
	
	public static ArrayList<Magazine> makeMagazineList(){
		ArrayList<Magazine> lista = new ArrayList<>();
		
		return lista;
	}
	

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
