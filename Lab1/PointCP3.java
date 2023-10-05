

/**
 * This class contains instances of coordinates in the polar format.
 * This class is based on the implementation of PointCP from the text book:
 * "Object Oriented Software Engineering" and is issued under the open-source
 */
public class PointCP3 extends PointCP5
{

	

	//Constructors ******************************************************
	
	/**
	* Constructs a coordinate object, with a type identifier.
	*/
	public PointCP3(double x, double y)
	{
		  super(x,y);
	}
		
	
	//Instance methods **************************************************
	
	public double getX(){
		
		return xOrRho;
	}
	
	public double getY(){
		
		return yOrTheta;
	}
	
	public double getRho(){
		
		return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
	
	}
	
	public double getTheta(){
		
		return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
	}
		
	@Override
	public PointCP5 convertStorageToPolar() {
		
		//Calculate RHO and THETA
		double temp = getRho();
		yOrTheta = getTheta();
		xOrRho = temp;
		
		return this; 
	}
	
	
	@Override
	public PointCP5 convertStorageToCartesian() {
		
		
		return this; // returns itself because it's already in cartesian
	}


	
	
	/**
	* Returns information about the coordinates.
	*
	* @return A String containing information about the coordinates.
	*/
	public String toString(){
		return "Stored as Cartesian (" + getX() + "," + getY() + ")\n";
	}
}
