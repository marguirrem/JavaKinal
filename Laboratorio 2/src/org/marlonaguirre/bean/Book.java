package org.marlonaguirre.bean;

import java.util.ArrayList;
import java.util.Date;

import org.marlonaguirre.interfaces.Visualizable;

public class Book extends Publicacion implements Visualizable{
	
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	public Book() {
		
	}
	public Book(int id, String isbn, boolean readed, int timeReaded) {
		this.id = id;
		this.isbn = isbn;
		this.readed =readed ;
		this.timeReaded = timeReaded;	
	}
	
	
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

	
	public static ArrayList<Book> makeBookList(){
		
		ArrayList<Book> lista = new ArrayList<>();
		return lista;
	}
	
	@Override
	public String toString() {
		String msg = "Id: "+this.id +" Title: "+this.getTitle() + "Readed "+timeReaded +" Autores "+this.getAutores();
		return msg;
	}

	@Override
	public void startToSee(Date dateI) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
	}
	
	
}
