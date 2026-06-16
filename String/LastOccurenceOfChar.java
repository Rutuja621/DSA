//Find the last occurrence of a character.
public class LastOccurenceOfChar {
    public static void main(String[] args) {
        String s="rutujaa";
        char target='a';

        int index=s.lastIndexOf(target);

        if(index != -1){
            System.out.println(target+" occurs at index "+index+" from last");
        }

    }
}
