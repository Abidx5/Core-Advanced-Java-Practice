package Crack.Sol;

import java.util.Scanner;

public class H10_Array {
    public static void main(String[] args) {
        int [] marks = new int[500];

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            marks[i]= a;
        }
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Array length = "+ marks.length);


  // 2D ARRAY-------------
        int [] [] arry = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int p= sc.nextInt();
                arry[i][j]= p;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arry[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
