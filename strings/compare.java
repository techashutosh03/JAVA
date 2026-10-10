package strings;

public class compare {
    public static void main(String... args) {
        String name1 = "hello";
        String name2 = "wello";

        // s1 < s2 it will give + value
        // s1 == s2 it will give you 0 value
        // s1 > s2 it will give - value

        if (name1.compareTo(name2) == 0) {
            System.out.println("not");
        } else {
            System.out.println("yes");
        }
    }
}
