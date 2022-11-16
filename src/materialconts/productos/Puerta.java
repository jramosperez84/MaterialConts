package materialconts.productos;

public class Puerta extends Producto {

	public Puerta(int identificador, String nombre, String tipo, float anchura, float altura, float profundidad) {
		super(identificador, nombre, tipo, anchura, altura, profundidad);
	}
	
	// METODOS
	
	// Metodo para mostrar información
	@Override
	public String mostrarInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Identificador: "+ identificador + " - ")
				.append("Nombre: " + nombre + " - ")
				.append("Tipo: " + tipo + " - ")
				.append("Anchura: " + anchura + " m" + " - ")
				.append("Altura: " + altura + " m" + " - ")
				.append("Profundidad: " + profundidad + " m");

		return sb.toString();
	}

}