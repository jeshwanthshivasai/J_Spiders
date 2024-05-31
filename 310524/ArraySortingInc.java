public class ArraySortingInc {
    public static void main(String[] args) {
        int[] a = {10, 21, 34, 86, 98, 5, 84, 63};
        int temp = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
        }
    }
}
