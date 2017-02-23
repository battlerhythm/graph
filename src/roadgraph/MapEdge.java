package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
	private GeographicPoint start;
	private GeographicPoint end;
	private String streetName;
	private String streetType;
	private double distance;

	
	public MapEdge(){
		super();
	}
	
	public MapEdge(GeographicPoint from, GeographicPoint to, String roadName,
			String roadType, double length){
		this.start = from;
		this.end = to;
		this.streetName = roadName;
		this.streetType = roadType;
		this.distance = length;
	}
	
	public GeographicPoint getStartPoint(){
		return this.start;
	}

	public GeographicPoint getEndPoint(){
		return this.end;
	}
	
	public String toString(){
		return this.streetName;
	}

}
