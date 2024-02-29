package mod3.ej2;

public abstract class Producto {
	private static int nroAuto = 0;
	private int banco;
	private int sucursal;
	private int nroProducto;
	
	public Producto(int banco, int sucursal) {
		nroAuto ++;
		this.nroProducto=nroAuto;
		this.banco = banco;
		this.sucursal = sucursal;
	}
	
}
