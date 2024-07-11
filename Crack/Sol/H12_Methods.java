package Crack.Sol;

import java.util.Scanner;

public class H12_Methods {

    static int Add (int a,int b){
        int sum= a+b;
        return sum;
    }
    static int Add (int a,int b, int c){
        int sum = a+b+c;
        return sum;
    }


    static int mul(int a, int b){
        int multi=a*b;
        return multi;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a ,b,c=10;
        for(int i=0;i<5;i++){
            a= sc.nextInt();
            b=sc.nextInt();
            System.out.println("Sum Val = "+Add(a,b));
            System.out.println("mul Val = "+mul(a,b));
            //Method OverLoading ---------------------------
            System.out.println("2nd Sum = "+Add(a,b,c));

        }
    }
}
