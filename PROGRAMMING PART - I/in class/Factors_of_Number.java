public class Factors_of_Number {
    public static void main(String[] args) 
    {
        //find factors of the number
        int number = 6;
        //Iterate over numbers from 1 to 4
        for (int i = 1; i < number; i++)
        {
            //if number is divisible by i, then it is a factor
            if(number % i == 0)
            {
                //print the factor
                System.out.println("The factor of " + number + " are " + i);
            }
        }
    }
}