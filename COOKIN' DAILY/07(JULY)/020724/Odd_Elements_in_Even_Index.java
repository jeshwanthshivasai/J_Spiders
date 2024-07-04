import java.util.Scanner;

public class Odd_Elements_in_Even_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<=arr.length; i++) {
            System.out.println("Enter the element in an index: " + i);
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=arr.length; i++) {
            if((i!=0) && (i % 2 == 0) && (arr[i] % 2!= 0)) {
                System.out.println("Odd element present in even index is: " + arr[i]);
            }
        }
    }
}