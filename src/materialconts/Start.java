package materialconts;

import materialconts.edificios.Almacen;
import materialconts.edificios.Edificio;
import materialconts.edificios.Fabrica;
import materialconts.edificios.Oficina;
import materialconts.empresa.Empresa;
import materialconts.productos.Silla;
import materialconts.productos.Producto;
import materialconts.productos.Puerta;
import materialconts.vehiculos.Electrico;
import materialconts.vehiculos.Gasoil;
import materialconts.vehiculos.Vehiculo;

public class Start {
		
	public static void main(String[] args) {
		
		float precioMetro = 30.0f; // Coste de la pintura.

		Empresa empresaOO = new Empresa(); // Nueva empresa
		
		// VEHICULOS
		Vehiculo vehiculo1 = new Electrico("Seat Altea", "Rojo", 20000.0f, 3000.0f, 3.0f, 4000.0f);
		empresaOO.setVehiculo1(vehiculo1);
		
		Vehiculo vehiculo2 = new Gasoil("Renault Kadjar", "Azul", 28000.0f, 4000.0f, 3.5f);
		empresaOO.setVehiculo2(vehiculo2);
		
		// EDIFICIOS
		Edificio edificio1 = new Fabrica(400.0f, 400.0f, 500.0f, "Fabrica");
		empresaOO.setEdificio1(edificio1);
		
		Edificio edificio2 = new Oficina(600.0f, 400.0f, 700.0f, "Oficina");
		empresaOO.setEdificio2(edificio2);
		
		Edificio edificio3 = new Almacen(600.0f, 400.0f, 700.0f, "Almacén");
		empresaOO.setEdificio3(edificio3);
		
		// PRODUCTOS
		Producto producto1 = new Silla (1, "SillaN20", "Silla" , 1.0f, 0.5f, 0.5f);
		empresaOO.setProducto1(producto1);
		
		Producto producto2 = new Silla (2, "SillaM100", "Silla" , 1.5f, 0.5f, 1.5f);
		empresaOO.setProducto2(producto2);
		
		Producto producto3 = new Puerta (3, "Puerta P9", "Puerta" , 1.5f, 2.25f, 0.25f);
		empresaOO.setProducto3(producto3);
		
		Producto producto4 = new Puerta (4, "Puerta P9", "Puerta" , 1.5f, 2.25f, 0.25f);
		empresaOO.setProducto4(producto4);
		
		// Utilización del metodo costePintura, con parametro precioMetro.		
		float coste  = edificio3.costePintura(precioMetro);
		
		// SALIDA
		System.out.println(empresaOO.mostrarInfo());
		System.out.printf("El coste de pintar el almacén es: %,.2f €%n ", coste );
		
	}

}