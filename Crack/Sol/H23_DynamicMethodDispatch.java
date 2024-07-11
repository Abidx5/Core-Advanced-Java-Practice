package Crack.Sol;


class Phone{

   void ringTone(){
       System.out.println(" Ringing ... ");
   }
   void call(){
       System.out.println(" Callinf .... ");
   }
   void  alarm(){
       System.out.println(" Amarming ;;;;;");
   }
}

class SmartPhone extends Phone{

    @Override
   void  call(){
       System.out.println(" Calling from SmartPhone ");
   }
   @Override
    void  alarm(){
        System.out.println(" Amarming in SmartPhone ;;;;;");
    }

    void gameOn(){
        System.out.println(" Lets Start the Game.. ");
    }
}

public class H23_DynamicMethodDispatch {
    public static void main(String[] args) {
      Phone obj = new Phone();
      Phone obj2 = new SmartPhone();
      SmartPhone smt = new SmartPhone();
      obj2.ringTone();
      obj2.call();
      obj2.alarm();
     // obj2.gameOn();   not possibler
       smt.gameOn();

     // SmartPhone smt2 = new Phone(); not possible



    }
}
