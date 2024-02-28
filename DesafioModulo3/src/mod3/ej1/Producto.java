package mod3.ej1;

public abstract class Producto {
	private String descripcion;
	private double precio;
	private int cantInventario;
	
	public Producto(String descripcion, double precio, int cantInventario) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantInventario = cantInventario;
	}
	
	public double getPrecioInventario() {
		return precio*cantInventario;
	}

	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", precio=" + getPrecioInventario() + ", cantInventario=" + cantInventario
				+ "]";
	}
	
	
	
}
