package train;

public class Train 
{
	private static final String boardingPoint = "Kacheguda";
	private String destinationPoint;
	private String trainName;
	private int trainID;
	private double journeyDistance;
	private double journeyTime;
	
	public Train(String destinationPoint, String trainName, int trainID, double journeyDistance, double journeyTime) 
	{
		super();
		this.destinationPoint = destinationPoint;
		this.trainName = trainName;
		this.trainID = trainID;
		this.journeyDistance = journeyDistance;
		this.journeyTime = journeyTime;
	}
	public int destinationPoint()
	{
		return 0;
	}
	public int trainName() 
	{
		
		return 0;
	}
	public int trainID() 
	{
		return 0;
	}
	public int journeyDistance()
	{
		return 0;
	}
	public int journeyTime()
	{
		return 0;
	}
	public int displayTrainDetails()
	{
		System.out.println("The train name "+ trainName+" withnumber "+ trainID +" travelling to "+destinationPoint+" covering a distance of "+journeyDistance+" takes "+ journeyTime);
		return 0;
	}
	
 }
