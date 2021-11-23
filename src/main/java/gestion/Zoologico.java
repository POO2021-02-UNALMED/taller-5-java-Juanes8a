package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zona;
	
	
	
	
	
	
	
	public Zoologico(String nombre, String ubicacion, Zona[] zona) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zona = zona;
	}
	public Zoologico() {
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}
