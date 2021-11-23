package zooAnimales;

import java.util.ArrayList;


public class Reptil extends Animal {
	private static ArrayList<Reptil> listado= new ArrayList<Reptil>();
	private static int iguanas;
	private static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		super.nombre=nombre;
		super.edad=edad;
		super.habitat=habitat;
		super.genero=genero;
		this.listado=listado;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Animal.totalAnimales++;
		listado.add(this);
	}
	public Reptil() {
		listado.add(this);
	}
	
	
	public String movimiento() {
		return "reptar";
	}
	
	
	public static Animal crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad,"humedal",genero,"verde",3);
	}
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad,"jungla",genero,"blanco",1);
	}
	
	public static ArrayList<Reptil> getListado() {
	return listado;

	}

	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	

}
