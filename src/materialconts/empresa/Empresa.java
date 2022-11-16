package materialconts.empresa;

import materialconts.edificios.Edificio;
import materialconts.productos.Producto;
import materialconts.vehiculos.Vehiculo;

public class Empresa {
	
	protected Vehiculo vehiculo1;
	protected Vehiculo vehiculo2;
	protected Edificio edificio1;
	protected Edificio edificio2;
	protected Edificio edificio3;
	protected Producto producto1;
	protected Producto producto2;
	protected Producto producto3;
	protected Producto producto4;
	
	public Empresa() {
		
		this.vehiculo1 = null;
		this.vehiculo2 = null;
		this.edificio1 = null;
		this.edificio2 = null;
		this.edificio3 = null;
		this.producto1 = null;
		this.producto2 = null;
		this.producto3 = null;
		this.producto4 = null;
		
	}
	
	// GETTERS Y SETTERS
	
	public Vehiculo getVehiculo1() {
		return vehiculo1;
	}


	public void setVehiculo1(Vehiculo vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}

	public Vehiculo getVehiculo2() {
		return vehiculo2;
	}


	public void setVehiculo2(Vehiculo vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}


	public Edificio getEdificio1() {
		return edificio1;
	}


	public void setEdificio1(Edificio edificio1) {
		this.edificio1 = edificio1;
	}


	public Edificio getEdificio2() {
		return edificio2;
	}


	public void setEdificio2(Edificio edificio2) {
		this.edificio2 = edificio2;
	}


	public Edificio getEdificio3() {
		return edificio3;
	}


	public void setEdificio3(Edificio edificio3) {
		this.edificio3 = edificio3;
	}


	public Producto getProducto1() {
		return producto1;
	}


	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}


	public Producto getProducto2() {
		return producto2;
	}


	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}


	public Producto getProducto3() {
		return producto3;
	}


	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}


	public Producto getProducto4() {
		return producto4;
	}


	public void setProducto4(Producto producto4) {
		this.producto4 = producto4;
	}

	// METODOS
	
	//Metodo mostrar info
	public String mostrarInfo() {
		
		StringBuilder sb = new StringBuilder();

		if (null == vehiculo1) 
			sb.append("La empresa no tiene vehículo 1")
				.append("\n");
		else
			sb.append("Vehiculo1: " + vehiculo1.mostrarInfo())
				.append("\n");
		
		if (null == vehiculo2) 
			sb.append("La empresa no tiene vehículo 2")
			.append("\n");
		else
			sb.append("Vehiculo2: " + vehiculo2.mostrarInfo())
			.append("\n");
		
		if (null == edificio1) 
			sb.append("La empresa no tiene edificio 1")
				.append("\n");
		else
			sb.append("Edificio1: " + edificio1.mostrarInfo())
				.append("\n");
		
		if (null == edificio2) 
			sb.append("La empresa no tiene edificio 2")
			.append("\n");
		else
			sb.append("Edificio2: " + edificio2.mostrarInfo())
			.append("\n");
		
		if (null == edificio3) 
			sb.append("La empresa no tiene edificio 3")
			.append("\n");
		else
			sb.append("Edificio3: " + edificio3.mostrarInfo())
			.append("\n");
				
		if (null == producto1) 
			sb.append("La empresa no tiene producto 1")
			.append("\n");
		else
			sb.append("Producto1: " + producto1.mostrarInfo())
			.append("\n");
		
		if (null == producto2) 
			sb.append("La empresa no tiene producto 2")
				.append("\n");
		else
			sb.append("Producto2: " + producto2.mostrarInfo())
				.append("\n");
		
		if (null == producto3) 
			sb.append("La empresa no tiene producto 3")
			.append("\n");
		else
			sb.append("Producto3: " + producto3.mostrarInfo())
			.append("\n");
		
		if (null == producto4) 
			sb.append("La empresa no tiene producto 4")
			.append("\n");
		else
			sb.append("Producto4: " + producto4.mostrarInfo())
			.append("\n");

		return sb.toString();
	}
		
}
