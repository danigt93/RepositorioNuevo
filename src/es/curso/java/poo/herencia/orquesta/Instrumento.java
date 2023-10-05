package es.curso.java.poo.herencia.orquesta;

public abstract class Instrumento {

	private String nombre;
	private String tipo;
	
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	//hacer los metodos
	
	public void afinar() {
		System.out.println("Afinando instrumento " + this.nombre);
		
	}
	
	public void tocar() {
		System.out.println("Tocando instrumento " + this.nombre);
	}


	@Override
	public String toString() {
		return "Instrumento [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (tipo != null ? "tipo=" + tipo : "") + "]";
	}
	
}
