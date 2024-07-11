package Crack.Sol;
import java.util.Scanner;
public class H05_TakeInput {

    public static void main(String[] args){

        System.out.println("It works");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num = ");
        int a = sc.nextInt();



        System.out.print("Enter 2nd = ");
        int b = sc.nextInt();

        System.out.print("Enter 3nd float = ");
        float f= sc.nextFloat();

        System.out.println(a+b);
        System.out.println(f);


        String str = sc.nextLine();
        System.out.println(str);


    }
}



