package ar.edu.unlam.pb;

public class Alumno {
	// Atributos (Describen el estado del objeto)
	private int notaPrimerParcial;
	private int notaSegundoParcial;
	private int dni;
	private int cantidadAsistencias;
	private String nombre;
	
	private final int NOTA_MINIMA_PARA_APROBAR = 4;
	private final int NOTA_MINIMA_PARA_PROMOCIONAR = 7;
	private final int CANTIDAD_DE_ASISTENCIAS_MINIMA = 22;
	
	// Constructor
	public Alumno() {
		notaPrimerParcial = 0;
		notaSegundoParcial = 0;
		dni = 0;
		cantidadAsistencias = 0;
	}
	
	public Alumno(int dni) {
		this.notaPrimerParcial = 0;
		this.notaSegundoParcial = 0;
		this.dni = dni;
		this.cantidadAsistencias = 0;
	}
	
	public Alumno(String nombre) {
		this.notaPrimerParcial = 0;
		this.notaSegundoParcial = 0;
		this.dni = 0;
		this.cantidadAsistencias = 0;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public int getDni() {
		return dni;
	}
	
	public int getNotaPrimerParcial() {
		return notaPrimerParcial;
	}

	public void setNotaPrimerParcial(int notaPrimerParcial) {
		if(notaPrimerParcial>=0 &&notaPrimerParcial<=10) {
			this.notaPrimerParcial = notaPrimerParcial;	
		}
	}

	public int getNotaSegundoParcial() {
		return notaSegundoParcial;
	}

	public void setNotaSegundoParcial(int notaSegundoParcial) {
		if(notaSegundoParcial>=0 &&notaSegundoParcial<=10) {
			this.notaSegundoParcial = notaSegundoParcial;	
		}
	}

	public int getCantidadAsistencias() {
		return cantidadAsistencias;
	}

	public void setCantidadAsistencias(int cantidadAsistencias) {
		this.cantidadAsistencias = cantidadAsistencias;
	}

	// Comportamiento
	public boolean aprobo() {
		if(notaPrimerParcial>=NOTA_MINIMA_PARA_APROBAR && notaSegundoParcial>=NOTA_MINIMA_PARA_APROBAR && cantidadAsistencias >= CANTIDAD_DE_ASISTENCIAS_MINIMA) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean desaprobo() {
		boolean resultado = false;
		
		if(this.notaPrimerParcial<NOTA_MINIMA_PARA_APROBAR||this.notaSegundoParcial<NOTA_MINIMA_PARA_APROBAR||this.cantidadAsistencias<CANTIDAD_DE_ASISTENCIAS_MINIMA) {
			resultado = true;
		}
	
		return resultado;
	}

	public boolean promociono() {
		boolean resultado = false;
		
		if(this.notaPrimerParcial>=NOTA_MINIMA_PARA_PROMOCIONAR && this.notaSegundoParcial>=NOTA_MINIMA_PARA_PROMOCIONAR && this.cantidadAsistencias>=CANTIDAD_DE_ASISTENCIAS_MINIMA) {
			resultado = true;
		}
	
		return resultado;
	}
	
	
}
