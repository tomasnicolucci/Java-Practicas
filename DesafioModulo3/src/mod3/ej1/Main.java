package mod3.ej1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Producto> productos = new ArrayList<>();
		
		clientes.add(new Cliente("Octavio", "Robleto", new Documento("DNI", "01")));
		productos.add(new Perecedero("Leche", 5.6, 10, 5));
		productos.add(new Perecedero("Queso", 7.6, 11, 10));
		productos.add(new Perecedero("Panceta", 6.6, 2, 51));
		productos.add(new Perecedero("Jamon", 54.6, 4, 15));
		productos.add(new Perecedero("Atun", 57.6, 10, 2));
		productos.add(new Perecedero("Bife de Chorizo", 52.6, 9, 8));
		productos.add(new Perecedero("Tomate", 8.6, 8, 11));
		productos.add(new Perecedero("Cebolla", 596.6, 25, 8));
		productos.add(new Perecedero("Queso Crema", 51.6, 98, 96));
		productos.add(new Perecedero("Hamburguesa", 15.6, 11, 4));
		
		for(Producto producto : productos) {
			System.out.println(producto.toString());
		}

	}

}
