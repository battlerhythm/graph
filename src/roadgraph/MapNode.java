package roadgraph;

import java.util.ArrayList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode {
	private GeographicPoint location;
	private List<MapEdge> edges;
	

	
	public MapNode(){
		super();
		this.location = null;
		this.edges = null;
	}
	
	public MapNode(GeographicPoint loc){
		this.location = loc;
		this.edges = new ArrayList<MapEdge>();
	}
	
	public MapNode(GeographicPoint loc, List<MapEdge> listOfEdges){
		this.location = loc;
		this.edges = listOfEdges;
	}
	
	public GeographicPoint getLocation(){
		return this.location;
	}
	
	public List<MapEdge> getEdges(){
		return this.edges;
	}
	
	
	

}
