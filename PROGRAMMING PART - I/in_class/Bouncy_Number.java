public class Bouncy_Number 
{
    public static void main(String[] args) 
    {
        int num = 1234567;
        int descending = 0;
        
        for(int i = 9; i >= 0; i--) 
        {
            int temp = num;

            while (temp != 0) 
            {
                int ld = temp / 10;

                if (i == ld) 
                {
                    descending = descending * 10 + ld;
                }
                temp = temp / 10;
            }
        }
        System.out.println("descending order is: " + descending);
        
        int ascending = 0;
        for(int i = 0; i <= 9; i++) 
        {
            int temp = num;

            while (temp != 0) 
            {
                int ld = temp / 10;

                if (i == ld) 
                {
                    ascending = ascending * 10 + ld;
                }
                temp = temp / 10;
            }
        }
        System.out.println("ascending order is: " + ascending);

        if(num == ascending && num == descending) {
            System.out.println("Number is Bouncy");
        }
        else {
            System.out.println("Number is not Bouncy");
        }
    }
}