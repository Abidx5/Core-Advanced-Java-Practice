package xCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HC1_Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i< n;i++){
            int in= sc.nextInt();
            list1.add(in);
        }

        list1.add(0,3);
        list1.add(1,10);
        list1.add(12);
        System.out.println("check any number coints in this array list = ");
        int check= sc.nextInt();
        System.out.println(list1.contains(check));
        System.out.println("Index = "+list1.indexOf(check));
        System.out.println("Index of 100 = "+list1.indexOf(100));

        System.out.println("Last index of 5 = "+list1.lastIndexOf(5)); // last index of that element
        //list1.clear();
        list1.remove(2); // removes
        list1.set(2, 300); // replace element

        Collections.sort(list1);

       //for(int i=0; i< list1.size(); i++){
          //  System.out.print(list1.get(i)+ " "); // for access
        //}
        for(int x : list1){
            System.out.print(x+ " ");
        }

    }
}
