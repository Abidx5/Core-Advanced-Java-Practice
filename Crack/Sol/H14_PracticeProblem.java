package Crack.Sol;

import java.util.Scanner;

public class H14_PracticeProblem {
 static void Multiplication(int Num){
     for(int i=1; i<=10; i++){
         System.out.print(Num +" * " + i +" = " + Num*i);
         System.out.print("\n");
     }
 }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num for Multiplication = ");
        int Num = sc.nextInt();
        Multiplication(Num);
    }
}
