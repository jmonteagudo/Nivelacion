package ar.edu.unlam.pb;

import java.util.Scanner;

public class PruebaAlumnos {

	public static void main(String[] args) {
		Alumno actual;
		Scanner teclado = new Scanner(System.in);
		
		actual = new Alumno();
		
		Alumno listaDeAlumnos[] = new Alumno[100];
		
		do {
			System.out.println("Ingrese dni");
			actual.setDni(teclado.nextInt());
			System.out.println("ingrese el nombre");
			actual.setNombre(teclado.next());
			System.out.println("Ingrese la nota del primer parcial");
			actual.setNotaPrimerParcial(teclado.nextInt());
			System.out.println("Ingrese la nota del segundo parcial");
			actual.setNotaSegundoParcial(teclado.nextInt());
			System.out.println("Ingrese la cantidad de asistencias");
			actual.setCantidadAsistencias(teclado.nextInt());
			actual.aprobo();
			/*if(actual.aprobo()) {
				System.out.println("Felicitaciones");
			}
			else {
				System.out.println("Fuerza, a no bajar los brazos");
			}*/
			
			System.out.println("La nota del primer parcial " + actual.getNotaPrimerParcial());
			// guardo en la posición del array que corresponda
		} while(true);// decida finalizar
	}

}
