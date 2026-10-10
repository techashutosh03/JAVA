package strings;

public class charAt {
    public static void main(String... args) {
        String firstname = "ASDF";
        String secondname = "qwrr";
        String fullname = firstname + " " + secondname;
        System.out.println(fullname);
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
