package Crack.Sol;

public class H13_VarArgs {
    /*static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }  */
     static int Sum(int ... arr ){
         int sum=0;
         for(int a: arr){
             sum+= a;
         }
         return sum;
        
     }
    public static void main(String[] args) {
        System.out.println(Sum(1));
        System.out.println(Sum(2,5));
        System.out.println(Sum(1,2,3,4,55,6));

    }
}
