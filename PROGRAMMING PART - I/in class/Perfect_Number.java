//METHOD ONE
/*public class Perfect_Number 
{
    public static void main(String[] args) 
    {
        int num = 4;
        int sum = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
            if(sum == num)
            {
                System.out.println(num + " is a perfect number");
                break;
            }
            if(sum!= num)
            {
                System.out.println(num + " is not a perfect number");
                break;
            }
        }
    }
} */

//METHOD TWO
public class Perfect_Number
{
    public static void main(String[] args)
    {
        int num = 6;
        int sum = 0;
        for(int i = 1; i<num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
            if(sum == num)
            {
                System.out.println("perfect number");
            }
            else
            {
                System.out.println("Not perfect number");
            }
        }
    }
}