public class StringBufferEqualsORDOTEquals {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("rutuja");
        StringBuffer sb2=new StringBuffer("rutuja");



        System.out.println(sb.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(sb==sb2);
        System.out.println(sb.equals(sb2));



    }
}
