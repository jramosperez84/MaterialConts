package materialconts.vehiculos;

public class Electrico extends Vehiculo {
	
	protected float potencia;

	public Electrico (String marca, String color, float precio, float peso, float longitud, float potencia) {
		super(marca, color, precio, peso, longitud);
		this.potencia = potencia;
	}
	
	// GETTERS Y SETTERS
	
	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
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
				.append("Longitud: " + longitud + " m" + " - ")
				.append("Potencia: " + potencia + " kwH");

		return sb.toString();
	}

}

