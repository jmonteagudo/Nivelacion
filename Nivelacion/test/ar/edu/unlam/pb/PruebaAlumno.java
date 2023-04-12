package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaAlumno {

	@Test
	public void queSePuedaAlmacenarLaNotaDelPrimerParcial() {
		// Datos de entrada
		int notaDelPrimerParcial = 7;
		Alumno actual;
		
		// Ejecución
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		
		// Validación
		assertEquals(notaDelPrimerParcial, actual.getNotaPrimerParcial());
	}
	
	@Test
	public void queNoSePuedaAlmacenarMenos7EnElPrimerParcial() {
		// Datos de entrada
		int notaDelPrimerParcial = -7;
		Alumno actual;
		
		// Ejecución
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		
		// Validación
		assertNotEquals(notaDelPrimerParcial, actual.getNotaPrimerParcial());
	}
	
	@Test
	public void queSiSeSaca7Y7EnCadaParcialYTenga25AsistenciasHayaAprobado() {
		// Datos de entrada
		int notaDelPrimerParcial = 7;
		int notaDelSegundoParcial = 7;
		int cantidadDeAsistencias = 25;
		Alumno actual;
		
		// Ejecución
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		actual.setNotaSegundoParcial(notaDelSegundoParcial);
		actual.setCantidadAsistencias(cantidadDeAsistencias);
		
		// Validación
		assertEquals(notaDelPrimerParcial, actual.getNotaPrimerParcial());
		assertEquals(notaDelSegundoParcial, actual.getNotaSegundoParcial());
		assertEquals(cantidadDeAsistencias, actual.getCantidadAsistencias());
		assertTrue(actual.aprobo());
	}
	
	@Test
	public void queSiSeSaca7Y8EnCadaParcialYTenga25AsistenciasHayaAprobado() {
		// Datos de entrada
		int notaDelPrimerParcial = 7;
		int notaDelSegundoParcial = 8;
		int cantidadDeAsistencias = 25;
		Alumno actual;
		
		// Ejecución
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		actual.setNotaSegundoParcial(notaDelSegundoParcial);
		actual.setCantidadAsistencias(cantidadDeAsistencias);
		
		// Validación
		assertEquals(7, actual.getNotaPrimerParcial());
		assertEquals(8, actual.getNotaSegundoParcial());
		assertEquals(25, actual.getCantidadAsistencias());
	}
	
	@Test
	public void queSiSeSaca10Y2EnCadaParcialYTenga25AsistenciasNoHayaAprobado() {
		// Datos de entrada
		int notaDelPrimerParcial = 10;
		int notaDelSegundoParcial = 2;
		int cantidadDeAsistencias = 25;
		Alumno actual;
		
		// Ejecución
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		actual.setNotaSegundoParcial(notaDelSegundoParcial);
		actual.setCantidadAsistencias(cantidadDeAsistencias);
		
		// Validación
		assertFalse(actual.aprobo());
		
		assertNotNull(actual);
		
	}
	
	@Test
	public void queSiSeSaca10Y7YLaAsistenciaEsDe25HayaPromocionado() {
		// Datos de entrada
		int notaDelPrimerParcial = 10;
		int notaDelSegundoParcial = 7;
		int cantidadDeAsistencias = 25;
		Alumno actual;
		
		// Ejecución
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		actual.setNotaSegundoParcial(notaDelSegundoParcial);
		actual.setCantidadAsistencias(cantidadDeAsistencias);
		
		// Validación
		assertFalse(actual.desaprobo());
		assertTrue(actual.aprobo());
		assertTrue(actual.promociono());		
	}
	
	@Test
	public void queSiSeSaca10Y4YLaAsistenciaEsDe25HayaaPROBADO() {
		// Datos de entrada
		int notaDelPrimerParcial = 10;
		int notaDelSegundoParcial = 4;
		int cantidadDeAsistencias = 25;
		Alumno actual;
		
		// Ejecución
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		actual.setNotaSegundoParcial(notaDelSegundoParcial);
		actual.setCantidadAsistencias(cantidadDeAsistencias);
		
		// Validación
		assertFalse(actual.desaprobo());
		assertTrue(actual.aprobo());
		assertFalse(actual.promociono());		
	}



}
