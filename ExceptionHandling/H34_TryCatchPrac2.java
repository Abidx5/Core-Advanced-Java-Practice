package ExceptionHandling;

import java.util.Scanner;

public class H34_TryCatchPrac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter 1st Number = ");
                int x= sc.nextInt();
                System.out.print("Enter 2nd Number = ");
                int y = sc.nextInt();
                System.out.println(x/y);


            } catch (Exception e){
                System.out.println("Exception = "+e);
                System.out.println("Enter valid number ");
            }
        }

    }
}
