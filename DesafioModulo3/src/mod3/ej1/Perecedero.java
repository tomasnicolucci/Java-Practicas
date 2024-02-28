package mod3.ej1;

public class Perecedero extends Producto{
	private final double DTO = 0.3;
	private int diasPorVencer;
	
	public Perecedero(String descripcion, double precio, int cantInventario, int diasPorVencer) {
		super(descripcion, precio, cantInventario);
		this.diasPorVencer = diasPorVencer;
	}

	@Override
	public double getPrecioInventario() {
		double precio = super.getPrecioInventario();
		if(diasPorVencer < 10) {
			precio -= precio*DTO;
		}
		return precio;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
