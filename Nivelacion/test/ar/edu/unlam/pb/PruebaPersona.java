package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaPersona {

	@Test
	public void queCuandoSeInstancieUnaPersonaEsteViva() {
		// Datos de entrada
		Persona actual;
		
		// Ejecuci�n
		actual = new Persona();
		
		// Validaci�n
		assertNotNull(actual);
		assertTrue(actual.estaViva());
	}
	
	@Test
	public void queCuandoSeInstanciaUnaPersonaLaEdadEsCero() {
		// Datos de entrada
		final int EDAD_ESPERADA = 0;
		Persona actual;
		
		// Ejecuci�n
		actual = new Persona();
		
		// Validaci�n
		assertEquals(EDAD_ESPERADA, actual.getEdad());
	}
	
	@Test
	public void queUnaPersonaDe12AniosEsMenorDeEdad() {
		// Datos de entrada
		final int EDAD_ESPERADA = 12;
		Persona actual;
		
		// Ejecuci�n
		actual = new Persona();
		actual.setEdad(EDAD_ESPERADA);
		
		// Validaci�n
		assertEquals(EDAD_ESPERADA, actual.getEdad());
		assertFalse(actual.esMayorDeEdad());
	}
	
	@Test
	public void queSeGenereUnaExcepcion() {
		// Datos de entrada
		Integer arrayDeEnteros[] = new Integer[100];
		
		// Ejecuci�n
		System.out.println(arrayDeEnteros[100]);
		
		// Validaci�n
		//assertFalse(actual.esMayorDeEdad());
	}

}
