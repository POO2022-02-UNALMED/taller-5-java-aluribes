package zooAnimales;
import java.util.ArrayList; // Para las listas

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
	
    public static int totalAnfibio;

	// Constructores
	
    public Anfibio() {
		this(null, 0, null, null, null, false);
    }  
    
    public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
		totalAnfibio++;
    }

	// Metodos

	public int cantidadAnfibios() {
		//return totalAnfibio;
		return listado.size();
	}

	public String movimiento() {
		return "saltar";
	}
	
    public static Anfibio crearRana(String nombre, int edad, String genero) {
    	ranas++;
    	totalAnfibio++;
    	Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    	listado.add(rana);
    	return rana;
    }

    public static Anfibio crearSalamandra (String nombre, int edad, String genero) {
    	salamandras++;
    	totalAnfibio++;
    	Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro", false);
    	listado.add(salamandra);
    	return salamandra;
    }
	
	// Metodos set y get

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public boolean isVenenoso() {
		return venenoso;
	}
}
