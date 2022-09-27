package zooAnimales;
import gestion.*;

public class Animal {
    private static int totalAnimales=0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

	// Constructores

    public Animal() {
        this(null, 0, null, null);
    }   

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

	// Metodos set y get

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Zona getZona() {
		return zona;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public static int getTotalAnimales() {
        return totalAnimales;
    }
	
	// Metodos

	public String movimiento() {
		return "desplazarse";
	}
	
    public static String totalPorTipo() {
    	return "Mamiferos: " + Mamifero.totalMamifero + "\n" +
    			"Aves: " + Ave.totalAve + "\n" +
    			"Reptiles: " + Reptil.totalReptil+ "\n" +
    			"Peces: " + Pez.totalPez + "\n" +
    			"Anfibios: " + Anfibio.totalAnfibio;		
    }

    @Override
    public String toString(){
        if (this.zona==null){
            return "Mi nombre es " + getNombre() +
                    ", tengo una edad de " + getEdad() +
                    ", habito en " + getHabitat() +
                    " y mi genero es " + getGenero();
        }
        else{
            return "Mi nombre es " + getNombre()+
                        ", tengo una edad de " + getEdad() +
                        ", habito en " + getHabitat() +
                        " y mi genero es " + getGenero() +
                        ", la zona en la que me ubico es " + zona.getNombre() +
                        ", en el "+zona.getZoo().getNombre();
        }
    }
    
}