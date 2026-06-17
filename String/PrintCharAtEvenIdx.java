public class PrintCharAtEvenIdx {
    public static void main(String[] args) {
        String str="abcdefghij";
        System.out.println("Even index characters");
        for (int i = 0; i <str.length() ; i++) {
            if(i%2==0){
                System.out.println(str.charAt(i));
            }
        }
    }
}
