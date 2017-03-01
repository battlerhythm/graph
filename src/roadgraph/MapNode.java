package roadgraph;

import java.util.HashSet;
import java.util.Set;

import geography.GeographicPoint;

class MapNode implements Comparable<MapNode>
{
	private HashSet<MapEdge> edges;
	private GeographicPoint location;
	private Double priority;
	private Double distFrom;
	private Double timeFrom;

	MapNode(GeographicPoint loc)
	{
		location = loc;
		edges = new HashSet<MapEdge>();
		priority = Double.POSITIVE_INFINITY;
		distFrom = Double.POSITIVE_INFINITY;
		timeFrom = Double.POSITIVE_INFINITY;
	}

	void addEdge(MapEdge edge)
	{
		edges.add(edge);
	}

	Set<MapNode> getNeighbors()
	{
		Set<MapNode> neighbors = new HashSet<MapNode>();
		for (MapEdge edge : edges) {
			neighbors.add(edge.getOtherNode(this));
		}
		return neighbors;
	}

	GeographicPoint getLocation()
	{
		return location;
	}

	Set<MapEdge> getEdges()
	{
		return edges;
	}
	
	Double getPriority(){
		return priority;
	}
	
	Double getDistFrom(){
		return distFrom;
	}
	
	Double getTimeFrom(){
		return timeFrom;
	}
	
	void setPriority(Double prio){
		priority = prio;
	}
	
	void setDistFrom(Double dist){
		distFrom = dist;
	}
	
	void setTimeFrom(Double time){
		timeFrom = time;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof MapNode) || (o == null)) {
			return false;
		}
		MapNode node = (MapNode)o;
		return node.location.equals(this.location);
	}
	
	@Override
	public int hashCode()
	{
		return location.hashCode();
	}
	
	@Override
	public String toString()
	{
		String toReturn = "[NODE at location (" + location + ")";
		toReturn += " intersects streets: ";
		for (MapEdge e: edges) {
			toReturn += e.getRoadName() + ", ";
		}
		toReturn += "]";
		return toReturn;
	}

	public String roadNamesAsString()
	{
		String toReturn = "(";
		for (MapEdge e: edges) {
			toReturn += e.getRoadName() + ", ";
		}
		toReturn += ")";
		return toReturn;
	}

	@Override
	public int compareTo(MapNode o) {
		// TODO Auto-generated method stub
		
		if (this.priority >= o.priority){
			return 1;
		}
		else{
			return -1;
		}
	}
	

}
