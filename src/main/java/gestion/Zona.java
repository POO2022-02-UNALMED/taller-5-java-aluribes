package gestion;
import zooAnimales.*;
import java.util.ArrayList; // Para las listas

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

	// Constructores
	
    public Zona() {
    	this(null, null);
    }
    
    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }
	
	// Metodos set y get

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	// Metodos
	
    public void agregarAnimales(Animal x) {
        animales.add(x);
    }
    public int cantidadAnimales() {
		return animales.size();
	}
}