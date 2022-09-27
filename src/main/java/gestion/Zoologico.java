package gestion;
import java.util.ArrayList; // Para las listas

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private static ArrayList<Zona> zonas = new ArrayList<Zona>();
   
	// Constructores
	
    public Zoologico() {
    	this(null, null);
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
	
	// Metodos set y get

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public static void setZona(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	// Metodos
	
    public void agregarZonas(Zona x) {
    	zonas.add(x);
    }
	
	public int cantidadTotalAnimales() {
		int Num = 0;
		for(Zona zona :zonas) {
			Num += zona.cantidadAnimales();
		}
		return Num;
	}
}