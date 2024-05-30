// public class StringObject {
//     public static void main(String[] args) {
//         String s = "jesse";
//         System.out.println(s.length());
//         System.out.println("\n");
//         System.out.println(s.charAt(0));
//         System.out.println(s.charAt(1));
//         System.out.println(s.charAt(2));
//         System.out.println(s.charAt(3));
//         System.out.println(s.charAt(4));
//     }
// }

// public class StringObject {
//     public static void main(String[] args) {
//         String s = "Hello, World!";
//         System.out.println(s.length());
//         for (int i = 0; i < s.length(); i++) {
//             System.out.println(s.charAt(i));
//         }
//     }
// }

// Reverse String
// public class StringObject {
//     public static void main(String[] args) {
//         String s = "jeshwanthshivasai";
//         System.out.println(s.length());
//         for (int i = s.length() - 1; i >= 0; i--) {
//             System.out.println(s.charAt(i));
//         }
//     }
// }

//String is palindrome or not (CASE-1)
public class StringObject {
    public static void main(String[] args) {
        String s1 = "jeshwanthshivasai";
        System.out.println(s1.length() + " characters are there in your name.");
        //print in ascending order
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println("Your name in ascending order " + s1);
        //print in descending order
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("Your name in descending order " + s2);
        if (s1.equals(s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO"); 
        }
    }
}

//String is palindrome or not (CASE-2)
public class StringObject {
    
}