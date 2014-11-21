package es.ull.etsii.labherramientas.dijkstra.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import es.ull.etsii.labherramientas.dijkstra.Vertice;

public class TestVerticeNew 
{
	private Vertice v1;
	private Vertice v2;
		
	@Before
	public void antesDelTest() {
		
		v1 = new Vertice("SantaCruz");
		v2 = new Vertice("LaLaguna");
	}

	@After
	public void despuesDelTest() {
		/**
		 * La etiqueta @After es la antítesis de @Before.
		 * Simplemente este metodo se ejecutara despues de
		 * ejecutar todos los tests de esta clase.
		 */
	}

	@Test
	public void testVertices() 
	{	
		assertTrue(v1.compareTo(v2) == 0);
	}
}
