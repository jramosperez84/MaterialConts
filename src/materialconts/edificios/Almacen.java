package materialconts.edificios;

public class Almacen extends Edificio {
	
	public Almacen(float anchura, float altura, float profundidad, String tipo) {
		super(anchura, altura, profundidad, tipo);
	}
	
	// GETTERS Y SETTERS
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//METODOS
	
	// Funcionalidad edificio
	public String funcionalidadEdificio() {
		return "En el almacén se guarda el producto para posteriormente venderlo";
	}

	// Función mostrar info
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