package ExceptionHandling;

class MyExceptionRedious extends Exception{
    @Override
    public String toString() {
        return "Area Cant be negetive";
    }

    @Override
    public String getMessage() {
        return "Area Cant be negetive";
    }
}


public class H35_ThrowThrowsCustomExcep {
    public static double area(int redious) throws MyExceptionRedious {
        if(redious<0){
            throw new MyExceptionRedious();
        }
        double result2 = Math.PI*redious*redious;
         return result2;
    }

   public static int devide(int a, int b) throws ArithmeticException {
       return a/b;
   }
    public static void main(String[] args) {
        try{
            int c= devide(6,0);
            System.out.println(c);
        } catch (Exception e){
            System.out.println(e);
        }

       try {
           double ar = area(6);
           System.out.println(ar);
       }
       catch (Exception e){
           System.out.println(e);
       }

    }
}
