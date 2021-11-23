package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	public ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	
	
	
	
	
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;

	}
	public Zoologico() {
	}
	
	
	public int cantidadTotalAnimales() {
		int total=0;
		Animal lista[];
		for(Zona z:zonas) {
			total+=z.getAnimales().size();
		}
		return total;
		
	}
	
	public void agregarZonas(Zona z) {
		this.zonas.add(z);
	}
	
	
	
	public ArrayList<Zona> getZona(){
		return zonas;
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

	
}
