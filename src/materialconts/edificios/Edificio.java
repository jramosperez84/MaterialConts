package materialconts.edificios;

public abstract class Edificio {
	
	protected float coste;
	protected float precioMetro;
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String tipo;

	public Edificio(float anchura, float altura, float profundidad, String tipo) {
		this.anchura = anchura;
		this.altura = altura;
		this.profundidad = profundidad;
		this.tipo = tipo;
	}

	
	// GETTERS Y SETTERS
	
	public float getCoste() {
		return coste;
	}



	public void setCoste(float coste) {
		this.coste = coste;
	}



	public float getPrecioMetro() {
		return precioMetro;
	}



	public void setPrecioMetro(float precioMetro) {
		this.precioMetro = precioMetro;
	}



	public float getAnchura() {
		return anchura;
	}



	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getProfundidad() {
		return profundidad;
	}



	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	// METODOS

	abstract public String mostrarInfo(); // Función abstracta mostrarInfo();
	
	// Metodo para calcular el coste de la pintura.
	public float costePintura(float precioMetro)
	{
		if (precioMetro < 0) {
			return -1.0f;
		}

		return precioMetro * anchura * altura * profundidad;
	}

	// Método sobrecargado para calcular el coste de la pintura
	public float costePintura(String lado, float precioMetro) {
		float coste = 0.0f;
		if (precioMetro < 0) {
			coste = -1.0f;
		}
		if ("ladoanchura".equals(lado)) {
			coste = precioMetro * anchura * altura;
		}
		if ("ladoprofundidad".equals(lado)) {
			coste = precioMetro * altura * profundidad;
		}
		return coste;
	}

	abstract public String funcionalidadEdificio(); // Función abstracta que muestra la funcionalidad del edificio

}

