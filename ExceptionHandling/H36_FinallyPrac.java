package ExceptionHandling;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class H36_FinallyPrac {

    public static int good(){
        Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
        int b = sc.nextInt();
        int x ;
        try {
            x= a/b;
            System.out.println(x);
            return x;
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Let see its hits me or not in finally");
        }
        return 0;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
      good();
      int i=0;
      while(i<5){
          try {
              if(i==2) break;
          } catch (Exception e){
              System.out.println(e);
          }
          finally {
              System.out.println(" Lets see can heat me in break or not when i== " +i);
          }
          i++;
      }
    }


}
