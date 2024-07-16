public class Armstrong_Number 
{
    public static void main(String[] args) 
    {
        int num = 153;
        int temp = num;
        int count = 0;
        //count number of digits
        while (temp != 0) 
        {
            count++;
            temp = temp / 10;
        }
        temp = num;
        int sum = 0;
        //multiply the number count times
        while (temp != 0) 
        {
            int ld = temp % 10;
            int exponential = 1;
            for(int i=1; i<=count; i++) 
            {
                exponential = exponential * i;
            }
            sum = sum + exponential;
            temp = temp / 10;
        }
        //checking the given condition
        if (sum == num) 
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}