package es.ull.etsii.labherramientas.dijkstra;

public class Vertice implements Comparable<Vertice>
{
	public final String name;
    public Arista[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertice previous;
    public Vertice(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertice other)
    {
        return Double.compare(minDistance, other.minDistance);
    }
}
