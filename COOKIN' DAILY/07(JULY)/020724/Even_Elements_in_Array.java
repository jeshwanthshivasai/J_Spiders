import java.util.Scanner;

public class Even_Elements_in_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<=arr.length - 1; i++) {
            System.out.println("Enter the element in an index: " + i);
            arr[i] = s.nextInt();
        }
        for(int i=0; i<=arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println("Even element present in index is: " + arr[i]);
            }
        }
    }
}
