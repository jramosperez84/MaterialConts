package materialconts.edificios;

public class Fabrica extends Edificio {
	
	public Fabrica(float anchura, float altura, float profundidad, String tipo) {
		super(anchura, altura, profundidad, tipo);
	}
	
	// Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Metodos
	// Funcionalidad edificio
	public String funcionalidadEdificio() {
		return "En la fábrica se crea el producto";
	}

	// Funcion mostrar info
	public String mostrarInfo() {
		StringBuilder sb = new StringBuilder();

		sb.append("Anchura: " + anchura + " m" + " - ")
			.append("Altura: " + altura + " m" + " - ")
			.append("Profundidad: " + profundidad + " m" + " - ")
			.append("Tipo: " + tipo + " - ")
			.append("Funcionalidad: " + funcionalidadEdificio());

		return sb.toString();
	}

}
