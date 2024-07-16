public class Product_of_Numbers {
    public static void main(String[] args) 
    {
        //print the product of all numbers from 1 to 5
        int num = 5;
        //obviously from 1 else everything turns out 0
        int product = 1;
        //loop from 1 to num and multiply to the product
        for(int i = 1; i <= num; i++)
        {
            //print the product of all numbers
            product *= i;
            //print product
            System.out.println(product);
        }
    }
}