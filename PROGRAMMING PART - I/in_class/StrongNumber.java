public class StrongNumber 
{
    public static void main(String[] args) 
    {
        int num = 145;
        int temp = num;
        int sum = 0;
        int fact = 0;

        while (temp != 0) 
        {
            int ld = temp % 10;
            for(int i=1; i <= ld; i++) 
            {
                fact = fact * i;
            }
            sum = sum + i;
            temp = temp / 10;
        }
        
        if(sum == num) 
        {
            System.out.println("Strong Number");
        } 
        else 
        {
            System.out.println("Not Strong Number");
        }
    }
}
