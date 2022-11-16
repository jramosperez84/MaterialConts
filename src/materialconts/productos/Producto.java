package materialconts.productos;

public abstract class Producto {
	
	protected int identificador;
	protected String nombre;
	protected String tipo;
	protected float anchura;
	protected float altura;
	protected float profundidad;
	
	public Producto (int identificador, String nombre, String tipo, float anchura, float altura, float profundidad) {
		setIdentificador(identificador); 
		this.nombre = nombre;
		this.tipo = tipo;
		this.anchura = anchura;
		this.altura = altura;
		this.profundidad = profundidad;
	}

	// GETTERS Y SETTERS
	
	public int getIdentificador() {
		return identificador;
	}


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	abstract public String mostrarInfo(); // Metodo para mostrar info

}
