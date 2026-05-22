public class StringBuiderCheck {
    public static void main(String[] args) {

        /*
        Another concept called StringBuilder is mutable used overcome String immutability
        there are various methods in StringBuilder
        append(): used connect the two strings
        length()
        capacity()
        charAt()
        getCharAt()
        insert()
        delete()
        reverse()
        ensureCapacity()
        getLength()
        trimTOSize()
        deleteCharAt():  
         */

        StringBuffer sb=new StringBuffer("rutuja");
        sb.append("misal");
        System.out.println(sb);
    }
}
