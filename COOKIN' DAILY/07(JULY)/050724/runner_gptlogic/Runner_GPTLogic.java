package runner_gptlogic;
public class Runner_GPTLogic
{
    private int jerseynumber;
    private String name;
    private int id;
    private double speed;
    private static int distance = 40;
    private static boolean[] assignedJerseyNumbers = new boolean[100]; // Array to track assigned jersey numbers

    public void initialise(int jerseynumber, double speed, String name) 
    {
    	char ch = name.charAt(0);
        if (jerseynumber > 0 && jerseynumber < 99 && !assignedJerseyNumbers[jerseynumber]) 
        {
            this.jerseynumber = jerseynumber;
            assignedJerseyNumbers[jerseynumber] = true; // Mark the jersey number as assigned
        } 
        else 
        {
            System.err.println("Invalid or Duplicate Jersey Number");
        }
        if (speed >= 10.0 && speed <= 15.0) {
            this.speed = speed;
        } 
        else 
        {
            System.err.println("Invalid Speed");
        }
        if (name.length() >= 5 && Character.isUpperCase(ch))
        {
        	this.name = name;
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
    	System.out.println("Name: " + name);
        System.out.println("Jersey Number: " + jerseynumber);
        System.out.println("Speed: " + speed);
        System.out.println("Time Taken: " + calculateTime());
        System.out.println("\n");
    }
}