package mod3.ej1;

public class NoPerecedero extends Producto{

	public NoPerecedero(String descripcion, double precio, int cantInventario) {
		super(descripcion, precio, cantInventario);
	}

	@Override
	public double getPrecioInventario() {
		return super.getPrecioInventario();
	}
	
}
