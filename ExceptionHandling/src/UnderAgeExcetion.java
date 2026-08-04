public class UnderAgeExcetion extends Exception{
    UnderAgeExcetion(){
       super("You are under age");
    }

    UnderAgeExcetion(String msg){
       super(msg);
    }
}

class Voting{
    public static void main(String[] args) throws UnderAgeExcetion{//throws UnderAgeExcetion
        int age=16;

           if (age < 18) {
                //if we are not use try and catch for checked exception it gives error unreported exeption
                //if we want to handle this exception use try catch block
                // or we can use throws keyword to report this Exception
                throw new UnderAgeExcetion();//custom checked exception
            }


        /*try { // not need to use throws here
            if (age < 18) {
               throw new UnderAgeExcetion();

            }
        }catch (UnderAgeExcetion e){
            e.printStackTrace();

        }*/



    }
}
