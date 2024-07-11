package Crack.Sol;
import java.util.Scanner;
public class H08_RockPagerScissors {
    public static void main(String[] args) {
     int win =0;
     int lost =0;
     int draw=0;
       for( int i=0;i<10;i++) {

           Scanner sc = new Scanner(System.in);
           int random = (int) (Math.random() * 3);
        System.out.println( random);
           System.out.println("Choice Details\n\tRock = 0 \n\tScissor = 1 \n\tPaper = 2\nEnter Choice = ");
           int sub= sc.nextInt();

           //  rock=0 scissor=1  paper=2;
           if(sub==0) {
               if( random==0) {
                   System.out.println("Draw...");
                   draw++;
               }
               else if( random==1)
               {
                   System.out.println("You Win...");
                   win++;
               }
               else {

               System.out.println("You Lost...");
               lost++;
               }
           }

           if(sub==1) {
               if( random==1){
                   System.out.println("Draw...");
                   draw++;
               }
               else if( random==2)
               {
                   System.out.println("You Win...");
                   win++;
               }
               else {

                   System.out.println("You Lost...");
                   lost++;
               }
           }

           if(sub==2) {
               if( random==2){
                   System.out.println("Draw...");
                   draw++;
               }
               else if( random==0)
               {
                   System.out.println("You Win...");
                   win++;
               }
               else {

                   System.out.println("You Lost....");
                   lost++;
               }
           }

       }

       if(win>lost) System.out.println("''''''''''''Congo!! You WIN The Match''''''''''''");
       else if(lost>win) System.out.println("''''''''''''''Opps!! You LOST The Match'''''''''''");
       else System.out.println("''''''''''''BIG DRAW'''''''''''''");
        System.out.println("You won "+win +" times\nYou Lost "+lost+" times\nYou draw "+draw+" times");
    }
}
