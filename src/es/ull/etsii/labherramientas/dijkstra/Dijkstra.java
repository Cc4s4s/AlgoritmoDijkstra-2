package es.ull.etsii.labherramientas.dijkstra;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Dijkstra 
{
	public static void computePaths(Vertice source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertice> vertexQueue = new PriorityQueue<Vertice>();
      	vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) 
		{
		    Vertice u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Arista e : u.adjacencies)
            {
                Vertice v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) 
                {
                	vertexQueue.remove(v);
                	v.minDistance = distanceThroughU;
                	v.previous = u;
                	vertexQueue.add(v);
                }
            }
        }
    }

    public static List<Vertice> getShortestPathTo(Vertice target)
    {
        List<Vertice> path = new ArrayList<Vertice>();
        for (Vertice vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);
        Collections.reverse(path);
        return path;
    }

    
}


