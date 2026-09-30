package ExceptionHandling;

import java.util.Arrays;

public class ExceptionsHand{
    public static void main(String[] args) {



        try{
            System.out.println(5/2/2);
        }catch(ArithmeticException e){
            System.out.println("Something went wrong "+e.getMessage()+ "--" +e.getCause()+"--" +Arrays.toString(e.getStackTrace()) +"--"+e.getLocalizedMessage());
        }finally{
            System.out.println("I'm from finally");
        }












    }
}
