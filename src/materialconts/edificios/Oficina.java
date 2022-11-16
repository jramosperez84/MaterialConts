package materialconts.edificios;

public class Oficina extends Edificio {

	public Oficina(float anchura, float altura, float profundidad, String tipo) {
		super(anchura, altura, profundidad, tipo);
	}

	// GETTERS Y SETTERS
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// METODOS
	
	// Funcionalidad edificio
	public String funcionalidadEdificio() {
		return "En la oficina se etiqueta el producto";
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
