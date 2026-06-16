// Count the occurrences of a particular character

public class CntOccurencesOfChar {
    public static void main(String[] args) {
        String s="rutujaa";
       /* char target='u';
        int count =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == target){
                count++;
            }


        }
        System.out.println("u occurs "+count+" times in a string");*/



        int[] counts = new int[256];


        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }


        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) i + ": " + counts[i]);
            }
        }

    }
}
