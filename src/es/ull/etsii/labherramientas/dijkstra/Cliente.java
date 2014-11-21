package es.ull.etsii.labherramientas.dijkstra;

import java.util.List;

public class Cliente {

	private static Dijkstra algoritmo = new Dijkstra();
	
	public static void main(String[] args) 
	{
		Vertice v0 = new Vertice("SantaCruz");
		Vertice v1 = new Vertice("LaLaguna");
		Vertice v2 = new Vertice("Tacoronte");
		Vertice v3 = new Vertice("Candelaria");
		Vertice v4 = new Vertice("Guimar");

		v0.adjacencies = new Arista[]{ new Arista(v1, 10), new Arista(v2, 24), new Arista(v3, 16) };
		v1.adjacencies = new Arista[]{ new Arista(v0, 10), new Arista(v2, 14), new Arista(v4, 40) };
		v2.adjacencies = new Arista[]{ new Arista(v0, 24), new Arista(v1, 14) };	
		v3.adjacencies = new Arista[]{ new Arista(v0, 16), new Arista(v4, 24) };
		v4.adjacencies = new Arista[]{ new Arista(v1, 40), new Arista(v3, 24) };
		Vertice[] vertices = { v0, v1, v2, v3, v4 };
		
        algoritmo.computePaths(v0);
        for (Vertice v : vertices)
        {
		    System.out.println("Distancia hasta " + v + ": " + v.minDistance);
		    List<Vertice> path = algoritmo.getShortestPathTo(v);
		    System.out.println("Ruta: " + path);
        }
	}

}
