public class StringImmutabilityCheck {
    public static void main(String [] arg){
        String s=new String("rutuja");
        String get=s.concat("misal");
        System.out.println(get);

        /*string in java is immutable (not changes once it is declared )
        if we try to change declared the new object is created in memory but original string remain unchanged
         */


    }
}
