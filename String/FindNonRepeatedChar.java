public class FindNonRepeatedChar {
    public static void main(String[] args) {
        String str="rutujaaa";

        boolean []visited=new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (visited[i]){
                continue;
            }

            for (int j = 1; j < str.length(); j++) {
                if (ch == str.charAt(j)){

                    visited[j]=true;

                }

            }

            System.out.print(ch);



        }
        //System.out.print(visited);
    }
}
