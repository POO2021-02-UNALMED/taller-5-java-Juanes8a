package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	private Ave[] listado;
	private int halcones;
	private int aguilas;
	private String colorPlumas;
	
	
	
	public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona, Ave[] listado,
			int halcones, int aguilas, String colorPlumas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
	}
	public Ave() {
	}
	
	
	
	
	public Ave getListado() {
		return listado;
	}
	public void setListado(Ave listado) {
		this.listado = listado;
	}
	public int getHalcones() {
		return halcones;
	}
	public void setHalcones(int halcones) {
		this.halcones = halcones;
	}
	public int getAguilas() {
		return aguilas;
	}
	public void setAguilas(int aguilas) {
		this.aguilas = aguilas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
}
