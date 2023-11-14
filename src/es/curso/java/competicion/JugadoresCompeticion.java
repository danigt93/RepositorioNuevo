package es.curso.java.competicion;

public class JugadoresCompeticion {

	private String nombre;
	private int edad;
	private String posicion;
	
	

	public JugadoresCompeticion(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}



	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	@Override
	public String toString() {
		return "JugadoresCompeticion [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "edad=" + edad + ", "
				+ (posicion != null ? "posicion=" + posicion : "") + "]";
	}
	
	
}
