public class UncheckedAndCheckedException {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        int i=10;
        int j=0;
        try 
        {
            int res=i/j;
            System.out.println(res);
        }
        catch(Exception e) 
        {
            System.out.println("Exception while running");
        }
    }
}