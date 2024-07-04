public class StringArray {
    public static void main(String[] args) {
        String[] array = new String[3];
        
        array[0] = "jessie";
        array[1] = "ramya";
        array[2] = "yogi";

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

// public class StringArray  {
//     public static void main(String[] args) {
//         String[] array = {"jessie", "ramya", "yogi"};
//         for(int i = 0; i < array.length; i++) {
//             System.out.println(array[i]);
//         }
//     }
// }