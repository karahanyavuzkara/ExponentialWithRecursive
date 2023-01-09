import java.util.Scanner;
public class ExponentialWithRecursive {

     static void expo() {
         int result = 1;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the base number : ") ;
         int base = input.nextInt();
         System.out.println("Enter the power number : ");
         int power = input.nextInt();


         for (int i = 1 ; i <= power ; i++) {

              result *= base;

         }
         System.out.println("Result : " + result);
     }

      public static void main(String[]args) {
         expo();

      }
}
