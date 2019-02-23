package org.marlonaguirre.sistema;

import java.util.ArrayList;
import java.util.List;

import org.marlonaguirre.bean.Book;
import org.marlonaguirre.bean.Magazine;
import org.marlonaguirre.bean.Publicacion;


public class Principal {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		
		Magazine mgz1 = new Magazine();
		String[] autoresl = {"stephen king"};

		String[] autoresm = {"Autor A","Autor B"};
		book1.setTitle("IT");
		book1.setAutores(autoresl);
		book1.setId(1231);
		book1.setReaded(true);
		book1.setTimeReaded(2);
		
		
		mgz1.setId(232);
		mgz1.setTitle("Super Magazine");
		mgz1.setAutores(autoresm);
		mgz1.setEditorial("Editorial1");
	
		List<Publicacion> lista = new ArrayList<Publicacion>();
		
		lista.add(book1);
		lista.add(mgz1);
		
		
		for(Publicacion elemento : lista) {
			if(elemento instanceof Book) {
				System.out.println("LIBRO: "+elemento.toString());
			}else {
				System.out.println("MAGAZINE: "+elemento.toString());
			}
			
		}
		
	}

}
