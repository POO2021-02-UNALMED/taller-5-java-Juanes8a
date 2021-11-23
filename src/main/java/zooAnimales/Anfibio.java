package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	public String colorPiel;
	private boolean venenoso;
	
	
	
	public Anfibio(String nombre,int edad,String habitat, String genero, String colorPiel, boolean venenoso) {
		
		super.nombre=nombre;
		super.edad=edad;
		super.habitat=habitat;
		super.genero=genero;
		Animal.totalAnimales++;
		
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	public Anfibio() {
		listado.add(this);
	}
	
	
public String movimiento() {
	return "saltar";
}
public static Animal crearRana(String nombre, int edad, String genero) {
	ranas++;
	return new Anfibio(nombre, edad,"selva",genero,"rojo",true);
}
public static Animal crearSalamandra(String nombre, int edad, String genero) {
	ranas++;
	return new Anfibio(nombre, edad,"selva",genero,"negro",false);
}


	public static ArrayList<Anfibio> getListado() {
	return listado;
}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
}
