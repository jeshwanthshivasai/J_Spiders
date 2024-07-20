public class Ascending_Order 
{
    public static void main(String[] args) 
    {
        int num = 231;
        int answer = 0;
        //loop through 0 - 9
        for (int i = 0; i <= 9; i++) 
        {
            int temp = num;

            while (temp != 0) 
            {
                int ld = temp / 10;

                if (i == ld) 
                {
                    answer = answer * 10 + ld;
                }
                temp = temp / 10;
            }
        }
        System.out.println(answer);
    }
}