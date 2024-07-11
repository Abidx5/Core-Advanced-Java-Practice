package MultiThread;
class RunThread1 implements Runnable{
    @Override
    public void run() {
        int i=1;
        while (i<100)
            System.out.println("Cooking.....");
        i++;
    }
    }

class RunThread2 implements Runnable{
    @Override
    public void run() {
        int i=1;
       while (i<100)
           System.out.println(".....Running");
       i++;
    }
}
public class H31_RunnableImplement {
    public static void main(String[] args) {
        RunThread1 rt1= new RunThread1();
        Thread r1= new Thread(rt1);
        RunThread2 rt2 = new RunThread2();
        Thread r2 = new Thread(rt2);

        r1.start();
        r2.start();
    }
}
