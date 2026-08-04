import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TryCatchInFinallyBlock {
    public static void main(String[] args) {
        //instead of throwing exception with main method throw in finally block by try catch block using it
        Connection con=null;
        PreparedStatement pre=null;
        ResultSet rs=null;

        try{

        }catch (Exception e){

        }finally {
            //cleanup connection result set
            try{
                rs.close();

            } catch (Exception e) {

            }
            try {
                pre.close();

            } catch (Exception e) {

            }
        }


    }
}
