package materialconts.vehiculos;

public class Gasolina extends Vehiculo {
	
	protected float contaminacion;
	protected float capacidadDeposito;
	
	public Gasolina (String marca, String color, float precio, float peso, float longitud, float contaminacion, float capacidadDeposito) {
		super(marca, color, precio, peso, longitud);
		this.contaminacion = contaminacion;
		this.capacidadDeposito = capacidadDeposito;
	}
	
	// GETTERS Y SETTERS
	
	public float getContaminacion() {
		return contaminacion;
	}
	
	
	public void setContaminacion(float contaminacion) {
		this.contaminacion = contaminacion;
	}
	
	
	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}
	
	
	public void setCapacidadDeposito(float capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
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
				.append("Contaminación: " + contaminacion + " ppm" + " - ")
				.append("Depósito: " + capacidadDeposito + " l");

		return sb.toString();
	}

}
