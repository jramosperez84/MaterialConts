package materialconts.vehiculos;

public abstract class Vehiculo {
	
	protected String marca;
	protected String color;
	protected float precio;
	protected float peso;
	protected float longitud;
	
	public Vehiculo(String marca, String color, float precio, float peso, float longitud) {
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.longitud = longitud;
	}

	// GETTERS Y SETTERS
	
	public String getMarca() {
		return marca;
	}


	
	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
	}



	public float getLongitud() {
		return longitud;
	}



	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	// METODOS

	abstract public String mostrarInfo(); //Metodo abstracto mostrar info

}