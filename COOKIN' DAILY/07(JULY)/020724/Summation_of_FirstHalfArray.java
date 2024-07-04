public class Summation_of_FirstHalfArray {
    public static void sumoffirsthalf(int [] a) {
        int sum = 0;
        for(int i=0; i<a.length/2; i++) {
            sum += a[i];
        }
        System.out.println("Sum of first half of the array: " + sum);
    }
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6};
        sumoffirsthalf(a);
    }
}
