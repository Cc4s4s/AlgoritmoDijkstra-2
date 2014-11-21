package es.ull.etsii.labherramientas.dijkstra;

public class Arista 
{
	public final Vertice target;
    public final double weight;
    public Arista(Vertice argTarget, double argWeight)
    { 
    	target = argTarget; weight = argWeight; 
    }
}
