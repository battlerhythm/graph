package roadgraph;

import java.util.LinkedList;
import java.util.List;

import geography.GeographicPoint;

class MapEdge 
{
	private String roadName;
	private String roadType;
	private MapNode start;
	private MapNode end;
	private double length;
	static final double DEFAULT_LENGTH = 0.01;
	
	MapEdge(String roadName, MapNode n1, MapNode n2) 
	{
		this(roadName, "", n1, n2, DEFAULT_LENGTH);
	}
	
	MapEdge(String roadName, String roadType, MapNode n1, MapNode n2) 
	{
		this(roadName, roadType, n1, n2, DEFAULT_LENGTH);
	}
	
	MapEdge(String roadName, String roadType,
			MapNode n1, MapNode n2, double length) 
	{
		this.roadName = roadName;
		start = n1;
		end = n2;
		this.roadType = roadType;
		this.length = length;
	}
	
	MapNode getEndNode() {
	   return end;
	}
	
	GeographicPoint getStartPoint()
	{
		return start.getLocation();
	}
	
	GeographicPoint getEndPoint()
	{
		return end.getLocation();
	}
	
	double getLength()
	{
		return length;
	}
	
	public String getRoadName()
	{
		return roadName;
	}

	MapNode getOtherNode(MapNode node)
	{
		if (node.equals(start)) 
			return end;
		else if (node.equals(end))
			return start;
		throw new IllegalArgumentException("Looking for " +
			"a point that is not in the edge");
	}

	@Override
	public String toString()
	{
		String toReturn = "[EDGE between ";
		toReturn += "\n\t" + start.getLocation();
		toReturn += "\n\t" + end.getLocation();
		toReturn += "\nRoad name: " + roadName + " Road type: " + roadType +
				" Segment length: " + String.format("%.3g", length) + "km";
		
		return toReturn;
	}

}
