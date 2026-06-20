//35. Find the frequency of every character in a string.
public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="adfvvsdd";
        boolean []visited=new boolean[str.length()];


        for (int i = 0; i < str.length(); i++) {

            if(visited[i]){
                continue;
            }
            int count=0;
            char ch=str.charAt(i);

            for (int j = 1; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                    visited[j]=true;

                }

            }

            System.out.println(ch+" : "+count);
        }

    }
}
