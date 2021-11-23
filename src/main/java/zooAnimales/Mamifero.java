package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
	private Mamifero[] listado;
	private int caballos;
	private int leones;
	private boolean pelaje;
	private int patas;
	
	
	
	

	
	public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona,
			Mamifero[] listado, int caballos, int leones, boolean pelaje, int patas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	public Mamifero() {
	}
	
	
	
	public Mamifero getListado() {
		return listado;
	}
	public void setListado(Mamifero listado) {
		this.listado = listado;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public int getLeones() {
		return leones;
	}
	public void setLeones(int leones) {
		this.leones = leones;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
