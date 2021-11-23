package zooAnimales;
import gestion.Zona;

public class Animal {
	public static int totalAnimales;
	public String nombre;
	public int edad;
	public String habitat;
	public String genero;
	public Zona[] zona;
	
	
	
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales++;
	}
	public Animal() {
		//Animal.totalAnimales++;
	}
	
	public static String totalPorTipo(){
		return	"Mamiferos: " + (Mamifero.getMamiferos().size() ) + '\n' +  "Aves: " + (Ave.getAves().size()) + '\n' + "Reptiles: " + (Reptil.getReptiles().size()) + '\n' + "Peces: " + (Pez.getPeces().size()) + '\n' +"Anfibios: " +  (Anfibio.getAnfibios().size());
	
	}
	
	
	public String movimiento() {
		return "desplazarse";
	}
	
	

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String toString() {
		if(zona != null) {			
			return "Mi nombre es "  + nombre +  ", tengo una edad d, " + edad + ", habito en " + habitat +" y mi genero es " + genero + ", la zona en la que me ubico es " + zona[0].getNombre() + ", en el " + (zona[0].getZoo()).getNombre();
		}
		else {
			return "Mi nombre es "  + nombre +  ", tengo una edad de " + edad + ", habito en " + habitat +" y mi genero es " + genero;
		}
	
	}
	
	
}
