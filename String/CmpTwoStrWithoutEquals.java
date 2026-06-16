public class CmpTwoStrWithoutEquals {

    public boolean cmpStrings(String str1,String str2){
        if(str1.length() != str2.length() ){
            return false;

        }

        for(int i=0;i<str2.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CmpTwoStrWithoutEquals cmp=new CmpTwoStrWithoutEquals();
        System.out.println(cmp.cmpStrings("ans","ana"));

    }
}
