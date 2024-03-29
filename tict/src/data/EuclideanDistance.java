package data;


public class EuclideanDistance implements DistanceI {
	private int numberOfDimensions=2;
	
	public EuclideanDistance(int numberOfDimensions) {
		this.numberOfDimensions=numberOfDimensions;
	}
	
	/*
	 * Calcola la distanza spaziale tra due sensori 
	 * sqrt((x1-x2)^2 + (y1-y2)^2)
	 */
	public Double compute(SensorPoint p1, SensorPoint p2) {
		// TODO Auto-generated method stub
		double d=0;
		for(int i=0;i<numberOfDimensions;i++)
			d+=Math.pow((Double)(p1.getMeasure(i).getValue())-(Double)(p2.getMeasure(i).getValue()), 2);
		return Math.sqrt(d);
	}


}
