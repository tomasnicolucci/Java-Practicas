package mod3.ej2;

public class TarjetaCredito extends Producto{

	private String claveSeguridad;
	
	public TarjetaCredito(int banco, int sucursal, String claveSeguridad) {
		super(banco, sucursal);
		this.claveSeguridad = claveSeguridad;
	}
}
