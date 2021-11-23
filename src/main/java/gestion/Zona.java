package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private static ArrayList<Animal> animales= new ArrayList<Animal>();
	
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);

	}
	public Zona() {
	}


	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public int cantidadAnimales(){
		
		return animales.size();	
		
	}
	
	
	public void agregarAnimales(Animal a) {
		animales.add(a);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Zoologico> getZoo() {
		return zoo;
	}

	
	
}
