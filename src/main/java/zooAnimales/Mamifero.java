package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	
	

	
	public Mamifero( String nombre, int edad, String habitat, String genero,boolean pelaje,int patas) {
		super.nombre=nombre;
		super.edad=edad;
		super.habitat=habitat;
		super.genero=genero;
		this.pelaje = pelaje;
		this.patas = patas;
		Animal.totalAnimales++;
		listado.add(this);
	}
	public Mamifero() {
		listado.add(this);
	}
	

	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad,"praderas",genero,true,4);
	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad,"selva",genero,true,4);
	}
	
	public static ArrayList<Mamifero> getListado() {
	return listado;

	}

	public boolean isPelaje() {
		return pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
