package ExceptionHandling;

public class H34_NestedTryCatch {
    public static void main(String[] args) {
        int x= 10;
        int y= 0;
        try {
            System.out.println("Exception in level 1");
            try {
                System.out.println(x/y);

            }catch (Exception e1) {
                System.out.println("Sorry its an exception L2 ");
            }
        } catch ( Exception e2){
            System.out.println("Sorry its an Exception L1 ");
        }
        System.out.println("Continue//....");
    }
}
