package es.ull.etsii.labherramientas.dijkstra.test;

import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import es.ull.etsii.labherramientas.dijkstra.Vertice;

// Para automatizar el proceso se debe llamar a esta clase desde un cliente
// Se debera crear un constructor que reciba un array de Vertices.
// Cada Test deberá recibir en su constructor el array de Vertices.

@RunWith(Suite.class)
@SuiteClasses({TestDijkstraDesdeSantaCruz.class, TestVertices.class})
public class AllTests 
{
	private ArrayList<Vertice> m_Vertices;
	
	public AllTests()
	{
		m_Vertices = new ArrayList<Vertice>();
	}
	
	
	
	
	
}