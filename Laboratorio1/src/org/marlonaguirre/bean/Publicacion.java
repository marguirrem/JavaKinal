package org.marlonaguirre.bean;

import java.sql.Date;

public abstract class Publicacion {
	
	private String title;
	private Date editionDate;
	private String editorial;
	private String [] autores;
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getEditionDate() {
		return editionDate;
	}
	
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutores() {
			String autoress="";
			for(String aut : autores) {
				autoress += " "+aut;
			}
		return autoress;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}
	
	
	public abstract String toString();

}
