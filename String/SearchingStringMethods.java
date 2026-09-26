public class SearchingStringMethods {

    public static void main(String[] args) {
        String s="rutuja";
        System.out.println(s.indexOf('t'));// returns integer value
        System.out.println(s.lastIndexOf('u'));//return last time occured char //3
        System.out.println(s.charAt(2));//return character occur at specified index
        System.out.println(s.contains("s"));//return boolean value
        System.out.println(s.startsWith("r"));//return boolean value
        System.out.println(s.endsWith("ja"));//returns boolean value

    }
}
