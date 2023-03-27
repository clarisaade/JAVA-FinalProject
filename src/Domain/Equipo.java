package Domain;

//Clase para definir los equipos del torneo
public class Equipo {
	
	private String nombre;
	
	private String descripcion;
	
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.descripcion = null;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String unaDescripcion) {
		this.descripcion = unaDescripcion;
	}

}
