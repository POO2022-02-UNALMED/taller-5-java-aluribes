package zooAnimales;
import java.util.ArrayList; // Para las listas

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public static int totalAve;

    // Constructores

    public Ave() {
        this(null, 0, null, null, null);
    }  
    
    public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;

        totalAve++;
    }

    // Metodos

    public int cantidadAves() {
        //return totalAve; 
        return listado.size();
    }

    public String movimiento() {
        return "volar";
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero) {
    	halcones++;
    	totalAve++;
        Ave halcon = new Ave (nombre, edad,"montanas", genero, "cafe glorioso");
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
    	aguilas++;
    	totalAve++;
        Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
        listado.add(aguila);
        return aguila;
    }
    
    // Metodos set y get

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }
    
    public static ArrayList<Ave> getListado() {
		return listado;
	}

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

	public String getColorPlumas() {
        return colorPlumas;
    }
}
