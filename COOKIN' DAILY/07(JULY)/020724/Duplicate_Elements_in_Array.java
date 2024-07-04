public class Duplicate_Elements_in_Array {
    public static void duplicates(int [] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    System.out.println("Duplicate element found: " + a[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 2, 3, 4};
        duplicates(a);
    }
}