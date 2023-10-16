package es.curso.java.colecciones;

import java.util.ArrayList;

import es.curso.java.poo.ejercicios.hospital.Persona;


public class PruebaListas {

	
	public static void main(String[] args) {
		
		ArrayList lista1 = new ArrayList();
		
		lista1.add("Rojo");
		lista1.add("Azul");
		lista1.add(1);
		lista1.add(new Persona(123,"Juan",23));
		
		for (Object object : lista1) {
			System.out.println(object);
			if (object instanceof Persona) {
				Persona p = (Persona)object;
				System.out.println(p.getNombre());
			}
			
		} 
		
	}
}
