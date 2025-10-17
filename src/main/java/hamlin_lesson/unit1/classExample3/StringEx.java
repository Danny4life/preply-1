package hamlin_lesson.unit1.classExample3;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ada Lovelace";
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Length: " + name.length());
        System.out.println("First name: " + name.substring(0, 3));
        System.out.println("Contains 'love'? " + name.toLowerCase().contains("love"));


        String firstname = "abc";
        String lastname = "edf";

        String fullname = firstname.concat(lastname);

        System.out.println(fullname);
    }
}
