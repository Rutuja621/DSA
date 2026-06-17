public class PrintCharAtOddIdx {
    public static void main(String[] args) {
        String str="abcdefghij";
        System.out.println("Odd index characters");
        for (int i = 0; i <str.length() ; i++) {
            if(i%2!=0){
                System.out.println(str.charAt(i));
            }
        }
    }

}
