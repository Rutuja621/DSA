class UnderAgeException extends RuntimeException{
    UnderAgeException(){
        super("You are under age");
    }

    UnderAgeException(String msg){
        super(msg);
    }
}

class CustomUncheckedException{
    public static void main(String[] args) {//throws UnderAgeExcetion

        //custome unchecked exception
        int age=16;
try {
    if (age < 18) {
        throw new UnderAgeExcetion();//this only reports the exception not handle it
    }
}catch (UnderAgeExcetion e){
    //handle the exception
    e.printStackTrace();
}
    }
}

