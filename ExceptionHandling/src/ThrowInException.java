class YoungerException extends RuntimeException{
    YoungerException(String msg){
        super(msg);
    }

        }

public class ThrowInException {
    public static void main(String[] args) {
        int age=16;
        if(age<18){
            throw new YoungerException("you are not eligible for voting");

        }else{
            System.out.println("You are eligible for voting");
        }

    }
}
