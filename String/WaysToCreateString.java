public class WaysToCreateString {
    public static void main(String[] args) {
        /* three ways to create string in java
        1) String class
            - creates immutable object (if we try change contents of predefined string creates new object inside memory and stores updated string )
                  concat()
            - data does not change or changes one or two times then use String
        2)StringBuffer class
            - creates mutable object(updated changes are added in original string)
                  append()
            - if data is frequently changing(like calculator,notepad etc) then use StringBuffer

            - syntax:
                    public final class StringBuffer extends AbstractStringBuilder implements Appendable, Serializable, Comparable<StringBuffer>, CharSequence{

                    }
            - Methods: length(),
                       capacity() :-  default capacity to store characters: 16,
                       append() :- add string elements to string buffer capacity remain same(default:16) if elements added
                                 - if we try add characters beyond capacity then capacity increases by double 16*2+2
                       ,reverse(),insert(),deleteCharAt(),replace(),ensureCapacity(),charAt(),indexOf(),lastIndexOf(),
                       subSequence(),toString().

            - constructors:
                   1) StringBuffer():
                   2) StringBuffer(CharSequence seq)
                   3) StringBuffer(String str)
                   4) StringBuffer(int capacity)

{
        3)StringBuilder class
         */

        StringBuffer  sb=new StringBuffer();//empty constructor
        System.out.println(sb.capacity());//defaultmcapaity 16

        sb.append("rutuja");//concat elements at end
        //sb.append("abcdefghijklm");//double the capacity whe extra elements added

        System.out.println(sb.capacity());

        System.out.println(sb.length());//returns character present in string

        sb.setLength(4);
        System.out.println(sb);//prints 4 characters only

        // sb.delete(2,5);//delete elements from 2 to 4

     ///   sb.replace(3,6,"rutu");

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());  //ensures  capacity must be 100

        sb.trimToSize();
        System.out.println(sb.capacity());//stores capacity only element are in the string and remaining is deleted

        sb.setCharAt(3,'2');//set 2 at position 3
        System.out.println(sb);

       System.out.println(sb.substring(3));//returns element from 3 we can add start and end position

        System.out.println(sb);

        System.out.println(sb.reverse());

        StringBuffer  sb1=new StringBuffer("rutuja");//string pass
       // System.out.println(sb1.capacity());//returns capacity (default capcity: 16 + no of characters in string )16+6= returns 22

        StringBuffer  sb2=new StringBuffer("rutuja");//user defined capacity
        StringBuffer sb3=sb2.append("hi");

        System.out.println(sb2.equals(sb3));//return true both points to same object

        System.out.println(sb1.equals(sb2));
        //return false it is object class method and not overrides it

        System.out.println(sb1==sb2);//returns false
/*
        String s="rutuja";
        String s1="rutuja";
        System.out.println(sb1.equals(s));//returns false
        System.out.println(sb==sb1);
*/
        //StringBuffer  sb2=new StringBuffer(1000);//user defined capacity
       // System.out.println(sb2.capacity());


    }
}
