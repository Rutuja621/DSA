public class NoOfSpecCharinString {
    public static void main(String[] args) {
        String str="ru%Etuja@1&2$";
        int SpecChar=0;

        for(char ch:str.toCharArray()){
            if((!(ch >='a' && ch <='z' ||  ch >='A' && ch <='Z') && !(ch >='0' && ch <='9'))){
                SpecChar++;
            }

        }
        System.out.println(SpecChar);
    }
}
