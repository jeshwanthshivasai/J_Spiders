public class Sum_of_Numbers {
    public static void main(String[] args)
    {
        // declare the numbers upto which summation must run
        int num = 5;
        //intialise the sum count from zero and increment
        int sum = 0;
        //for loop starts over the numbers
        for(int i=1; i < num; i++)
        {
            //add each number to the sum
            sum += i;
            //print the sum
            System.out.println(sum);
        }
    }
}