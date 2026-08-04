public class CompareToANDComapreIgnoreCase {

    public static void main(String[] args) {
        String s1="A";
        String s2="a";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

    }
}
