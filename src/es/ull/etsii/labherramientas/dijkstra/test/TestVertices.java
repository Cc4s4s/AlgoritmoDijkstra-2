package es.ull.etsii.labherramientas.dijkstra.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import es.ull.etsii.labherramientas.dijkstra.Vertice;

public class TestVertices 
{
	private Vertice m_Vp1;
	private Vertice m_Vp2;
	private ArrayList<Vertice> m_Vertices;
	
	public TestVertices()
	{
		this.m_Vertices = new ArrayList<Vertice>();
	}
	
	@Before
	public void antesDelTest() {
		
		m_Vp1 = new Vertice("VerticePrueba1");
		m_Vp2 = new Vertice("VerticePrueba2");
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
	public void testVerticesIguales() 
	{		
		assertTrue(m_Vp1.compareTo(m_Vp2) == 0);
	}
	
	@Test
	public void testVerticesIguales2() 
	{		
		assertFalse(m_Vp1.compareTo(m_Vp2) != 0);
	}
	
	@Test
	public void testVerticesDistintos() 
	{	
		Vertice aux = new Vertice("Aux1");
		aux.minDistance = 5;
		assertTrue(m_Vp1.compareTo(aux) != 0);
	}
	
	@Test
	public void testVerticesDistintos2() 
	{
		Vertice aux = new Vertice("Aux1");
		aux.minDistance = 5;
		assertFalse(m_Vp1.compareTo(aux) == 0);
	}
	
}
