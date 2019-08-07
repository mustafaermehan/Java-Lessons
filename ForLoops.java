
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
      /*  int i = 0;
        int j = 10;
        for(;i < 10 && j > 0 ; i++ ,j--){   // example 1
            System.out.println("i = "+ i);
            System.out.println("j = "+ j);
        }*/
        /*
        for (int i = 1; i < 100; i *= 2){   // example 2
            System.out.println("i = "+ i);
        }
        */
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter a number ");
        
        int factorial = 1;
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++){
            factorial *= i ;
        }
        System.out.println("FACTORIAL :"+ factorial);
        
        
    }
    
}
