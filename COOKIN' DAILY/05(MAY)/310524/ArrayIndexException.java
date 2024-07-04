public class ArrayIndexException {
    public static void main(String[] args) {
        int [] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        System.out.println(a[5]);
    }
}