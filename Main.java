
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
      
        System.out.println("First number : ");
        int a = scanner.nextInt();
        
        System.out.println("Second number : ");
        int b = scanner.nextInt();
        
        System.out.println("Thirth number : ");
        int c = scanner.nextInt();
        
       int max = -1;
       
       if (a >= b && a >= c){
           
           max = a;
       }
       else if (b >= a && b >= c){
           max = b;
           
       }
       else {
           max = c;
           
       }
       
        System.out.println("max :" + max);
       
        
    }
}
