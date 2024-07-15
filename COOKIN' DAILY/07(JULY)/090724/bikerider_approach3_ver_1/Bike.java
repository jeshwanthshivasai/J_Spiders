package bikerider_approach3_ver_1;

public class Bike 
{
	private String name;
	private double speed;
	private double distance;
	private double time;
	private String[] names= {"Praneesh","Mahesh","Lokesh","Aniketh"};
	
	public Bike(String name, double speed, double distance)
	{
		   if(verifyRidername(name) && verifySpeed(speed) && verifyDistance(distance))
		   {
			   System.out.println("Initialization is Successful");
		   }
		   else
		   {
			   System.err.println("Initialization is Not Successful");
		   }
	}
	private boolean verifyRidername(String name)
	{
		boolean result=false;
		for(int i=0;i<=names.length-1;i++)
		{
			if(names[i].equalsIgnoreCase(name))
			{
				this.name=name;
				result=true;
				break;
			}
		}
		if(result)
		{
			return true; 
		}
		else
	    {
	   	   System.err.println("Rider Name is not in the given Array");
	   	   return false; 
	    }
	}
		  
	private boolean verifySpeed(double speed)
	{
		if(speed>=20.0 && speed<=60.0)
		{
			this.speed=speed;
			return true;
		}
		else
		{
			System.err.println("Speed is out of Range");
	    	return false;
		}
	}
	private boolean verifyDistance(double distance)
	{
		if(distance>=5.0 && distance<=30.0)
		{
			this.distance=distance;
			return true; 
		}
		else
		{
			System.err.println("Distance is out of Range");
	    	return false;
		}
	}
	   

	public void calculateTime() 
	{
		time=distance/speed;
	}
	public void displaydetails() 
	{
		calculateTime();
		System.out.println("Biker " + name + " is driving at a speed of " + speed + " kmph " + "covers the flyover with a distance of " + distance + " kms within " + time); 
	}
}