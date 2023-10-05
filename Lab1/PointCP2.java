


/**
 * This class contains instances of coordinates in the polar format.
 * This class is based on the implementation of PointCP from the text book:
 * "Object Oriented Software Engineering" and is issued under the open-source
 */
public class PointCP2 extends PointCP5{


	  //Constructors ******************************************************
	
	  /**
	   * Constructs a coordinate object
	   */
	  public PointCP2(double rho, double theta){
	    
		super(rho, theta);
	  }
	  
		//Instance methods **************************************************
		
		public double getX(){
			// Add your code here...
			return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho); //math to get x from polar form
			
		}
		
		public double getY(){
			// Add your code here...
			return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);// math to get y from polar form
		}
		
		public double getRho(){
			// Add your code here...
			return xOrRho;
		
		}
		
		public double getTheta(){
			// Add your code here...
			return yOrTheta;
		}
	  


	@Override
	public PointCP5 convertStorageToPolar() {
		
		// Add your code here...
		
		return this; //should just return because it's already polar
	}
	
	
	@Override
	public PointCP5 convertStorageToCartesian() {
		
		// Add your code here...
		//Calculate X and Y
		double temp = getX();
		yOrTheta = getY();
		xOrRho = temp;
		
		return this; 
	}


	
	/**
	* Returns information about the coordinates.
	*
	* @return A String containing information about the coordinates.
	*/
	@Override 
	public String toString()
	{
	    return "Stored as Polar [" + getRho() + "," + getTheta() + "]\n";
	}
}
