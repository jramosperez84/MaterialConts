package materialconts.vehiculos;

public class Gasoil extends Vehiculo {

	public Gasoil(String marca, String color, float precio, float peso, float longitud) {
		super(marca, color, precio, peso, longitud);
	}

	//METODOS
	
	//Metodo mostrar info
	@Override
	public String mostrarInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: " + marca + " - ")
				.append("Precio: " + precio + " €" + " - ")
				.append("Peso: " + peso + " kg" + " - ")
				.append("Color: " + color + " - ")
				.append("Longitud: " + longitud + " m");

		return sb.toString();
	}

}
