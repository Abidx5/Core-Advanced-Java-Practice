package MultiThread;

class MyThread1 extends Thread{
 @Override
 public void run(){
     int i=0;
     while(i<500){
         System.out.println("()...Taking Rest...()");
         i++;
     }
 }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
       while(i<500){
           System.out.println("Cooking.....");
           i++;
       }
    }
}

public class H30_ThreadExtend {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }

}
