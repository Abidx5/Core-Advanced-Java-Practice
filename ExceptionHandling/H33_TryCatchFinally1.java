package ExceptionHandling;

import java.util.Scanner;

public class H33_TryCatchFinally1 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner();
        try{
            int x= 10;
            int y = 0;
            System.out.println(x/y);
        } //catch (ArithmeticException e){  //ok exception
            //System.out.println("Exception = "+e);

        catch (ArrayIndexOutOfBoundsException e){ // sub class of exception
                    System.out.println(e);
               }
        catch (Exception e2) {   // have to use this last exception its super class
              System.out.println("Exception = "+e2);
            System.out.println("Please enter v alid number");
        }


       finally {
            System.out.println("Checking...");   // exception work or not thid code will execute;
        }


    }
}
