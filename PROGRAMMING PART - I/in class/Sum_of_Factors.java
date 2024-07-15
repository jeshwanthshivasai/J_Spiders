public class Sum_of_Factors 
{
    public static void main(String[] args) 
    {
        //given number to find sum of factors
        int num = 6;
        //initialize sum from 0
        int sum = 0;
        //for loop iterating over numbers
        for(int i=1; i<num; i++) 
        {
            //checks if it is a factor or not
            if(num % i == 0) 
            {
                //prints the factors
                System.out.println(i);
                //adds to sum variable
                sum += i;
            }
        }
        //prints the sum of factors
        System.out.println(sum);
    }
}