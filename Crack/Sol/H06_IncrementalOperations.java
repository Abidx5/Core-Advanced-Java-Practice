package Crack.Sol;

public class H06_IncrementalOperations {
    public static  void main(String[] args){
        int i=0;
        System.out.println(i++);  // 1st i used then increment
        System.out.println(++i); // 1st incremant then use;
        char ch= 'A';
        System.out.println(ch++);
        System.out.println(++ch);

        System.out.println("Hi ans is=" + i);

    }
}