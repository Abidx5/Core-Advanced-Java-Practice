package Crack.Sol;
import java.util.Scanner;
public class H06_Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Sub Marks = ");
         float a = sc.nextInt();
        System.out.print("Enter 2nd Sub Marks = ");
        float b = sc.nextInt();
        System.out.print("Enter 3rd Sub Marks = ");
         float c = sc.nextInt();
        System.out.print("Enter 4th Sub Marks = ");
        float d = sc.nextInt();
        System.out.print("Enter 5th Sub Marks = ");
        float e = sc.nextInt();

        float avg = (a+b+c+d+e)/5;
         // if()
        System.out.println(avg);
        //System.out.println();
    }
}
