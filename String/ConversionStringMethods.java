public class ConversionStringMethods {
    public static void main(String[] args) {
        String s="rutuja";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //Type Conversion Methods(casting)
        int val=10 ,val2=20;
        System.out.println(val+val2);
        String s1=String.valueOf(val);//int to string
        String s2=String.valueOf(val2);//a string representation of the int argument.
        System.out.println(s1+s2);

        char[] ch=s.toCharArray();//converts string to char array
        System.out.println(ch);


    }
}
