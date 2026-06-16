public class FirstOccurenceOfChar {
    public static void main(String[] args) {
        String s="rutujaa";
        char target='a';

        int index=s.indexOf(target);

        if(index != -1){
            System.out.println("first occurence of "+target+" is : "+index);

        }else{
            System.out.println("character not found");
        }
    }
}
