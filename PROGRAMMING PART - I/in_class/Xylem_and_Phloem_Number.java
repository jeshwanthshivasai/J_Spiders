public class Xylem_and_Phloem_Number {
    public static void main(String[] args) {
        int num = 3456;
        int sum1 = 0;
        int sum2 = 0;

        sum1 = sum1 + (num % 10);
        num = num / 10;

        while (num > 9) {
            int ld = num % 10;
            sum2 = sum2 + ld;
            num = num / 10;
        }

        sum1 = sum1 + num;

        if (sum1 == sum2) {
            System.out.println("Xylem");
        } else {
            System.out.println("Phloem");
        }
    }
}
