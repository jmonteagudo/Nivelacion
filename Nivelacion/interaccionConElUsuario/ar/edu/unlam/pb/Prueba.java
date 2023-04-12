package ar.edu.unlam.pb;

public class Prueba {

	public static void main(String[] args) {

		Alumno actual = new Alumno();
		
		// Verifico que si el alumno aprobó se calcule correctamente
		actual.setNotaPrimerParcial(10);
		actual.setNotaSegundoParcial(10);
		actual.setCantidadAsistencias(50);
		actual.aprobo();
		
		// Verifico que si el alumno NO aprobó se calcule correctamente
		actual.setNotaPrimerParcial(2);
		actual.setNotaSegundoParcial(2);
		actual.setCantidadAsistencias(50);
		actual.aprobo();

	}

}
