package runner;

public class Runner_with_Logic 
{
    private int jerseyNumber;
    private String runnerName;
    private double speed;
    private static int distance = 40;
//    private static boolean[] assignedJerseyNumbers = new boolean[100]; // Array to track assigned jersey numbers
    private static int [] arr = new int [101];
    
    private static void first()
    {
    	for(int i=0; i<arr.length; i++) 
    	{
    		arr[i] = i;
    	}
    }
    static
    {
    	first();
    }
    public void initialise(int n, double s, String nm) 
    {
    	int status = 0;
        if (n > 0 && n < 99) 
        {
        	for(int i=0; i<arr.length; i++)
        	{
        		if(arr[i] == n) 
        		{
        			arr[i]=-1;
        			status=1;
        			break;
        		}
        		
        	}
        	if(status==1)
        	{
        		jerseyNumber=n;
        	}
        	else
        	{
        		System.err.println("jersey taken");
        	}
        } 
        else 
        {
            System.err.println("Invalid or Duplicate Jersey Number");
        }
        if (s >= 10.0 && s <= 15.0) {
            speed = s;
        } 
        else 
        {
            System.err.println("Invalid Speed");
        }
        if (nm.length() >= 5)
        {
        	runnerName = nm;
        }
        else
        {
        	System.err.println("Invalid length");
        }
    }
    public double calculateTime() 
    {
        double time = distance / speed;
        return time;
    }
    public void displayRunnerDetails() 
    {
    	System.out.println("Name: " + runnerName);
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Time Taken: " + calculateTime());
        System.out.println("\n");
    }
}