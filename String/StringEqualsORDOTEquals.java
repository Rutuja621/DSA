public class StringEqualsORDOTEquals {

    public static void main(String[] args) {
        String s=new String("rutuja");
        String s1=new String("rutuja");


        System.out.println(s.equals(s1));//true

        //reference or address comparison
        System.out.println(s==s1);//false (because there are two different objects this are pointing to different  address)











        //  (not pointing to same object)









        /*
        the string and stringbuffer classes child of object class and the the method called .equal is used to point address and reference in object class
         when we use this method for another classes string it is used for content comparison(because  this method is pointing to the same object )

         While both String and StringBuffer are children of the Object class, they handle the .equals() method differently:
         Object Class: The default .equals() method performs reference comparison (checking if both variables point to the exact same memory address).
         String Class: This class overrides the .equals() method to perform content comparison. It checks if the actual sequence of characters is identical, regardless of memory address.
         StringBuffer Class: Unlike String, the StringBuffer class does not override the .equals() method. Therefore, it still uses the default Object version, which performs reference comparison


         */

    }
}
