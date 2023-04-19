package paquetetpn7;

public class Producto {
	private int codigo;
	private String nombre;
	private String desc;
	private double precio;
	private int stock;
	//creo el metodo constructor
	
	public Producto(int cod, String nom, String descripcion, double prec, int stc) {
		codigo = cod;
		nombre = nom;
		desc = descripcion;
		precio = prec;
		stock = stc;	
	}
	public Producto(int cod, String nom, double prec, int stc) {
		codigo = cod;
		nombre = nom;
		desc = " ";
		precio = prec;
		stock = stc;	
	}
	public Producto(String []vector) {
		nombre = vector[0];
		desc = vector[1];
		precio = Double.parseDouble(vector[2]);
		
	}
	// metodos getters para acceder a los valores de los atributos
	public int un_codigo() {
		return codigo;
	}
	public String un_nombre() {
		return nombre;
	}
	public String un_desc() {
		return desc;
	}
	public double un_precio() {
		return precio;
	}
	public int un_stock() {
		return stock;
	}
	

}
